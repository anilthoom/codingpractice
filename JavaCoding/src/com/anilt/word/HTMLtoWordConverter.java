package com.anilt.word;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.docx4j.convert.in.xhtml.XHTMLImporterImpl;
import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.wml.SdtBlock;
import org.docx4j.wml.SdtPr;

public class HTMLtoWordConverter 
{
	public static void main(String[] args) throws Exception 
	 {
		//WordprocessingMLPackage template = getTemplate("sample1.docx");
		//System.out.println(template.getTitle());
		gernerateFromHTML();
	}
	private static WordprocessingMLPackage getTemplate(String name) throws Docx4JException, FileNotFoundException {
		WordprocessingMLPackage template = WordprocessingMLPackage.load(new FileInputStream(new File(name)));
		return template;
	}
	private static void gernerateFromHTML() throws Exception
	{
		 String xhtml= 
	                "<table border=\"1\" cellpadding=\"1\" cellspacing=\"1\" style=\"width:100%;\"><tbody><tr><td>test</td><td>test</td></tr><tr><td>test</td><td>test</td></tr><tr><td>test</td><td>test</td></tr></tbody></table>";
	        
	        String xhtml1 = "<p><h2><span style=\"color: #4b67a1;\">This is a demo</span> - <span style=\"color: #008000;\">You can edit the text! <img src=\"/images/smiley.png\" alt=\"laughing\" /> hearts</span> </h2>"
	        		+ "<p>Type in the <strong>visual editor</strong> on the left or the <strong>source editor</strong> on the right and see them both change in real time.</p>"
	        		+ "<p>Set up the cleaning preferences below and click the <strong style=\"box-shadow: 3px 3px 3px #aaa; border-radius: 5px; padding: 0 5px; background-color: #2b3a56; color: #fff;\"> Clean HTML</strong> button to clean the HTML source code.</p>"

	        		+ "<table class=\"demoTable\" cellpadding=\"10\">"
	        		+ "<tbody>"
	        		+ "<tr style=\"text-align: center;\">"
	        		+ "<td><img src=\"images/document-editors.png\" alt=\"editors\" /></td>"
	        		+ "<td><img src=\"images/cleaning-arrow.png\" alt=\"cleaning\" /></td>"
	        		+ "<td><img src=\"images/clean-html.png\" alt=\"editors\" width=\"86\" height=\"122\" /></td>"
	        		+ "</tr>"
	        		+ "<tr>"
	        		+ "<td colspan=\"3\"><strong>Convert almost any document to clean HTML in three simple steps:</strong>"
	        		+ "<ol>"
	        		+ "<li>Paste the content of the Document in the editor</li>"
	        		+ "<li>Click the Clean HTML (optional)</li>"
	        		+ "<li>Copy the generated HTML code</li>"
	        		+ "</ol>"
	        		+ "</td>"
	        		+ "</tr>"
	        		+ "</tbody>"
	        		+ "</table>"
	        		+ "<p><strong><span style=\"color: #366691; font-size: 20px; text-shadow: 4px 10px 4px #888;\">HTML-Cleaner.com</span></strong></p>"
	        		+ "<p>Please find below all the cleaning preferences, the Find And Replace tool, the Lorem-ipsum generator, the <a href=\"https://html-cleaner.com/case-converter/\">Case Converter</a> and much more!</p>"
	        		+ "<p>Don't forget to save this link into your bookmarks and share it with your friends.</p></p>";
	        		
			//Colors
//	        String xhtml1 = "<body><h2 style=\"background-color:red\">Background-color set by using red</h2><h2 style=\"background-color:orange\">Background-color set by using orange</h2><h2 style=\"background-color:yellow\">Background-color set by using yellow</h2><h2 style=\"background-color:blue;color:white\">Background-color set by using blue</h2><h2 style=\"background-color:cyan\">Background-color set by using cyan</h2></body>";
	        
	        //Images 
	    //    String xhtml1 = "<body><h2>Spectacular Mountain</h2><img src=\"Jellyfish.jpg\" alt=\"Mountain View\" style=\"width:304px;height:228px;\"/></body>";
	        String xhtml3 = "<body><h1><SPAN style=\";font-family: arial black, gadget, sans-serif ;\">Definitions:</SPAN></h1><p><SPAN style=\";font-family: book antiqua, palatino, sans-serif ;\">The following defined terms shall have the following meaning:</SPAN></p><p><SPAN style=\";font-family: book antiqua, palatino, sans-serif ;\">\"<span style='font-weight:bold;'>Anniversary Date</span>\" means the calendar date each year on which each Subsequent Maintenance Year shall begin. The Anniversary Date shall be the calendar date immediately following the end of the First Maintenance Year and shall remain the same during the Term;</SPAN></p><p><SPAN style=\";font-family: book antiqua, palatino, sans-serif ;\">\"<span style='font-weight:bold;'>SMP Handbook</span>\" means Open Text's then current \"Software Maintenance Program Handbook\", a copy of the current version of such is attached hereto as Schedule \"B\" to this Agreement. &#160;Open Text may modify the SMP Handbook from time to time at its discretion;&#160;</SPAN></p><p><span>s... Agreement</span>\" means a written software license agreement entered into between Open Text and Licensee wherein Open Text has granted to Licensee certain non exclusive, non assignable, non transferable, object code licenses to use the specific computer software and documentation described in such License Agreement;</p><p><SPAN style=\";font-family: book antiqua, palatino, sans-serif ;\">�<span style='font-weight:bold;'>Licensed Software</span>� means each computer program licensed by Open Text to Licensee pursuant to the License Agreement, including all documentation provided, or made available, by Open Text to Licensee under the License Agreement. The term �Licensed Software� shall also include all bug fixes, error corrections, maintenance releases, updates, new releases, and other computer software supplied by Open Text to Licensee pursuant to this Agreement, as well as all documentation supplied by Open Text to Licensee pursuant to this Agreement</SPAN></p><div><bR /></div></body>";
	        // To docx, with content controls
	        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
	        
	        SdtBlock sdtBlock = Context.getWmlObjectFactory().createSdtBlock();
	        SdtPr sdtPr = Context.getWmlObjectFactory().createSdtPr();
	        sdtBlock.setSdtPr(sdtPr);
	        
	        XHTMLImporterImpl XHTMLImporter = new XHTMLImporterImpl(wordMLPackage);
	        String xhtml4 = "<div xmlns=\"\" template=\"Type1EmailTemplate\" layout=\"original\" style=\"Font-Family:;Font-Style:;Font-Weight:;Font-Size:;Background-Color:RGB(240,255,255);background-image: url()\"><div><div><h1 style=\"text-align: center;\"><span style=\"color: #0014a5;\">Review</span></h1><p>Dear Contract Admin,</p><p>Contract Document is ready for review, Age is &lt; 21 please check and act on it.</p><div /></div></div><div><table><tbody><tr><td bgcolor=\"#366bb2\" height=\"30\" valign=\"middle\" width=\"70\" align=\"center\"><a style=\"TEXT-DECORATION: none\" href=\"http://anilt62ks022/cordys/wcp/library/util/eventservice/com.cordys.approval.TaskApproval.wcp?TaskID=://MessageMetadata/Id/text():&amp;PRNumber=://MessageMetadata/Subject/text():&amp;status=Approve\"><span style=\"FONT-FAMILY: Georgia; COLOR: white; FONT-SIZE: 12px;font-weight:bold;\">Approve</span></a></td><td bgcolor=\"#366bb2\" height=\"30\" valign=\"middle\" width=\"70\" align=\"center\"><a style=\"TEXT-DECORATION: none\" href=\"http://anilt62ks022/cordys/wcp/library/util/eventservice/com.cordys.approval.TaskApproval.wcp?TaskID=://MessageMetadata/Id/text():&amp;PRNumber=://MessageMetadata/Subject/text():&amp;status=Reject\"><span style=\"FONT-FAMILY: Georgia; COLOR: white; FONT-SIZE: 12px;font-weight:bold;\">Reject</span></a></td></tr></tbody></table></div><link align=\"\" valign=\"\" style=\"\" formatType=\"Image\" src=\"C:\\Program Files\\OpenText\\Process Platform\\defaultInst\\webroot\\shared\\wcp\\theme\\default\\image\\control\\chart.jpg\" textMsg=\"\" href=\"http://www.opentext.com/\" /><div>Thanks &amp; Regards,<p>Legal Department</p></div><div><span style=\"color: rgb(255, 255, 255); font-family: Lato, Helvetica, Arial, sans-serif; font-size: 14px; background-color: rgb(0, 0, 0);\">� Copyright 2017 OpenText Corp. All Rights Reserved.�</span><a href=\"http://www.opentext.com/who-we-are/copyright-information/site-privacy\" style=\"color: rgb(156, 156, 156); text-decoration: none; ; font-family: Lato, Helvetica, Arial, sans-serif; font-size: 14px; background-color: rgb(0, 0, 0);\">Privacy Policy</a><span style=\"color: rgb(255, 255, 255); font-family: Lato, Helvetica, Arial, sans-serif; font-size: 14px; background-color: rgb(0, 0, 0);\">�|�</span><a href=\"http://www.opentext.com/who-we-are/copyright-information/site-cookies-information\" style=\"color: rgb(156, 156, 156); text-decoration: none; ; font-family: Lato, Helvetica, Arial, sans-serif; font-size: 14px; background-color: rgb(0, 0, 0);\">Cookie Policy</a></div></div>";
	        String xhtml5 =" <div><li>One</li><li>One</li><li>One</li>Div <b>	<span style=\"font-family:&quot;Times New Roman&quot;,serif;mso-hansi-font-family:Calibri;mso-hansi-theme-font:minor-latin;mso-bidi-font-family:&quot;Times New Roman&quot;;mso-bidi-theme-font:minor-bidi;color:#4B67A1\">This is a demo</span></b><b>	<span style=\"font-family: &quot;Times New Roman&quot;, serif;\"> - </span></b><b>	<span style=\"font-family:&quot;Times New Roman&quot;,serif;mso-hansi-font-family:Calibri;mso-hansi-theme-font:minor-latin;mso-bidi-font-family:&quot;Times New Roman&quot;;mso-bidi-theme-font:minor-bidi;color:green\">You can edit thetext! hearts</span></b><p class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt\">	</p><p class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt\">	<span style=\"font-family: &quot;Times New Roman&quot;, serif;\">Type in the <b>visual editor</b> on the left or the <b>source editor</b> on the right and see them both change in real time.</span>	</p><p class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt\">	<span style=\"font-family: &quot;Times New Roman&quot;, serif;\">Set up the cleaning preferencesbelow and click the </span><b>		<span style=\"font-family:&quot;Times New Roman&quot;,serif;mso-hansi-font-family:Calibri;mso-hansi-theme-font:minor-latin;mso-bidi-font-family:&quot;Times New Roman&quot;;mso-bidi-theme-font:minor-bidi;color:white;background:#2B3A56\"> Clean HTML</span>	</b>	<span style=\"font-family: &quot;Times New Roman&quot;, serif;\"> button to clean the HTML source code.</span>	</p><table class=\"MsoNormalTable\" border=\"0\" cellspacing=\"3\" cellpadding=\"0\">	<tbody>		<tr style=\"mso-yfti-irow:0;mso-yfti-firstrow:yes;height:15.0pt\">			<td width=\"90\" style=\"width:67.75pt;padding:7.5pt 7.5pt 7.5pt 7.5pt;height:  15.0pt\">				<p class=\"MsoNormal\">					<img width=\"150\" height=\"127\" src=\"file:///C:/Users/anilt/AppData/Local/Temp/msohtmlclip1/01/clip_image002.gif\" alt=\"editors\" vshapes=\"Picture_x0020_1\"></img>										</p>				</td>				<td width=\"90\" style=\"width:67.75pt;padding:7.5pt 7.5pt 7.5pt 7.5pt;height:  15.0pt\">					<p class=\"MsoNormal\">	<img width=\"100\" height=\"82\" src=\"file:///C:/Users/anilt/AppData/Local/Temp/msohtmlclip1/01/clip_image004.gif\" alt=\"cleaning\" vshapes=\"Picture_x0020_2\"></img>													</p>					</td>					<td width=\"468\" style=\"width:350.7pt;padding:7.5pt 7.5pt 7.5pt 7.5pt;  height:15.0pt\">						<p class=\"MsoNormal\"><img width=\"153\" height=\"217\" src=\"file:///C:/Users/anilt/AppData/Local/Temp/msohtmlclip1/01/clip_image006.gif\" alt=\"editors\" vshapes=\"Picture_x0020_3\"></img>															</p>						</td>					</tr>					<tr style=\"mso-yfti-irow:1;mso-yfti-lastrow:yes;height:15.0pt\">						<td colspan=\"3\" style=\"padding:7.5pt 7.5pt 7.5pt 7.5pt;height:15.0pt\">							<p class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt\">								<b>									<span style=\"font-family: &quot;Times New Roman&quot;, serif;\">Convert almost  any document to clean HTML in three simple steps:</span>								</b>															</p>							<p class=\"MsoNormal\" style=\"margin-top:0in;margin-right:0in;margin-bottom:0in;  margin-left:48.0pt;margin-bottom:.0001pt;text-indent:-.25in;mso-list:l0 level1 lfo1\">		1<span style=\"font-variant-numeric: normal; font-stretch: normal; font-size: 7pt; line-height: normal;\">        								</span>								<span style=\"font-family: &quot;Times New Roman&quot;, serif;\">Paste the  content of the Document in the editor</span>															</p>							<p class=\"MsoNormal\" style=\"margin-top:0in;margin-right:0in;margin-bottom:0in;  margin-left:48.0pt;margin-bottom:.0001pt;text-indent:-.25in;mso-list:l0 level1 lfo1\">2<span style=\"font-variant-numeric: normal; font-stretch: normal; font-size: 7pt; line-height: normal;\">        								</span><span style=\"font-family: &quot;Times New Roman&quot;, serif;\">Click the Clean  HTML (optional)</span>															</p>							<p class=\"MsoNormal\" style=\"margin-top:0in;margin-right:0in;margin-bottom:0in;  margin-left:48.0pt;margin-bottom:.0001pt;text-indent:-.25in;mso-list:l0 level1 lfo1\">								3<span style=\"font-variant-numeric: normal; font-stretch: normal; font-size: 7pt; line-height: normal;\">        								</span>								<!--[endif]-->								<span style=\"font-family: &quot;Times New Roman&quot;, serif;\">Copy the  generated HTML code</span>															</p>						</td>					</tr>				</tbody>			</table>			<p class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt\">				<b>					<span style=\"font-size:15.0pt;mso-bidi-font-size:11.0pt;line-height:115%;font-family:&quot;Times New Roman&quot;,serif;mso-hansi-font-family:Calibri;mso-hansi-theme-font:minor-latin;mso-bidi-font-family:&quot;Times New Roman&quot;;mso-bidi-theme-font:minor-bidi;color:#366691\">HTML-Cleaner.com</span>				</b>							</p>			<p class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt\">				<span style=\"font-family: &quot;Times New Roman&quot;, serif;\">Please find below all the cleaningpreferences, the Find And Replace tool, the Lorem-ipsum generator, the </span><a href=\"https://html-cleaner.com/case-converter/\">					<span style=\"font-family:&quot;Times New Roman&quot;,serif;mso-hansi-font-family:Calibri;mso-hansi-theme-font:minor-latin;mso-bidi-font-family:&quot;Times New Roman&quot;;mso-bidi-theme-font:minor-bidi;color:blue\">Case Converter</span>				</a>				<span style=\"font-family: &quot;Times New Roman&quot;, serif;\"> and much more!</span>							</p>			<p class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt\">							</p>			<span style=\"font-family: &quot;Times New Roman&quot;, serif;\">Don't forget to save this link intoyour bookmarks and share it with your friends.</span>can be edited			<table>				<tbody>					<tr>						<th>Month</th>						<th>Savings</th>					</tr>					<tr>						<td>January</td>						<td>$100</td>					</tr>				</tbody>			</table></div>";
	        wordMLPackage.getMainDocumentPart().getContent().addAll( 
	                XHTMLImporter.convert( xhtml5, null) );

	        wordMLPackage.save(new java.io.File("C://HTML_DOCX4J-2.docx"));
	}
}
