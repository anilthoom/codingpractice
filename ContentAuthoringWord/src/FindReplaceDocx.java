import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
//import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class FindReplaceDocx 
{
	public static void main(String args[]) throws IOException,
	InvalidFormatException,
	org.apache.poi.openxml4j.exceptions.InvalidFormatException 
	{
		FindReplaceDocx.replaceTokens("", "");
		
	}
	public static void replaceTokens(String key, String value) throws IOException,
	InvalidFormatException,
	org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		try {
//			XWPFDocument document = new XWPFDocument(OPCPackage.open("C:\\MyWork\\workspace\\Practice\\Innovate Mutual NDA (USA) Layout original v2.docx"));
			XWPFDocument document = new XWPFDocument(OPCPackage.open("C:\\MyWork\\OT\\CC\\Exploration\\Document Generation - ApachePOI\\Sample Contract Documents\\Mutual NDA (USA)_Layout.docx"));
			
			String sectionStyle = "";
			String sectionName = "GENERAL";
			String clauseTitleStyle = "";
			String clauseTitle ="Obligations";
			String clauseContentStyle = "";
			String clauseContent = "Automating the creation and distribution of communications in electronic formats saves time, paper and postage costs. It also eliminates manual processes, dramatically reduces cycle times, and improves service levels. And by leveraging familiar authoring tools, business users can quickly develop and maintain document templates without relying on IT, which means you can accelerate time-to-market and reduce labor costs typically associated with document development";
			for (XWPFParagraph paragraph : document.getParagraphs()) 
			{
				List<XWPFRun> runsList = paragraph.getRuns();
				String pGraph = paragraph.getParagraphText();
				System.out.println("PARAGRAPH : "+pGraph);
				
				if (pGraph.equalsIgnoreCase("Section")) 
				{
					sectionStyle = paragraph.getStyle();
				}
				if (pGraph.equalsIgnoreCase("ClauseContent")) 
				{
					clauseContentStyle = paragraph.getStyle();
				}
				if (pGraph.equalsIgnoreCase("ClauseTitle")) 
				{
					clauseTitleStyle = paragraph.getStyle();
				}
				if (runsList != null) 
				{
					for (XWPFRun run : runsList) 
					{
						String text = run.getText(0);
						System.out.println("RUN : "+text);
						if (text != null && text.contains("[#CONTRACTNAME#]")) 
						{
							System.out.println("[#CONTRACTNAME#] : FOUND");
							text = text.replace("[#CONTRACTNAME#]", "XXXX");//your content
							run.setText(text, 0);
						}
						if (text != null && text.contains("[#MINSTARTDATE#]")) 
						{
							System.out.println("[#MINSTARTDATE#] : FOUND");
							text = text.replace("[#MINSTARTDATE#]", "ANIL KUMAR THOOM");//your content
							run.setText(text, 0);
						}
						if (text != null && text.contains("[#multioccurence#]")) 
						{
							System.out.println("[#multioccurence#] : FOUND");
							text = text.replace("[#multioccurence#]", "AAAAAAAAA");//your content
							run.setText(text, 0);
						}
						if (text != null && text.contains("[#Section#]")) 
						{
							System.out.println("[#Section#] : FOUND");
							text = text.replace("[#Section#]", "BBBBBBBB");//your content
							run.setText(text, 0);
						}
						if (text != null && text.contains("[#SectionName#]")) 
						{
							System.out.println("[#SectionName#] : FOUND");
							text = text.replace("[#SectionName#]", "CCCCCCCCCC");//your content
							run.setText(text, 0);
						}
						if (text != null && text.contains("[#Clause#]")) 
						{
							System.out.println("[#Clause#] : FOUND");
							text = text.replace("[#Clause#]", "CCCCCCCCCC");//your content
							run.setText(text, 0);
						}
						if (text != null && text.contains("[#ClauseName#]")) 
						{
							System.out.println("[#ClauseName#] : FOUND");
							text = text.replace("[#ClauseName#]", "CCCCCCCCCC");//your content
							run.setText(text, 0);
						}
						if (text != null && text.contains("[#ClauseContent#]")) 
						{
							System.out.println("[#ClauseContent#] : FOUND");
							text = text.replace("[#ClauseContent#]", "CCCCCCCCCC");//your content
							run.setText(text, 0);
						}

					}
				}
				
			}
			
			/*constructSection(document, sectionName, sectionStyle, true, UnderlinePatterns.DOUBLE, false);
			constructClauseTitle(document, clauseTitle, clauseTitleStyle, true, null, false);
			constructClauseContent(document, clauseContent, clauseContentStyle, false, null, true);*/
			
			/*
			 * Replacing the content inside tables 
			 */
			for (XWPFTable table : document.getTables()) 
			{
				for (XWPFTableRow rows : table.getRows()) 
				{
					for (XWPFTableCell cells : rows.getTableCells()) 
					{
						for (XWPFParagraph cellParagraph : cells.getParagraphs()) 
						{
							for (XWPFRun runInCell : cellParagraph.getRuns()) 
							{
								String text = runInCell.getText(0);
								if (text != null && text.contains("$$key$$")) 
								{
									text = text.replace("$$key$$", "ANIL KUMAR");
									runInCell.setText(text, 0);
								}
							}
						}
					}
				}
			}

			document.write(new FileOutputStream("C:\\MyWork\\Mutual NDA (USA)_Layout.docx"));
		//	document.write(new FileOutputStream("C:\\MyWork\\workspace\\Practice\\output.pdf"));
			System.out.println("DONE");
		} 
		finally 
		{

		}
	}
	public static void constructSection(XWPFDocument document, String pText, String style, boolean isBold, UnderlinePatterns dash, boolean isItalic)
	{
		XWPFParagraph p1 = null;
		p1 = document.createParagraph();
		p1.setStyle(style);
		p1.setNumID(new BigInteger("1"));
		XWPFRun r1 = p1.createRun();
		r1.setBold(isBold);
		if(dash != null)
		{
			r1.setUnderline(dash);
		}
		r1.setItalic(isItalic);
		r1.setText(pText);
	}
	public static void constructClauseTitle(XWPFDocument document, String pText, String style, boolean isBold, UnderlinePatterns dash, boolean isItalic)
	{
		XWPFParagraph p1 = null;
		p1 = document.createParagraph();
		p1.setStyle(style);
		p1.setNumID(new BigInteger("1"));
		XWPFRun r1 = p1.createRun();
		r1.setBold(isBold);
		r1.addTab();
		if(dash != null)
		{
			r1.setUnderline(dash);		
		}
		r1.setItalic(isItalic);
		r1.setText(pText);
	}
	public static void constructClauseContent(XWPFDocument document, String pText, String style, boolean isBold, UnderlinePatterns dash, boolean isItalic)
	{
		XWPFParagraph p1 = null;
		p1 = document.createParagraph();
		p1.setStyle(style);
		XWPFRun r1 = p1.createRun();
		r1.setBold(isBold);
		if(dash != null)
		{
			r1.setUnderline(dash);			
		}
		r1.setItalic(isItalic);
		r1.setText(pText);
	}
}
