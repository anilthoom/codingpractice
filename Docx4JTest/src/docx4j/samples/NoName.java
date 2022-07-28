package docx4j.samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.docx4j.TraversalUtil;
import org.docx4j.XmlUtils;
import org.docx4j.finders.ClassFinder;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.ContentAccessor;
import org.docx4j.wml.SdtBlock;
import org.docx4j.wml.SdtPr;
import org.docx4j.wml.Text;

public class NoName 
{
	public static void main(String[] args) throws Exception 
	{
		docx4jReplaceSimpleTest();
		String inputfilepath = System.getProperty("user.dir") + "/src/binding-simple.docx";

		String outputfilepath = System.getProperty("user.dir") + "/src/NoName.docx";

		// Load the Package
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(inputfilepath));
		replaceTextValue(wordMLPackage, "ANILKUMAR", "element2");

		wordMLPackage.save(new java.io.File(outputfilepath) );
		System.out.println("DONE");
	}
	private static void docx4jReplaceSimpleTest() throws Exception
	{
	      String docxFile = System.getProperty("user.dir") + "/src/test.docx";

	      WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(docxFile));

	      HashMap<String, String> mappings = new HashMap<String, String>();
	      mappings.put(" Person.Firstname", "ANIL KUMAR");
	      mappings.put(" Person.Lastname", "THOOM");

	      MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();
	      documentPart.variableReplace(mappings);

	    wordMLPackage.save(new java.io.File(System.getProperty("user.dir") + "/src/OUT_test.docx") );
	}
	private static List<Object> getAllElementFromObject(Object obj, Class<?> toSearch, List<Object> result) {

	    if (obj instanceof JAXBElement) obj = ((JAXBElement<?>) obj).getValue();

	    if (obj.getClass().equals(toSearch))
	        result.add(obj); 
	    else if (obj instanceof ContentAccessor) {
	        List<?> children = ((ContentAccessor) obj).getContent();
	        for (Object child : children) {
	            result.addAll(getAllElementFromObject(child, toSearch, result));
	        }
	    }
	    return result; 
	}


	private static void replaceTextValue(WordprocessingMLPackage template, String name, String placeholder ) throws Exception{     

		List<Object> result = new ArrayList<Object>();
	    List<Object> texts = getAllElementFromObject(template.getMainDocumentPart(), SdtBlock.class, result);

	    for (Object text : texts) {         

	        SdtBlock textElement = (SdtBlock) text;
	        List<Object> cList = textElement.getSdtContent().getContent();

	        SdtPr pr = textElement.getSdtPr();
	        List<Object> al = pr.getRPrOrAliasOrLock();

	        for (Object alias : al) {   // go through all SdtPr objects

	            if ( alias.getClass().toString().contains("org.docx4j.wml.Tag")) {

	                String CTagVal = ((org.docx4j.wml.Tag) alias).getVal(); 

	                if (CTagVal.equalsIgnoreCase(placeholder))  {   

	                ClassFinder finder = new ClassFinder(Text.class);
	                new TraversalUtil(cList, finder);

	                for (Object o : finder.results) {
	                    Object o2 = XmlUtils.unwrap(o);
	                    if (o2 instanceof org.docx4j.wml.Text) {
	                    org.docx4j.wml.Text txt = (org.docx4j.wml.Text)o2;
	                    txt.setValue(name);
	                    } else {
	                    System.out.println( XmlUtils.marshaltoString(o, true, true));
	                    }
	                    }

	                }

	        }           

	    }
	}
	}

}
