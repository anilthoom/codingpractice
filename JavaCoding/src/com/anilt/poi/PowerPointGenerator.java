package com.anilt.poi;

import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
public class PowerPointGenerator {

    public static void main(String[] args) {
        XMLSlideShow ppt = new XMLSlideShow();
        try(OutputStream os = new FileOutputStream("Javatpoint.pptx")) {
            ppt.write(os);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}