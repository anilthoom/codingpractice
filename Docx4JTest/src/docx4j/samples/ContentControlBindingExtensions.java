package docx4j.samples;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;

import org.docx4j.Docx4J;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;


/**
 * This sample demonstrates populating content controls
 * from a custom xml part (based on the xpaths given
 * in the content controls), via FLAG_BIND_BIND_XML
 * 
 * Word does this itself automatically, for if there is
 * a w:databinding element in the sdtPr.
 * 
 * However, out of the box, Word doesn't allow for
 * repeating things (table rows, paragraphs etc), nor
 * conditional inclusion/exclusion.
 * 
 * The OpenDoPE conventions support that; and this sample 
 * demonstrates docx4j's implementation of that.
 * 
 * In practice you'll want the XML part to be injected at runtime.  
 * For that, use FLAG_NONE, or include FLAG_BIND_INSERT_XML.
 * 
 * See description of flags below.
*/
public class ContentControlBindingExtensions {
	
	public static JAXBContext context = org.docx4j.jaxb.Context.jc; 

	static String filepathprefix;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
//		String input_DOCX = System.getProperty("user.dir") + "/sample-docs/word/databinding/CountryRegions.xml";
		
		String input_DOCX = System.getProperty("user.dir") + "/src/invoice.docx";
		String input_XML = System.getProperty("user.dir") + "/src/invoice-data.xml";

		
		// resulting docx
		String OUTPUT_DOCX = System.getProperty("user.dir") + "/src/OUT_ContentControlsMergeXML.docx";

		// Load input_template.docx
		WordprocessingMLPackage wordMLPackage = Docx4J.load(new File(input_DOCX));

		// Open the xml stream
		FileInputStream xmlStream = new FileInputStream(new File(input_XML));

		// Do the binding:
		// FLAG_NONE means that all the steps of the binding will be done,
		// otherwise you could pass a combination of the following flags:
		// FLAG_BIND_INSERT_XML: inject the passed XML into the document
		// FLAG_BIND_BIND_XML: bind the document and the xml (including any OpenDope handling)
		// FLAG_BIND_REMOVE_SDT: remove the content controls from the document (only the content remains)
		// FLAG_BIND_REMOVE_XML: remove the custom xml parts from the document 
			
		//Docx4J.bind(wordMLPackage, xmlStream, Docx4J.FLAG_NONE);
		//If a document doesn't include the Opendope definitions, eg. the XPathPart,
		//then the only thing you can do is insert the xml
		//the example document binding-simple.docx doesn't have an XPathPart....
		Docx4J.bind(wordMLPackage, xmlStream, Docx4J.FLAG_BIND_INSERT_XML | Docx4J.FLAG_BIND_BIND_XML);// | Docx4J.FLAG_BIND_REMOVE_SDT);
		
		//Save the document 
		Docx4J.save(wordMLPackage, new File(OUTPUT_DOCX), Docx4J.FLAG_NONE);
		System.out.println("Saved: " + OUTPUT_DOCX);
	}	
	
				

}