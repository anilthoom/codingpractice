package com.anilt.poi.word;

/**
 * This program creates a simple WordprocessingML table using POI XWPF API, and
 * a more complex, styled table using both XWPF and ooxml-schema. It's possible
 * that not all referenced wordprocessingml classes are defined in
 * poi-ooxml-schemas-3.8-beta4. If this is the case, you'll need to use the full
 * ooxml-schemas.jar library.
 *
 * @author gisella bronzetti (original)
 * @author Gregg Morris (styled table)
 */
public class SimpleTable {

  /*  public static void main(String[] args) throws Exception {
    	try {
    		createSimpleTable();
    	}
    	catch(Exception e) {
    		System.out.println("Error trying to create simple table.");
    		throw(e);
    	}
    	try {
    		createStyledTable();
    	}
    	catch(Exception e) {
    		System.out.println("Error trying to create styled table.");
    		throw(e);
    	}
    }

    public static void createSimpleTable() throws Exception {
        XWPFDocument doc = new XWPFDocument();

        try {
            XWPFTable table = doc.createTable(3, 3);

            table.getRow(1).getCell(1).setText("EXAMPLE OF TABLE");

            // table cells have a list of paragraphs; there is an initial
            // paragraph created when the cell is created. If you create a
            // paragraph in the document to put in the cell, it will also
            // appear in the document following the table, which is probably
            // not the desired result.
            XWPFParagraph p1 = table.getRow(0).getCell(0).getParagraphs().get(0);

            XWPFRun r1 = p1.createRun();
            r1.setBold(true);
            r1.setText("The quick brown fox");
            r1.setItalic(true);
            r1.setFontFamily("Courier");
            r1.setUnderline(UnderlinePatterns.DOT_DOT_DASH);
            r1.setTextPosition(100);

            table.getRow(2).getCell(2).setText("only text");

            OutputStream out = new FileOutputStream("simpleTable.docx");
            try {
                doc.write(out);
            } finally {
                out.close();
            }
        } finally {
//            doc.close();
        }
    }
    *//**
     * Create a table with some row and column styling. I "manually" add the
     * style name to the table, but don't check to see if the style actually
     * exists in the document. Since I'm creating it from scratch, it obviously
     * won't exist. When opened in MS Word, the table style becomes "Normal".
     * I manually set alternating row colors. This could be done using Themes,
     * but that's left as an exercise for the reader. The cells in the last
     * column of the table have 10pt. "Courier" font.
     * I make no claims that this is the "right" way to do it, but it worked
     * for me. Given the scarcity of XWPF examples, I thought this may prove
     * instructive and give you ideas for your own solutions.

     * @throws Exception
     *//*
    public static void createStyledTable() throws Exception {
    	// Create a new document from scratch
        XWPFDocument doc = new XWPFDocument();

        try {
            // -- OR --
            // open an existing empty document with styles already defined
            //XWPFDocument doc = new XWPFDocument(new FileInputStream("base_document.docx"));

            // Create a new table with 6 rows and 3 columns
            int nRows = 6;
            int nCols = 3;
            XWPFTable table = doc.createTable(nRows, nCols);
            

            // Set the table style. If the style is not defined, the table style
            // will become "Normal".
            CTTblPr tblPr = table.getCTTbl().getTblPr();
            CTString styleStr = tblPr.addNewTblStyle();
            styleStr.setVal("StyledTable");

            // Get a list of the rows in the table
            List<XWPFTableRow> rows = table.getRows();
            int rowCt = 0;
            int colCt = 0;
            for (XWPFTableRow row : rows) {
                // get table row properties (trPr)
                CTTrPr trPr = row.getCtRow().addNewTrPr();
                // set row height; units = twentieth of a point, 360 = 0.25"
                CTHeight ht = trPr.addNewTrHeight();
                ht.setVal(BigInteger.valueOf(360));

                // get the cells in this row
                List<XWPFTableCell> cells = row.getTableCells();
                // add content to each cell
                for (XWPFTableCell cell : cells) {
                    // get a table cell properties element (tcPr)
                    CTTcPr tcpr = cell.getCTTc().addNewTcPr();
                    // set vertical alignment to "center"
                    CTVerticalJc va = tcpr.addNewVAlign();
                    va.setVal(STVerticalJc.CENTER);

                    // create cell color element
                    CTShd ctshd = tcpr.addNewShd();
                    ctshd.setColor("auto");
                    ctshd.setVal(STShd.CLEAR);
                    if (rowCt == 0) {
                        // header row
                        ctshd.setFill("A7BFDE");
                    } else if (rowCt % 2 == 0) {
                        // even row
                        ctshd.setFill("D3DFEE");
                    } else {
                        // odd row
                        ctshd.setFill("EDF2F8");
                    }

                    // get 1st paragraph in cell's paragraph list
                    XWPFParagraph para = cell.getParagraphs().get(0);
                    // create a run to contain the content
                    XWPFRun rh = para.createRun();
                    // style cell as desired
                    if (colCt == nCols - 1) {
                        // last column is 10pt Courier
                        rh.setFontSize(10);
                        rh.setFontFamily("Courier");
                    }
                    if (rowCt == 0) {
                        // header row
                        rh.setText("header row, col " + colCt);
                        rh.setBold(true);
                        para.setAlignment(ParagraphAlignment.CENTER);
                    } else {
                        // other rows
                        rh.setText("row " + rowCt + ", col " + colCt);
                        para.setAlignment(ParagraphAlignment.LEFT);
                    }
                    colCt++;
                } // for cell
                colCt = 0;
                rowCt++;
            } // for row

            // write the file
            OutputStream out = new FileOutputStream("styledTable.docx");
            try {
                doc.write(out);
            } finally {
                out.close();
            }
        } finally {
//            doc.close();
        }
    }*/
}