package com.anilt.poi.word;

public class Find_Replace_DOCX {
/*
    public static void main(String args[]) throws IOException,
      InvalidFormatException,
      org.apache.poi.openxml4j.exceptions.InvalidFormatException {
     try {

      *//**
       * if uploaded doc then use HWPF else if uploaded Docx file use
       * XWPFDocument
       *//*
      XWPFDocument doc = new XWPFDocument(
        OPCPackage.open("input.docx"));
      for (XWPFParagraph p : doc.getParagraphs()) {
       List<XWPFRun> runs = p.getRuns();
       if (runs != null) {
        for (XWPFRun r : runs) {
         String text = r.getText(0);
         if (text != null && text.contains("$$key$$")) {
          text = text.replace("$$key$$", "ANIL KUMAR THOOM");//your content
          r.setText(text, 0);
         }
        }
       }
      }

      for (XWPFTable tbl : doc.getTables()) {
       for (XWPFTableRow row : tbl.getRows()) {
        for (XWPFTableCell cell : row.getTableCells()) {
         for (XWPFParagraph p : cell.getParagraphs()) {
          for (XWPFRun r : p.getRuns()) {
           String text = r.getText(0);
           if (text != null && text.contains("$$key$$")) {
            text = text.replace("$$key$$", "THOOM ANIL KUMAR");
            r.setText(text, 0);
           }
          }
         }
        }
       }
      }

      doc.write(new FileOutputStream("output.docx"));
     } finally {

     }

    }*/

   }