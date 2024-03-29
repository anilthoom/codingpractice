package com.anilt.poi.word;

/**
 * Demonstrates how to add pictures in a .docx document
 */
public class SimpleImages {

   /* public static void main(String[] args) throws IOException, InvalidFormatException {
        XWPFDocument doc = new XWPFDocument();
        XWPFParagraph p = doc.createParagraph();

        XWPFRun r = p.createRun();
        String arr[] = {"Desert.jpg", "Hydrangeas.jpg"};
        for(String imgFile : arr) {
            int format;

            if(imgFile.endsWith(".emf")) format = XWPFDocument.PICTURE_TYPE_EMF;
            else if(imgFile.endsWith(".wmf")) format = XWPFDocument.PICTURE_TYPE_WMF;
            else if(imgFile.endsWith(".pict")) format = XWPFDocument.PICTURE_TYPE_PICT;
            else if(imgFile.endsWith(".jpeg") || imgFile.endsWith(".jpg")) format = XWPFDocument.PICTURE_TYPE_JPEG;
            else if(imgFile.endsWith(".png")) format = XWPFDocument.PICTURE_TYPE_PNG;
            else if(imgFile.endsWith(".dib")) format = XWPFDocument.PICTURE_TYPE_DIB;
            else if(imgFile.endsWith(".gif")) format = XWPFDocument.PICTURE_TYPE_GIF;
            else if(imgFile.endsWith(".tiff")) format = XWPFDocument.PICTURE_TYPE_TIFF;
            else if(imgFile.endsWith(".eps")) format = XWPFDocument.PICTURE_TYPE_EPS;
            else if(imgFile.endsWith(".bmp")) format = XWPFDocument.PICTURE_TYPE_BMP;
            else if(imgFile.endsWith(".wpg")) format = XWPFDocument.PICTURE_TYPE_WPG;
            else {
                System.err.println("Unsupported picture: " + imgFile +
                        ". Expected emf|wmf|pict|jpeg|png|dib|gif|tiff|eps|bmp|wpg");
                continue;
            }

            r.setText(imgFile);
            r.addBreak();
            r.addPicture(new FileInputStream(imgFile), format, imgFile, Units.toEMU(200), Units.toEMU(200)); // 200x200 pixels
            //r.addBreak(BreakType.PAGE);
            r.addBreak();
        }

        FileOutputStream out = new FileOutputStream("images.docx");
        doc.write(out);
        out.close();
        System.out.println("Done");
//        doc.close();
    }

*/
}