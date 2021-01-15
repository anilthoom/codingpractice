package com.anilt.word;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;;
public class CreateWorkBook 
{
   public static void main(String[] args)throws Exception 
   {
      //Create Blank workbook
      XSSFWorkbook wb = new XSSFWorkbook(); 
      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(
      new File("c:\\createworkbook.docx"));
      //write operation workbook using file out object 
      wb.write(out);
      out.close();
      System.out.println("createworkbook.docx written successfully");
   }
}