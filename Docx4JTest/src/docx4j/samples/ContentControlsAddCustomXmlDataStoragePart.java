package docx4j.samples;

import java.util.UUID;

import org.docx4j.XmlUtils;
import org.docx4j.customXmlProperties.DatastoreItem;
import org.docx4j.model.datastorage.CustomXmlDataStorage;
import org.docx4j.model.datastorage.CustomXmlDataStorageImpl;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.CustomXmlDataStoragePart;
import org.docx4j.openpackaging.parts.CustomXmlDataStoragePropertiesPart;
import org.docx4j.openpackaging.parts.Part;
import org.docx4j.openpackaging.parts.relationships.RelationshipsPart.AddPartBehaviour;

/**
 * Creates a docx containing a CustomXml part.
 * 
 * See ContentControlsMergeXML, and
 * https://github.com/plutext/OpenDoPE-WAR/blob/master/webapp-simple/src/main/java/org/opendope/webapp/SubmitBoth.java
 * for a servlet which injects XML into the supplied docx.
 * 
 * See also org.docx4j.model.datastorage.migration.FromVariableReplacement
 * for a neater way to do this, where the parts you want to add are
 * the OpenDoPE parts.
 * 
 * @author Jason Harrop
 */
public class ContentControlsAddCustomXmlDataStoragePart {

	public static void main(String[] args) throws Exception {
		
		System.out.println( "Creating package..");
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
		
		wordMLPackage.getMainDocumentPart()
			.addStyledParagraphOfText("Title", "Hello world");

		wordMLPackage.getMainDocumentPart().addParagraphOfText("from docx4j!");
		
	    			
		CustomXmlDataStoragePart customXmlDataStoragePart = injectCustomXmlDataStoragePart(
				wordMLPackage.getMainDocumentPart() );
		
		addProperties(customXmlDataStoragePart);
		
		// Now save it 
		wordMLPackage.save(new java.io.File(System.getProperty("user.dir") + "/src/OUT_withCustomXmlDataStoragePart.docx") );
						
	}
	
	
	public static CustomXmlDataStoragePart injectCustomXmlDataStoragePart(Part parent) throws Exception {
		
			org.docx4j.openpackaging.parts.CustomXmlDataStoragePart customXmlDataStoragePart = 
				new org.docx4j.openpackaging.parts.CustomXmlDataStoragePart();
				// Defaults to /customXml/item1.xml
			
			CustomXmlDataStorage data = new CustomXmlDataStorageImpl();
			data.setDocument(createCustomXmlDocument());
			
			customXmlDataStoragePart.setData(data);
			parent.addTargetPart(customXmlDataStoragePart, AddPartBehaviour.RENAME_IF_NAME_EXISTS);

			return customXmlDataStoragePart;
	}
	
	public static void addProperties(CustomXmlDataStoragePart customXmlDataStoragePart) throws InvalidFormatException {

		CustomXmlDataStoragePropertiesPart part = new CustomXmlDataStoragePropertiesPart();
		
		org.docx4j.customXmlProperties.ObjectFactory of = new org.docx4j.customXmlProperties.ObjectFactory();
		
		DatastoreItem dsi = of.createDatastoreItem();
		String newItemId = "{" + UUID.randomUUID().toString() + "}";					
		dsi.setItemID(newItemId);
		
		part.setJaxbElement(dsi );
		
		customXmlDataStoragePart.addTargetPart(part);
	}
	
	/**
	 * Generate or load the XML you want in your CustomXML part.
	 */
	public static org.w3c.dom.Document createCustomXmlDocument() {
		
		org.w3c.dom.Document domDoc = XmlUtils.neww3cDomDocument();
		domDoc.appendChild(domDoc.createElement("Thoom")).setTextContent("ANILTHOOM");;
		
		return domDoc;
		
	}
	
}