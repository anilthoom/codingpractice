package com.anilt.java.features;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class DocumentBuilderDemo {

   public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException, URISyntaxException {

      // create a new DocumentBuilderFactory
     /* DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

      try {
         // use the factory to create a documentbuilder
         DocumentBuilder builder = factory.newDocumentBuilder();

         // create a new document from input source
         FileInputStream fis = new FileInputStream("C:\\quizzes\\java-quiz-1.xml");
         InputSource is = new InputSource(fis);
         Document doc = builder.parse(is);

         // get the first element
         Element element = doc.getDocumentElement();

         // get all child nodes
         NodeList nodes = element.getChildNodes();

         // print the text content of each child
         for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println("" + nodes.item(i).getTextContent());
         }
      } catch (Exception ex) {
         ex.printStackTrace();
      }*/
	   
	   Document document = getDOM("");
	   System.out.println("########################## : "+document.getElementsByTagName("title").item(0).getTextContent());
	   
   }
   public static Document getDOM(String test) throws SAXException,ParserConfigurationException,IOException, URISyntaxException
	{
		    Document dom=null;
		    File quizFile=null;
		    
	        quizFile=new File("C:\\quizzes\\java-quiz-1.xml");
	        System.out.println("Quiz File Absolute Path "+quizFile.getAbsolutePath());
	         
	   DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
	   DocumentBuilder db=dbf.newDocumentBuilder();
	   try{
	        dom=db.parse(quizFile);
	   }catch(FileNotFoundException fileNotFound){
		   System.out.println("Error : Quiz File Not Found "+fileNotFound);
	   }
	   dom.getDocumentElement().normalize();
	   return dom;
	}
}
