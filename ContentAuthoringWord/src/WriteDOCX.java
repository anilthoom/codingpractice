import java.io.FileInputStream;
import java.io.FileOutputStream;

//import org.apache.poi.POIOLE2TextExtractor;
//import org.apache.poi.POITextExtractor;
import org.apache.poi.extractor.ExtractorFactory;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;

public class WriteDOCX {
	public static void main(String[] args) throws Exception 
	{
//		writeDocX();
		//wordExtraction();
	}
	/*
	public static void wordExtraction() throws Exception
	{
		FileInputStream fis = new FileInputStream("write-test.docx");
		POIFSFileSystem fileSystem = new POIFSFileSystem(fis);
		// Firstly, get an extractor for the Workbook
		POIOLE2TextExtractor oleTextExtractor = 
		   ExtractorFactory.createExtractor(fileSystem);
		// Then a List of extractors for any embedded Excel, Word, PowerPoint
		// or Visio objects embedded into it.
		POITextExtractor[] embeddedExtractors =
		   ExtractorFactory.getEmbededDocsTextExtractors(oleTextExtractor);
		for (POITextExtractor textExtractor : embeddedExtractors) {
		   // A Word Document
		   if (textExtractor != null) 
		   {
			  System.out.println(textExtractor.getText());
		     /* WordExtractor wordExtractor = (WordExtractor) textExtractor;
		      String[] paragraphText = wordExtractor.getParagraphText();
		      for (String paragraph : paragraphText) {
		         System.out.println(paragraph);
		      }
		      // Display the document's header and footer text
		      System.out.println("Footer text: " + wordExtractor.getFooterText());
		      System.out.println("Header text: " + wordExtractor.getHeaderText());
		   }
		}
	}
	*/
	public static void writeDocX()
	{
		   try {
				XWPFDocument docx = new XWPFDocument();
			        CTSectPr sectPr = docx.getDocument().getBody().addNewSectPr();
				XWPFHeaderFooterPolicy policy = new XWPFHeaderFooterPolicy(docx, sectPr);
				//write header content
				CTP ctpHeader = CTP.Factory.newInstance();
			        CTR ctrHeader = ctpHeader.addNewR();
				CTText ctHeader = ctrHeader.addNewT();
				String headerText = "This is header";
				ctHeader.setStringValue(headerText);	
				XWPFParagraph headerParagraph = new XWPFParagraph(ctpHeader, docx);
			        XWPFParagraph[] parsHeader = new XWPFParagraph[1];
			        parsHeader[0] = headerParagraph;
			        policy.createHeader(XWPFHeaderFooterPolicy.DEFAULT, parsHeader);
			        
				//write footer content
				CTP ctpFooter = CTP.Factory.newInstance();
				CTR ctrFooter = ctpFooter.addNewR();
				CTText ctFooter = ctrFooter.addNewT();
				String footerText = "This is footer";
				ctFooter.setStringValue(footerText);	
				XWPFParagraph footerParagraph = new XWPFParagraph(ctpFooter, docx);
			        XWPFParagraph[] parsFooter = new XWPFParagraph[1];
			        parsFooter[0] = footerParagraph;
				policy.createFooter(XWPFHeaderFooterPolicy.DEFAULT, parsFooter);
					
				//write body content
				XWPFParagraph bodyParagraph = docx.createParagraph();
				bodyParagraph.setAlignment(ParagraphAlignment.CENTER);
				XWPFRun r = bodyParagraph.createRun();
				r.setBold(true);
			        r.setText("This is body content.");
					
			        FileOutputStream out = new FileOutputStream("write-test.docx");
			        docx.write(out);
			        out.close();
			        System.out.println("Done");
			    } catch (Exception ex) {
				   ex.printStackTrace();
			    }
	}
} 