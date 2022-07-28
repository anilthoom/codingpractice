import java.io.FileOutputStream;
import java.math.BigInteger;

import org.apache.poi.xwpf.usermodel.XWPFAbstractNum;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;

public class QuickTest {

static String cTAbstractNumBulletXML = 
        "<w:abstractNum xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" w:abstractNumId=\"0\">"
                + "<w:multiLevelType w:val=\"hybridMultilevel\"/>"
                + "<w:lvl w:ilvl=\"0\"><w:start w:val=\"1\"/><w:numFmt w:val=\"bullet\"/><w:lvlText w:val=\"\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"720\" w:hanging=\"360\"/></w:pPr><w:rPr><w:rFonts w:ascii=\"Symbol\" w:hAnsi=\"Symbol\" w:hint=\"default\"/></w:rPr></w:lvl>"
                + "<w:lvl w:ilvl=\"1\" w:tentative=\"1\"><w:start w:val=\"1\"/><w:numFmt w:val=\"bullet\"/><w:lvlText w:val=\"o\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"1440\" w:hanging=\"360\"/></w:pPr><w:rPr><w:rFonts w:ascii=\"Courier New\" w:hAnsi=\"Courier New\" w:cs=\"Courier New\" w:hint=\"default\"/></w:rPr></w:lvl>"
                + "<w:lvl w:ilvl=\"2\" w:tentative=\"1\"><w:start w:val=\"1\"/><w:numFmt w:val=\"bullet\"/><w:lvlText w:val=\"\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"2160\" w:hanging=\"360\"/></w:pPr><w:rPr><w:rFonts w:ascii=\"Wingdings\" w:hAnsi=\"Wingdings\" w:hint=\"default\"/></w:rPr></w:lvl>"
                + "</w:abstractNum>";

static String cTAbstractNumDecimalXML = 
        "<w:abstractNum xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" w:abstractNumId=\"0\">"
                + "<w:multiLevelType w:val=\"hybridMultilevel\"/>"
                + "<w:lvl w:ilvl=\"0\"><w:start w:val=\"1\"/><w:numFmt w:val=\"decimal\"/><w:lvlText w:val=\"%1\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"720\" w:hanging=\"360\"/></w:pPr></w:lvl>"
                + "<w:lvl w:ilvl=\"1\" w:tentative=\"1\"><w:start w:val=\"1\"/><w:numFmt w:val=\"decimal\"/><w:lvlText w:val=\"%1.%2\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"1440\" w:hanging=\"360\"/></w:pPr></w:lvl>"
                + "<w:lvl w:ilvl=\"2\" w:tentative=\"1\"><w:start w:val=\"1\"/><w:numFmt w:val=\"decimal\"/><w:lvlText w:val=\"%1.%2.%3\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"2160\" w:hanging=\"360\"/></w:pPr></w:lvl>"
                + "</w:abstractNum>"
//                + "<w:p w:rsidR=\"006557B5\" w:rsidRDefault=\"00A173BA\"><w:pPr><w:jc w:val=\"center\"/></w:pPr><w:bookmarkStart w:id=\"0\" w:name=\"_GoBack\"/><w:bookmarkEnd w:id=\"0\"/><w:r><w:rPr><w:b/></w:rPr><w:t>This is body 2.</w:t></w:r></w:p>"
                + "";

public static void main(String[] args) throws Exception {

    XWPFDocument document = new XWPFDocument();

    {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run=paragraph.createRun();  
        run.setText("The List:");

        CTNumbering cTNumbering = CTNumbering.Factory.parse(cTAbstractNumBulletXML);

        CTAbstractNum cTAbstractNum = cTNumbering.getAbstractNumArray(0);

        XWPFAbstractNum abstractNum = new XWPFAbstractNum(cTAbstractNum);

        XWPFNumbering numbering = document.createNumbering();

        BigInteger abstractNumID = numbering.addAbstractNum(abstractNum);

        BigInteger numID = numbering.addNum(abstractNumID);
        System.out.println("numID: " + numID);
        for (int i = 0; i < 3; i++) {
            paragraph = document.createParagraph();
            paragraph.setNumID(numID);
            run = paragraph.createRun();
            run.setText("List1 item " + i); 
            if (i < 2) paragraph.setSpacingAfter(0);
        }

        paragraph = document.createParagraph();
        run=paragraph.createRun();  
        run.setText("Paragraph after the list.");
    }

    {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run=paragraph.createRun();  
        run.setText("The List2:");
        CTNumbering cTNumbering = CTNumbering.Factory.parse(cTAbstractNumDecimalXML);
        CTAbstractNum cTAbstractNum = cTNumbering.getAbstractNumArray(0);

        XWPFAbstractNum abstractNum = new XWPFAbstractNum(cTAbstractNum);

        XWPFNumbering numbering = document.createNumbering();

        BigInteger abstractNumID = numbering.addAbstractNum(abstractNum);

        BigInteger numID = numbering.addNum(abstractNumID);
        System.out.println("numID: " + numID);
        for (int i = 0; i < 3; i++) {
            paragraph = document.createParagraph();
            paragraph.setNumID(numID);
            run = paragraph.createRun();
            run.setText("List2 item " + i); 
            if (i < 2) paragraph.setSpacingAfter(0);
        }
        paragraph = document.createParagraph();
        run=paragraph.createRun();  
        run.setText("Paragraph after the list2.");
    }

    FileOutputStream out = new FileOutputStream("CreateWordBulletAndDecimalList.docx");    
    document.write(out);

    System.out.println("CreateWordBulletOrDecimalList written successully");
}
}