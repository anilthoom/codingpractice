import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * @author anilt
 *
 */
public class DocGenUtils {
	@SuppressWarnings("resource")
	public static void Validator(String INPUT_MAPPING_LOCATION, String INPUT_DOCUMENT_LOCATION, String START_PATTERN, String END_PATTERN) throws InvalidFormatException, IOException, SAXException, ParserConfigurationException {
		ArrayList<String> paragraphTokens = new ArrayList<String>();
		ArrayList<String> runsTokens= new ArrayList<String>();
		
		// Building mapping's map 
		Map<String, String> TOKEN_MAPPINGS = mappingBuilder(INPUT_MAPPING_LOCATION, START_PATTERN, END_PATTERN);

		try {
			// Reading document
			XWPFDocument document = new XWPFDocument(OPCPackage.open(INPUT_DOCUMENT_LOCATION));	
			for (XWPFParagraph paragraph : document.getParagraphs()) {
				if(paragraph.getText() != null) {
					
					// Token counter in paragraph
					paragraphTokens = patternCounter(paragraph.getText(), TOKEN_MAPPINGS);
					
					// Proceed if atleast 1 token found in paragraph
					if(paragraphTokens.size() >= 1) {
						List<XWPFRun> runsList = paragraph.getRuns();						
						if (runsList != null) {
							for (XWPFRun run : runsList) {
								String text = run.getText(0);
								if (text != null) {
									// Token counter in runs
									runsTokens.addAll(patternCounter(text, TOKEN_MAPPINGS));
								}
							}
						}
						// Logging paragraph's status for tokens in paragraps,tokens in runs and missing token
						mappingMismatchLogger(paragraphTokens, runsTokens, paragraph.getText(), 70);
					}
				}
				paragraphTokens.clear();
				runsTokens.clear();
			}
		} catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
		System.out.println("\nDocument parsing is complete!");
	}
	
	public static void Parser(String INPUT_MAPPING_LOCATION, String INPUT_DOCUMENT_LOCATION, String OUTPUT_DOCUMENT_LOCATION, String START_PATTERN, String END_PATTERN) throws InvalidFormatException, IOException, SAXException, ParserConfigurationException {
		ArrayList<String> paragraphTokens = new ArrayList<String>();
		ArrayList<String> runsTokens= new ArrayList<String>();
		
		Map<String, String> TOKEN_MAPPINGS = mappingBuilder(INPUT_MAPPING_LOCATION, START_PATTERN, END_PATTERN);
		XWPFDocument document = null;

		try {
			document = new XWPFDocument(OPCPackage.open(INPUT_DOCUMENT_LOCATION));	
			for (XWPFParagraph paragraph : document.getParagraphs()) {
				if(paragraph.getText() != null) {
					paragraphTokens = patternCounter(paragraph.getText(), TOKEN_MAPPINGS);
					if(paragraphTokens.size() >= 1) {
						List<XWPFRun> runsList = paragraph.getRuns();
						
						if (runsList != null) {
							for (XWPFRun run : runsList) {
								String text = run.getText(0);
								if (text != null) {									
									runsTokens.addAll(patternCounter(text, TOKEN_MAPPINGS));
									// Replacing mapped keys with values
									for (Map.Entry<String, String> entry : TOKEN_MAPPINGS.entrySet()) {
										if(text.contains(entry.getKey())){
											text = text.replace(entry.getKey(), entry.getValue());
											run.setText(text, 0);
										}
									}
								}
							}
						}
						mappingMismatchLogger(paragraphTokens, runsTokens, paragraph.getText(), 70);
					}
				}
				paragraphTokens.clear();
				runsTokens.clear();
			}
		} catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
		document.write(new FileOutputStream(OUTPUT_DOCUMENT_LOCATION));		
		System.out.println("\nDocument parsing is complete!");
	}
		
	public static void mappingMismatchLogger(ArrayList<String> PARAGRAPH_TOKENS, ArrayList<String> RUNS_TOKENS, String INPUT_PARAGRAPHS, int PARAGRAPH_LIMITTER) {
		System.out.println("\nParagraph			: "+( (INPUT_PARAGRAPHS.length() > PARAGRAPH_LIMITTER) ? INPUT_PARAGRAPHS.substring(0, PARAGRAPH_LIMITTER).trim()+"..." : INPUT_PARAGRAPHS.trim() ));
		System.out.println(PARAGRAPH_TOKENS.size()+" Token(s) found in paragraph	: "+PARAGRAPH_TOKENS);
		System.out.println(RUNS_TOKENS.size()+" Token(s) found in runs	: "+RUNS_TOKENS);
		
		ArrayList<String> missingTokens = PARAGRAPH_TOKENS;
		missingTokens.removeAll(RUNS_TOKENS);
		System.out.println(missingTokens.size()+" Missing token(s)		: "+missingTokens);		
	}
	
	public static ArrayList<String> patternCounter(String INPUT_STRING, Map<String, String> TOKEN_MAPPINGS) {
		ArrayList<String> TOKEN_FOUND = new ArrayList<String>();
		int lastIndex = 0;
		
		for (Map.Entry<String, String> mapping : TOKEN_MAPPINGS.entrySet()) {
			while(lastIndex != -1){
			    lastIndex = INPUT_STRING.indexOf(mapping.getKey(),lastIndex);
			    if(lastIndex != -1){
			    	TOKEN_FOUND.add(mapping.getKey());
			        lastIndex += mapping.getKey().length();
			    }
			}
			lastIndex = 0;
		}
		return TOKEN_FOUND;
	}

	public static Map<String,String> mappingBuilder(String INPUT_MAPPING_LOCATION, String PATTERN_STARTING, String PATTERN_END) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
		// Parse XML
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new FileInputStream(new File(INPUT_MAPPING_LOCATION)));
		
		// Map to store mappings
		Map<String, String> mappingHM = new HashMap<String, String>();
		
		// Get mapping child nodes
		NodeList Mappings = doc.getElementsByTagName("Mappings");
	    for (int i = 0; i < Mappings.getLength(); i++) {
	        NodeList childList = Mappings.item(i).getChildNodes();
	        for (int j = 0; j < childList.getLength(); j++) {
	            Node childNode = childList.item(j);
	            	if(!childNode.getNodeName().equals("#text")) {	            		
	            		mappingHM.put(PATTERN_STARTING+childNode.getNodeName()+PATTERN_END, childList.item(j).getTextContent().trim());	            		
	            	}
	        }
	    }
	   return mappingHM;
	}
}