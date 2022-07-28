import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.xml.sax.SAXException;

public class SampleValidator
{
	public static void main(String ... args) throws InvalidFormatException, IOException, SAXException, ParserConfigurationException 
	{
		//Only tokens
		generateDocument("C:\\MyWork\\workspace\\DocGenTest\\src\\mapping.xml","C:\\MyWork\\workspace\\DocGenTest\\src\\MSA_INPUT.docx", "C:\\MyWork\\workspace\\DocGenTest\\src\\MSA_OUTPUT.docx", "[@", "@]");
		
		//Generating for the repeatable content.
//		generateDocument("C:\\MyWork\\workspace\\DocGenTest\\src\\ctr_mapping.xml", "C:\\MyWork\\workspace\\DocGenTest\\src\\CtrDocInput.docx", "C:\\MyWork\\workspace\\DocGenTest\\src\\CtrDocOutput.docx", "[@", "@]");
		
	}
	public static void generateDocument(String inputMappingFileLocation, String inputFileLocation, String outputFileLocation, String startPattern, String endPattern) throws InvalidFormatException, IOException, SAXException, ParserConfigurationException
	{
		DocGenUtils.Parser(inputMappingFileLocation, inputFileLocation, outputFileLocation, startPattern, endPattern);
	}
}