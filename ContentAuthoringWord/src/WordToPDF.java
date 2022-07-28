import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class WordToPDF 
{

	public static void main(String[] args) {
		WordToPDF cwoWord = new WordToPDF();
        cwoWord.ConvertToPDF("C:\\MyWork\\workspace\\Practice\\output.docx", "C:\\MyWork\\workspace\\Practice\\output.pdf");
    }

    public void ConvertToPDF(String docPath, String pdfPath) {
        try {
            InputStream doc = new FileInputStream(new File(docPath));
            //XWPFDocument document = new XWPFDocument(doc);
          /*  PdfOptions options = PdfOptions.create();
            OutputStream out = new FileOutputStream(new File(pdfPath));
            PdfConverter.getInstance().convert(document, out, options);*/
            System.out.println("DONNNNNEEE");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
