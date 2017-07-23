package com.ilm.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.MultiColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

public class Test {
	private static String FILE = "c:/mytemp/FirstPdf.pdf";
	public static final String IMAGE = "resources/bg4_1.jpg";

	public static void main(String s[]) throws DocumentException, IOException {
		createPdf1(FILE);
		return;
		
		
	}
	public static void createPdf0(String dest){
		Document doc = new Document(PageSize.A4.rotate());
		// doc.newPage();
		// doc.setMargins(60, 60, 60, 60);
		try {
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(FILE));
			doc.open();
			PdfContentByte canvas = writer.getDirectContentUnder();
			Image image = Image.getInstance(IMAGE);
			image.setAbsolutePosition(0, 0);
			canvas.addImage(image);
			Paragraph heading = new Paragraph("Page Heading", new Font(Font.HELVETICA, 28f, Font.BOLD));
			heading.setSpacingAfter(18f);
			doc.add(heading);
			String text = "<li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li>";
			MultiColumnText columns = new MultiColumnText();
			// float left, float right, float gutterwidth, int numcolumns
			columns.addRegularColumns(36f, doc.getPageSize().getWidth() - 100f, 24f, 2);
			Paragraph para = new Paragraph(text, new Font(Font.HELVETICA, 8f));
			para.setSpacingAfter(9f);
			para.setAlignment(Element.ALIGN_JUSTIFIED);
			// for (int i = 0; i < 8; i++) {
			columns.addElement(para);
			// }

			doc.add(columns);

		} catch (Exception ex) {
			System.err.println(ex);
		} finally {
			doc.close();
		}
	}
	public static void createPdf1(String dest) throws DocumentException, IOException {
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
		document.open();
		ColumnText ct = new ColumnText(writer.getDirectContent());
		Paragraph p = new Paragraph("<li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li>");
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		ct.addElement(p);
		
		p = new Paragraph("<li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li>");
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		ct.addElement(p);
		
		p = new Paragraph("<li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li>");
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		ct.addElement(p);
		
		p = new Paragraph("<li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li>");
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		ct.addElement(p);
		
		p = new Paragraph("<li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li>");
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		ct.addElement(p);
		
		p = new Paragraph("<li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li>");
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		ct.addElement(p);
		Rectangle[] columns = { new Rectangle(36, 36, 290, 806), new Rectangle(305, 36, 559, 806) };
		int c = 0;
		int status = ColumnText.START_COLUMN;
		boolean flag = false;
		while (ColumnText.hasMoreText(status)) {
			if(!flag) {
				ct.setSimpleColumn(36, 36, 290, 806);
				flag = true;
			}
			else
				ct.setSimpleColumn(305, 36, 559, 806);
			status = ct.go();
			if (++c == 2) {
				document.newPage();
				c = 0;
			}
		}
		document.close();
	}
}