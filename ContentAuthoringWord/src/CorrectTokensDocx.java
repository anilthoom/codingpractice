
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlCursor;

public class CorrectTokensDocx {
	public static void main(String args[]) throws IOException,
			InvalidFormatException,
			org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		CorrectTokensDocx.replacePlaceHolders();
		//File file = new File(INPUTLOCATION);
		//System.out.println(file.toURI().toURL());
	}
	
	private static String RSVD_START_PATTERN = "[#";
	private static String RSVD_END_PATTERN = "#]";
	private static String INPUTLOCATION = "C:\\MyWork\\OT\\CC\\Exploration\\Document Generation - ApachePOI\\Sample Contract Documents\\Mutual NDA (UK)_Layout.docx";
	private static String OUTPUTLOCATION = "C:\\MyWork\\OT\\CC\\Exploration\\Document Generation - ApachePOI\\Sample Contract Documents\\Mutual NDA (UK)_Layout_FIXED.docx";
	
	/*private static void CreateRelatedParagraph(XWPFParagraph para) 
	{	
		String paratext = para.getText();
		//String l_pattern = RSVD_START_PATTERN.replaceAll("\\[", "\\[")+"[a-zA-Z0-9~!`@#^$%&()_+={},.; -]+"+RSVD_END_PATTERN.replaceAll("\\]", "\\]");
		//String l_pattern = "\\[#[a-zA-Z0-9~!`@#^$%&()_+={},.; -]*#\\]";
		//Pattern pattern = Pattern.compile(l_pattern);
		Pattern pattern = Pattern.compile("\\[#[a-zA-Z0-9]*#\\]");
		Matcher matcher = pattern.matcher(paratext);
		int matchedsize = 0;
		while(matcher.find())
		{
			matchedsize++;
		}
		if(!(matchedsize>0))
		{
			return;
		}
		Integer[] tokensarray = new Integer[matchedsize];
		Map<Integer, String> tokensmap = new HashMap<Integer,String>(matchedsize);
		matcher = pattern.matcher(paratext);
		int idx=0;
		while(matcher.find())
		{
			int startIndex = matcher.start();
			tokensarray[idx++] = startIndex;
			tokensmap.put(startIndex, matcher.group());
		}
		List<XWPFRun> lRuns = para.getRuns();
		XWPFRun[] lRunsArray = new XWPFRun[lRuns.size()];
		Iterator<XWPFRun> lRunsIterator = lRuns.iterator();
		int iterCount = 0;
		while(lRunsIterator.hasNext())
		{
			lRunsArray[iterCount++]=lRunsIterator.next();
		}
		
		//ArrayList<XWPFParagraph> repeatedList = null;
		para.getCTP().setRArray(null);
		int accumLength = 0;
		int arrIdx=0;
		int currentTargetStart = tokensarray[arrIdx++];
		int currentTargetEnd = currentTargetStart+(tokensmap.get(currentTargetStart).length())-1;
		for(int i=0;i<iterCount;i++)
		{
			XWPFRun lRun = lRunsArray[i];			
			String lRunText = lRun.getText(0);
			if(lRunText==null || lRunText.length()==0 || arrIdx>=matchedsize)
			{			
				para.addRun(lRun);
			}
			int lrunStart = accumLength;
			int lRunEnd = (accumLength+lRunText.length())-1;
			accumLength+= lRunText.length();
			if(currentTargetStart>=lrunStart)
			{
				if(currentTargetStart>lRunEnd || currentTargetEnd==lRunEnd)
				{
					para.addRun(lRun);
				}
				else if(currentTargetEnd<lRunEnd)
				{					
					while(currentTargetEnd<lRunEnd && arrIdx<matchedsize)
					{						
						currentTargetStart = tokensarray[arrIdx++];
						currentTargetEnd = currentTargetStart+(tokensmap.get(currentTargetStart).length())-1;
					}
					if(currentTargetEnd<=lRunEnd)
					{
						para.addRun(lRun);
					}
					else
					{
						CreateRunWithText(para,lRun,lRunText.substring(0, currentTargetStart));
					}
				}
				
			}
			else if(currentTargetStart<lrunStart )
			{
				if(currentTargetEnd>lRunEnd)
				{
					continue;
				}
				if(currentTargetEnd==lRunEnd)
				{
					CreateRunWithText(para,lRun,tokensmap.get(currentTargetStart));
				}
				if(currentTargetEnd<lRunEnd)
				{
					CreateRunWithText(para,lRun,tokensmap.get(currentTargetStart));
					int l_currentEnd = currentTargetEnd;
					while(currentTargetEnd<lRunEnd && arrIdx<matchedsize)
					{						
						currentTargetStart = tokensarray[arrIdx++];
						currentTargetEnd = currentTargetStart+(tokensmap.get(currentTargetStart).length())-1;
					}
					if(l_currentEnd==currentTargetEnd || currentTargetStart>lRunEnd || currentTargetEnd<=lRunEnd)
					{
						CreateRunWithText(para,lRun,lRunText.substring(l_currentEnd+1));
					}
					else if(currentTargetStart<lRunEnd && currentTargetEnd>lRunEnd)
					{
						CreateRunWithText(para,lRun,lRunText.substring(l_currentEnd+1,currentTargetStart));
					}
				}
			}			 
		}
	}*/
	
	private static XWPFParagraph CreateNewParagraph(XWPFParagraph oldPara, XWPFDocument iDoc,XWPFTableCell iTblCell) 
	{
		if(iDoc!=null)
		{			
			XmlCursor inscursor = oldPara.getCTP().newCursor();
			XWPFParagraph newPara=iDoc.insertNewParagraph(inscursor);
			cloneParagraph(newPara,oldPara );
			inscursor.dispose();
			return newPara;
		}
		else
		{
			XmlCursor inscursor = oldPara.getCTP().newCursor();
			XWPFParagraph newPara=iTblCell.insertNewParagraph(inscursor);
			cloneParagraph(newPara,oldPara );
			inscursor.dispose();
			return newPara;
		}
	}
	
	private static void RemoveOldParagraph(XWPFParagraph oldPara) 
	{
		XmlCursor rmvcursor = oldPara.getCTP().newCursor();
		rmvcursor.removeXml();
		rmvcursor.dispose();
	}
	
	private static String getEscapedRegText(String regText) 
	{
		return regText.replaceAll("\\[", "\\\\[").replaceAll("\\]", "\\\\]").replaceAll("\\(", "\\\\(").replaceAll("\\)", "\\\\)").
				replaceAll("\\{","\\\\{").replaceAll("\\}", "\\\\}");
	}
	
	private static Boolean CreateRelatedParagraph(XWPFParagraph para, XWPFDocument document, XWPFTableCell cell) 
	{	
		String paratext = para.getText();
		String l_pattern = getEscapedRegText(RSVD_START_PATTERN)+"[a-zA-Z0-9~!`@#^$%&()_+={},.; -]+"+getEscapedRegText(RSVD_END_PATTERN);
		//String l_pattern = "\\[#[a-zA-Z0-9~!`@#^$%&()_+={},.; -]*#\\]";
		//Pattern pattern = Pattern.compile(l_pattern);
		Pattern pattern = Pattern.compile(l_pattern);
		Matcher matcher = pattern.matcher(paratext);
		ArrayList<Integer> l_tokensList = new ArrayList<Integer>();
		HashMap<Integer, String> tokensmap = new HashMap<Integer,String>();
		int matchedsize = 0;
		while(matcher.find())
		{			
			int startIndex = matcher.start();
			l_tokensList.add(startIndex);
			tokensmap.put(startIndex, matcher.group());
			matchedsize++;
		}		
		if(!(matchedsize>0))
		{
			return false;
		}
		XWPFParagraph newPara = CreateNewParagraph(para,document,cell);
		if(newPara==null)
		{
			return false;
		}
		Iterator<Integer> thnItr = l_tokensList.iterator();
		List<XWPFRun> lRuns = para.getRuns();
		Boolean tokensCompleted = thnItr.hasNext()?false:true;
		int accumLength = 0;		
		int currentTargetStart = thnItr.next();
		int currentTargetEnd = currentTargetStart+(tokensmap.get(currentTargetStart).length())-1;
		for(int indx=0;indx<lRuns.size();indx++)
		{
			XWPFRun lRun = lRuns.get(indx);			
			String lRunText = lRun.getText(0);
			int lrunStart = accumLength;			
			accumLength+= lRun.text().length();
			int lRunEnd = (accumLength)-1;
			if(lRunText==null || lRunText.length()==0 || tokensCompleted)
			{				
				CreateRunWithText(newPara,lRun,lRunText);
				continue;
			}
			
			if(currentTargetStart>=lrunStart)
			{
				if(currentTargetStart>lRunEnd)
				{
					CreateRunWithText(newPara,lRun,lRunText);
				}
				else if(currentTargetEnd==lRunEnd)
				{
					CreateRunWithText(newPara,lRun,lRunText);
					if(thnItr.hasNext())
					{
						currentTargetStart = thnItr.next();
						currentTargetEnd = currentTargetStart+(tokensmap.get(currentTargetStart).length())-1;
					}
					else
					{
						tokensCompleted=true;
					}
				}
				else if(currentTargetEnd<lRunEnd)
				{					
					while(currentTargetEnd<lRunEnd && (thnItr.hasNext()))
					{						
						currentTargetStart = thnItr.next();
						currentTargetEnd = currentTargetStart+(tokensmap.get(currentTargetStart).length())-1;
					}
					if(currentTargetEnd<=lRunEnd)
					{
						CreateRunWithText(newPara,lRun,lRunText);
						tokensCompleted=true;
					}
					else if(currentTargetStart>lRunEnd)
					{
						CreateRunWithText(newPara,lRun,lRunText);
					}
					else
					{
						CreateRunWithText(newPara,lRun,lRunText.substring(0, currentTargetStart-lrunStart));
					}
				}
				else if ((currentTargetStart-lrunStart)>0)
				{
					CreateRunWithText(newPara,lRun,lRunText.substring(0, currentTargetStart-lrunStart));
				}
			}
			else if(currentTargetStart<lrunStart )
			{
				if(currentTargetEnd>lRunEnd)
				{
					continue;
				}
				if(currentTargetEnd==lRunEnd)
				{
					CreateRunWithText(newPara,lRun,tokensmap.get(currentTargetStart));
					if(thnItr.hasNext())
					{
						currentTargetStart = thnItr.next();
						currentTargetEnd = currentTargetStart+(tokensmap.get(currentTargetStart).length())-1;
					}
					else
					{
						tokensCompleted=true;
					}
				}
				else if(currentTargetEnd<lRunEnd)
				{
					CreateRunWithText(newPara,lRun,tokensmap.get(currentTargetStart));
					int l_currentEnd = currentTargetEnd;
					while(currentTargetEnd<lRunEnd && (thnItr.hasNext()))
					{						
						currentTargetStart = thnItr.next();
						currentTargetEnd = currentTargetStart+(tokensmap.get(currentTargetStart).length())-1;
					}
					if(l_currentEnd==currentTargetEnd || currentTargetStart>lRunEnd || currentTargetEnd<=lRunEnd)
					{
						CreateRunWithText(newPara,lRun,lRunText.substring(l_currentEnd-lrunStart+1));
						tokensCompleted=currentTargetStart>lRunEnd?false:true;
					}
					else if(currentTargetStart<lRunEnd && currentTargetEnd>lRunEnd)
					{
						CreateRunWithText(newPara,lRun,lRunText.substring(l_currentEnd-lrunStart+1,currentTargetStart-lrunStart));
					}
				}
			}			 
		}
		return true;
	}
	
	private static void CreateRunWithText(XWPFParagraph iPara, XWPFRun iRun,String iRunText) 
	{
		XWPFRun lNewRun = iPara.createRun();
		lNewRun.getCTR().set(iRun.getCTR().copy());
		if(iRunText!=null)
		{	
			lNewRun.setText(iRunText,0);
		}
	}
	
	private static void cloneParagraph(XWPFParagraph clone, XWPFParagraph source) 
	{	 
	    clone.getCTP().set(source.getCTP().copy());
	    int l_runSize = clone.getRuns().size();
	    while(l_runSize>0)
	    {
	    	clone.removeRun(l_runSize-1);
	    	l_runSize--;
	    }
	    clone.getCTP().setRArray(null);	 
	}
	

	public static void replacePlaceHolders() throws IOException,
			InvalidFormatException,
			org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		try {
			OPCPackage opcdoc = OPCPackage.open(INPUTLOCATION);
			XWPFDocument document = new XWPFDocument(opcdoc);			
			
			List<XWPFParagraph> lParas = document.getParagraphs();
			XWPFParagraph[] lParasArray = new XWPFParagraph[lParas.size()];
			Iterator<XWPFParagraph> lparasIterator = lParas.iterator();
			int iterCount = 0;
			while(lparasIterator.hasNext())
			{
				lParasArray[iterCount++]=lparasIterator.next();
			}
			for(int indx=0;indx<lParasArray.length;indx++)
			{				
				Boolean iRmvOld = CreateRelatedParagraph(lParasArray[indx],document,null);				
				if(iRmvOld)
				{
					RemoveOldParagraph(lParasArray[indx]);
				}
			}			

			for (XWPFTable table : document.getTables()) {				
				for (XWPFTableRow rows : table.getRows()) {
					for (XWPFTableCell cell : rows.getTableCells()) 
					{						
						List<XWPFParagraph> tcParas = cell.getParagraphs();
						XWPFParagraph[] tcParasArray = new XWPFParagraph[tcParas.size()];
						Iterator<XWPFParagraph> tcParasIterator = tcParas.iterator();
						int tcpCount = 0;
						while(tcParasIterator.hasNext())
						{
							tcParasArray[tcpCount++]=tcParasIterator.next();
						}
						for (int cindx=0;cindx<tcParasArray.length;cindx++) 
						{
							Boolean iRmvOld = CreateRelatedParagraph(tcParasArray[cindx],null,cell);				
							if(iRmvOld)
							{
								RemoveOldParagraph(tcParasArray[cindx]);
							}																					
						}						
					}
				}
				
			}			

			document.write(new FileOutputStream(OUTPUTLOCATION));
			System.out.println("DONE");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally 
		{

		}
	}
}