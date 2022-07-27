package com.anilt.poi.word;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WordExtractor {

   public static void main(String[] args)throws Exception {
	   System.out.println("HELLO");
      XWPFDocument docx = new XWPFDocument(new FileInputStream("c:\\MyWork\\OpenText_Partner_Master_Agreement_-_EMEA_Current_Partner.docx"));
      
      //using XWPFWordExtractor Class
      XWPFWordExtractor we = new XWPFWordExtractor(docx);
      System.out.println(we.getText());
      createDoc(we.getText());
      
   }
   static boolean createDoc(String content) throws IOException
   {
	   
	 //Blank Document
       XWPFDocument document = new XWPFDocument();
       //Write the Document in file system
       FileOutputStream out = new FileOutputStream(
               new File("c:\\MyWork\\BOOKKKK.docx"));

       //create Paragraph
       XWPFParagraph paragraph = document.createParagraph();
       XWPFRun run = paragraph.createRun();
       run.setText("VK Number (Parameter): " + content + " here you type your text...\n");
       document.write(out);
      
       //Close document
       out.close();
       System.out.println("createdWord.docx written successfully");
       return true;
   }
}