package docx4j.samples;

import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.bind.JAXBContext;

import org.docx4j.XmlUtils;
import org.docx4j.model.datastorage.BindingHandler;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;


/**
 * This simple example demonstrates 
 * populating content controls with values
 * obtained from a Custom XML file in
 * the docx.
 * 
 * There will only be something to do
 * if the content in the XML part
 * is different from the content 
 * in the content control pointing to it.
 * 
 * Word does this itself automatically (its
 * a 2 way association, so if the user edits
 * the document in Word, Word updates the XML part), but if you
 * have a Word document containing content controls,
 * this sample demonstrates how you could
 * populate those programmatically.  You might
 * then use docx4j to generate a pdf or an html.
 * 
 * In the real world, you are likely to
 * want to change the data.  For how to do that,
 * see:
 * - ContentControlsXmlEdit
 * - https://github.com/plutext/OpenDoPE-WAR/blob/master/webapp-simple/src/main/java/org/opendope/webapp/SubmitBoth.java
 * 
 * You're also likely to want to 'repeat' data,
 * and conditionally exclude paragraphs.  See 
 * ContentControlBindingExtensions for more on that.
 */
public class ContentControlsApplyBindings {
	
	public static JAXBContext context = org.docx4j.jaxb.Context.jc; 

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		String hyperlinkStyle = "Hyperlink";
		
		// Convenient to read from .xml file,
		// so it is easy to manually edit it (ie without having to unzip etc etc) 
		String inputfilepath = System.getProperty("user.dir") + "/src/binding-simple.docx";

		String outputfilepath = System.getProperty("user.dir") + "/src/OUT_ContentControlsApplyBindings.docx";

		// Load the Package
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(inputfilepath));
		
		// Apply the bindings
		
		if (hyperlinkStyle!=null) {
			BindingHandler.getHyperlinkResolver().setHyperlinkStyle(hyperlinkStyle);
		}
		
		BindingHandler bh = new BindingHandler(wordMLPackage);
		bh.applyBindings(wordMLPackage.getMainDocumentPart());
		
		// If you inspect the output, you should see your data in 2 places:
		// 1. the custom xml part 
		// 2. (more importantly) the main document part
		System.out.println(
				XmlUtils.marshaltoString(wordMLPackage.getMainDocumentPart().getJaxbElement(), true, true)
				);
		
		// Strip content controls
		// RemovalHandler rh = new RemovalHandler(); // NB: this only removes if OpenDoPE tags are present (they aren't in binding-simple.docx)
		
		wordMLPackage.save(new java.io.File(outputfilepath) );
	}
		

}