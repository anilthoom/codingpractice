package com.anilt.word;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.HWPFDocumentCore;
import org.apache.poi.hwpf.converter.WordToHtmlConverter;
import org.apache.poi.hwpf.converter.WordToHtmlUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.w3c.dom.Document;


public class WordToHTML 
{
	public static void main(String args[]) throws IOException 
	{
		try 
		{
			InputStream input = new FileInputStream("C:\\HTML.doc");
		    HWPFDocument wordDocument = new HWPFDocument(input);
//		    XWPFDocument wordDocument = new XWPFDocument(input);
	        WordToHtmlConverter wordToHtmlConverter = new WordToHtmlConverter(DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument());
	        wordToHtmlConverter.processDocument(wordDocument);
	        Document htmlDocument = wordToHtmlConverter.getDocument();
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        DOMSource domSource = new DOMSource(htmlDocument);
	        StreamResult streamResult = new StreamResult(out);
	        TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer serializer = tf.newTransformer();
	        serializer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	        serializer.setOutputProperty(OutputKeys.INDENT, "yes");
	        serializer.setOutputProperty(OutputKeys.METHOD, "html");
	        serializer.transform(domSource, streamResult);
	        out.close();
	        String result = new String(out.toByteArray());
	        System.out.println(result);
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		 
		 }

}
