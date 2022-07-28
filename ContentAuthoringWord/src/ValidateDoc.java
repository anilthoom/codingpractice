import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class ValidateDoc 
{
	public static void main(String args[]) throws IOException,
	InvalidFormatException,
	org.apache.poi.openxml4j.exceptions.InvalidFormatException 
	{
		ValidateDoc.isTokenBroken("[#SECONDPARTY_NAME#]");
		
	}
	public static void isTokenBroken(String token) throws IOException,
	InvalidFormatException,
	org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		try {
			XWPFDocument document = new XWPFDocument(OPCPackage.open("C:\\MyWork\\OT\\CC\\Exploration\\Document Generation - ApachePOI\\Sample Contract Documents\\Mutual NDA (USA)_Layout.docx"));
			boolean inParaGraph = false, inRun = false;
			for (XWPFParagraph paragraph : document.getParagraphs()) 
			{
				List<XWPFRun> runsList = paragraph.getRuns();
				String pGraph = paragraph.getParagraphText();
				inParaGraph = pGraph.contains(token);
//				System.out.println("PARAGRAPH : "+pGraph);
				
				if (runsList != null) 
				{
					for (XWPFRun run : runsList) 
					{
						String text = run.getText(0);
						if (text != null && text.contains(token)) 
						{
							inRun =  text.contains(token);
							System.out.println(token+ " : FOUND");
						}
					}
				}
				
			}
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
								if (text != null && text.contains(token)) 
								{
									System.out.println(token+ " : FOUND");
								}
							}
						}
					}
				}
			}

//			document.write(new FileOutputStream("C:\\MyWork\\workspace\\Practice\\output.docx"));
		//	document.write(new FileOutputStream("C:\\MyWork\\workspace\\Practice\\output.pdf"));
			System.out.println("Search Complete");
		} 
		finally 
		{

		}
	}
}
