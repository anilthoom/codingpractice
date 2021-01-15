package com.anilt.ectd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ECTD_xmlTOjson {
	public static String getTreeObject(String filePath)
    {
    	//String docUrl =  getDocUrl(EntityItemId);
    	return generateTreeFromDocUrl(filePath);
    }
	
	private static String generateTreeFromDocUrl(String docUrl) {
		FileInputStream is=null;
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		Element sRootElement = null;
		org.w3c.dom.Document xmlDocument = null;
		String str="";
		try {
			is = new FileInputStream(new File(docUrl));
			DocumentBuilder docBuilder = dbfactory.newDocumentBuilder();
			xmlDocument = docBuilder.parse(is);
			sRootElement  =  xmlDocument.getDocumentElement();
			str= generateTreeResponse(sRootElement);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (Exception e) {
			
		}
    	
    	
    	
        return str;
	}
	
	public static void main(String[] args) {
		System.out.print(getTreeObject("C:\\MyWork\\OT\\LS\\DTD\\ectdox\\0000\\index.xml"));
	}
	
	private static String generateTreeResponse(Element iRootElement) {
		org.w3c.dom.Node lNode = iRootElement.cloneNode(true);
		XmlNode xNode = new XmlNode();
                xNode.setText(iRootElement.getNodeName());
		xNode = generateTree(lNode, xNode);
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr = "";
		try {
			jsonStr = Obj.writeValueAsString(xNode);
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
		return jsonStr;
    }
	
	 private static XmlNode generateTree(org.w3c.dom.Node iNode, XmlNode xNode) {
	    	if("#text".equalsIgnoreCase(iNode.getNodeName()) || "title".equalsIgnoreCase(iNode.getNodeName()) ) return xNode;
	    	NodeList lRootNodeList = iNode.getChildNodes();
	    	for(int i=0;i<lRootNodeList.getLength();i++) {
	    		org.w3c.dom.Node lCurrentNode = lRootNodeList.item(i);
	    		if(!("#text".equalsIgnoreCase(lCurrentNode.getNodeName()) || "title".equalsIgnoreCase(lCurrentNode.getNodeName()))) {
	    			XmlNode lXNode = new XmlNode();	
	                        lXNode.setText(lCurrentNode.getNodeName());   
	    			//if(lXNode.getText().equalsIgnoreCase("leaf")) lXNode.setLeaf(true);
	    			NamedNodeMap map = lCurrentNode.getAttributes();
		    		if(map!=null) {
		    			HashMap<String,String> hmap = new HashMap<String,String>();
		    			for(int j=0;j<map.getLength();j++) {
		    				hmap.put(map.item(j).getNodeName(), map.item(j).getTextContent());
		    			}
		    			if(hmap.containsKey("xlink:href")) {
		    				HashMap<String,String> aMap = new HashMap<String,String>();
		    				aMap.put("href", "http://www.africau.edu/images/default/sample.pdf");
		    				aMap.put("target", "_blank");
		    				lXNode.setA_attr(aMap);
		    				lXNode.setIcon("https://image.flaticon.com/icons/svg/337/337946.svg");
		    				int p=0;
		    				while(true) {
		    					if(lCurrentNode.getChildNodes().item(p).getNodeName().equalsIgnoreCase("#text")) {
		    						p++;
		    					}else {
		    						lXNode.setText(lCurrentNode.getChildNodes().item(p).getTextContent());
		    						break;
		    					}
		    				}	    				
		    			}
		    			lXNode.setLi_attr(hmap);
		    		}
		    		xNode.addChildNode(lXNode);
		    		generateTree(lCurrentNode,lXNode);
	    		}
	    		
	    	}
	    	return xNode;
	    }
}


class XmlNode{
	private String text;
	private HashMap<String,String> li_attr;
	private HashMap<String,String> a_attr;
	private String icon;
	private List<XmlNode> children;
	
	public XmlNode(String text) {
		this.text = text;
	}
	
	public XmlNode() {
	}
	
	
	public void addChildNode(XmlNode node) {
		if(this.children==null) {
			this.children = new ArrayList<XmlNode>();
		}
		this.children.add(node);
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}

	public HashMap<String,String> getLi_attr() {
		return li_attr;
	}

	public void setLi_attr(HashMap<String,String> li_attr) {
		this.li_attr = li_attr;
	}

	public HashMap<String, String> getA_attr() {
		return a_attr;
	}

	public void setA_attr(HashMap<String, String> a_attr) {
		this.a_attr = a_attr;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<XmlNode> getChildren() {
		return children;
	}


	public void setChildren(List<XmlNode> children) {
		this.children = children;
	}	
}