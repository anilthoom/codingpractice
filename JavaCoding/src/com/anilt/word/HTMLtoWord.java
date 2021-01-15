package com.anilt.word;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class HTMLtoWord
{
	public static void main(String[] argv) throws Exception 
	{
	      BufferedReader br = new BufferedReader(new FileReader("commit.htm"));
	      BufferedWriter bw = new BufferedWriter(new FileWriter("commit.doc"));
	      int i;
	     
	      do {
	        i = br.read();
	        if (i != -1) {
	         
	            bw.write((char) i);
	        }
	      } while (i != -1);
	      br.close();
	      bw.close();
	      //createDoc();
	  }
	public static void createDoc() throws Exception
	{
		FileWriter fw = new FileWriter("Test.docx");
		fw.write("HELLO");
		fw.close();
	}
}


