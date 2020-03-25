package Evan;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testFilepdf {

	
		// TODO Auto-generated method stub

	
	
	
	

	
	

	    private static final String FILE_NAME = "D:/itext.pdf";

	    public static void main(String[] args) {
	        writeUsingIText();
	        Readpdf();
	    }

	    private static void writeUsingIText() {

	        Document document = new Document();

	        try {

	            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

	            //open
	            document.open();

	            Paragraph p = new Paragraph();
	            p.add("This is my paragraph 1");
	            p.setAlignment(Element.ALIGN_CENTER);

	            document.add(p);

	            Paragraph p2 = new Paragraph();
	            p2.add("This is my paragraph 2"); //no alignment

	            document.add(p2);

	            Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(8);

	            document.add(new Paragraph("This is my paragraph 3", f));

	            //close
	            document.close();

	            System.out.println("Done");
	         
	        } catch (FileNotFoundException | DocumentException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
	    
	    
	    public static void Readpdf() {

	        PdfReader reader;

	        try {

	            reader = new PdfReader("D:/itext.pdf");

	            // pageNumber = 1
	            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

	            System.out.println(textFromPage);

	            reader.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
	    
	    
	}



