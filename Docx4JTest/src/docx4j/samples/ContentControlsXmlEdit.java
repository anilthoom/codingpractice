package docx4j.samples;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;

import org.docx4j.XmlUtils;
import org.docx4j.model.datastorage.BindingHandler;
import org.docx4j.model.datastorage.CustomXmlDataStorage;
import org.docx4j.model.datastorage.CustomXmlDataStorageImpl;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.CustomXmlDataStoragePart;


/**
 * This sample demonstrates setting the XML content of
 * an Custom XML part, then populating content controls
 * from that (based on the xpaths given
 * in the content controls).
 * 
 * Word does this itself automatically, but if you
 * have a Word document containing content controls,
 * this sample demonstrates how you could
 * populate those programmatically.  You might
 * then use docx4j to generate a pdf or an html.
 */
public class ContentControlsXmlEdit {
	
	public static JAXBContext context = org.docx4j.jaxb.Context.jc; 

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		String example_value_to_inject = "THE NEW CONTENT";

		// Convenient to read from .xml file,
		// so it is easy to manually edit it (ie without having to unzip etc etc) 
		String inputfilepath = System.getProperty("user.dir") + "/src/binding-simple.docx";

		String outputfilepath = System.getProperty("user.dir") + "/src/OUT_ContentControlsXmlEdited.docx";

		// Load the Package
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(inputfilepath));
		
		// Get the part
		// First we need to get the part.  There are a few different ways to do this.
		
		// If we know the itemId ..
		String itemId = "{5448916C-134B-45E6-B8FE-88CC1FFC17C3}".toLowerCase();
		CustomXmlDataStoragePart customXmlDataStoragePart = (CustomXmlDataStoragePart)wordMLPackage.getCustomXmlDataStorageParts().get(itemId);
		System.out.println(wordMLPackage.getPartName().getName());
		// .. if you don't know the itemId (which you can get using ContentControlsPartsInfo), 
		// you could get the part by name, by type,
		// or you could find the item Id by looking in an SDT for w:storeItemID:
		//  <w:sdt>
		//    <w:sdtPr>
		//      <w:dataBinding w:prefixMappings="" w:xpath="/myxml[1]/element1[1]" 
		//					w:storeItemID="{5448916C-134B-45E6-B8FE-88CC1FFC17C3}"/>
		//    </w:sdtPr>
		//    <w:sdtContent>		
		
		// Get the contents		
		CustomXmlDataStorage customXmlDataStorage = customXmlDataStoragePart.getData();
			// In a real program what you might do is populate this with your own data.
			// You could replace the whole part (as is done in https://github.com/plutext/OpenDoPE-WAR/blob/master/webapp-simple/src/main/java/org/opendope/webapp/SubmitBoth.java ),
		    // or as we show below, just set some particular value
		
				
		// Change its contents.  Here we use XPath, but you could get the DOM document:
		//   ((CustomXmlDataStorageImpl)customXmlDataStorage).getDocument()
		// and do whatever ....
		((CustomXmlDataStorageImpl)customXmlDataStorage).setNodeValueAtXPath("/myxml/element1", example_value_to_inject,
				"xmlns:ns0='http://your.namespace'"); // no prefix mappings required here, but that shows you how to do it
		InputStream inputstream = new FileInputStream("C:\\sample.xml");
//		((CustomXmlDataStorageImpl)customXmlDataStorage).setDocument(inputstream);
		System.out.println(XmlUtils.w3CDomNodeToString(customXmlDataStorage.getDocument()));
		
		// Apply the bindings
		BindingHandler bh = new BindingHandler(wordMLPackage);
		bh.applyBindings(wordMLPackage.getMainDocumentPart());
		
		// If you inspect the output, you should see your data in 2 places:
		// 1. the custom xml part 
		// 2. (more importantly) the main document part
		System.out.println(
				XmlUtils.marshaltoString(wordMLPackage.getMainDocumentPart().getJaxbElement(), true, true)
				);
		
		
		wordMLPackage.save(new java.io.File(outputfilepath) );
	}
		

}