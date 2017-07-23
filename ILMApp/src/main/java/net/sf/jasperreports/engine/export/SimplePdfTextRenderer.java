/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2016 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.engine.export;

import java.text.AttributedString;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.MultiColumnText;
import com.lowagie.text.pdf.PdfWriter;

import net.sf.jasperreports.engine.JRPrintText;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.type.RunDirectionEnum;
import net.sf.jasperreports.engine.util.JRStyledText;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public class SimplePdfTextRenderer extends AbstractPdfTextRenderer
{
	/**
	 * 
	 */
	public SimplePdfTextRenderer(JasperReportsContext jasperReportsContext, boolean ignoreMissingFont)
	{
		super(jasperReportsContext, ignoreMissingFont);
	}
	
	
	/**
	 *
	 */
	protected Paragraph getPhrase(JRStyledText styledText, JRPrintText textElement)
	{
		String text = styledText.getText();
		AttributedString as = styledText.getAttributedString();
		Paragraph  paragraph = (Paragraph)pdfExporter.getPhrase(as, text, textElement);
		return paragraph;
	}

	
	@Override
	public void render()
	{
		ColumnText colText = new ColumnText(pdfContentByte);
		if(text.getParagraph() !=null && text.getParagraph().getFirstLineIndent()!=null  && text.getParagraph().getFirstLineIndent()!=0) {
//			MultiColumnText column = new MultiColumnText();
//			try {
//				column.addText(getPhrase(styledText, text));
//				column.addRegularColumns(x + leftPadding, x + width - rightPadding, 24f, 2);
//				column.write(pdfContentByte, pdfContentByte.getPdfDocument(),50);
//				return;
//			} catch (DocumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			int status = ColumnText.START_COLUMN;
			Paragraph p = getPhrase(styledText, text);
			p.setFirstLineIndent(-7f);
			colText.addElement(p);
			System.out.println("=============================");
			System.out.println(getPhrase(styledText, text));
			System.out.println(x + leftPadding);
			System.out.println(pdfExporter.getCurrentPageFormat().getPageHeight() - y - verticalAlignOffset - text.getLeadingOffset());
			System.out.println((x + width - rightPadding)/2);
			System.out.println(pdfExporter.getCurrentPageFormat().getPageHeight() - y - height + bottomPadding);
			
			System.out.println((x + width - rightPadding)/2);
			System.out.println(pdfExporter.getCurrentPageFormat().getPageHeight() - y - verticalAlignOffset - text.getLeadingOffset());
			System.out.println(x + width - rightPadding);
			System.out.println(pdfExporter.getCurrentPageFormat().getPageHeight() - y - height + bottomPadding	);
			
			
			System.out.println("=============================");
			Boolean flag = false;
			int c = 0;
			while (ColumnText.hasMoreText(status)) {
				if(!flag){
					colText.setSimpleColumn(
						x + leftPadding,
						pdfExporter.getCurrentPageFormat().getPageHeight() - y - verticalAlignOffset - text.getLeadingOffset(), 
						x + width/2 -10,
						pdfExporter.getCurrentPageFormat().getPageHeight() - y - height + bottomPadding		
					);
					flag = true;
				}
				else{
					colText.setSimpleColumn(
						x + width/2 + 10,
						pdfExporter.getCurrentPageFormat().getPageHeight() - y - verticalAlignOffset - text.getLeadingOffset(), 
						x + width - rightPadding,
						pdfExporter.getCurrentPageFormat().getPageHeight() - y - height + bottomPadding		
					);
				}
				try{
					status = colText.go();
				}
				catch (DocumentException e){
					throw new JRRuntimeException(e);
				}	
			}
//			while (ColumnText.hasMoreText(status)) {
//				if(!flag) {
//					colText.setSimpleColumn(36, 36, 290, 806);
//					flag = true;
//				}
//				else
//					colText.setSimpleColumn(305, 36, 559, 806);
//				try{
//					status = colText.go();
//				}
//				catch (DocumentException e){
//					throw new JRRuntimeException(e);
//				}	
//			}
			
		}
		else{
			colText.setSimpleColumn(getPhrase(styledText, text),
				x + leftPadding,
				pdfExporter.getCurrentPageFormat().getPageHeight()
					- y
					- topPadding
					- verticalAlignOffset
					- text.getLeadingOffset(),
					//+ text.getLineSpacingFactor() * text.getFont().getSize(),
				x + width - rightPadding,
				pdfExporter.getCurrentPageFormat().getPageHeight()
					- y
					- height
					+ bottomPadding,
				0,//text.getLineSpacingFactor(),// * text.getFont().getSize(),
				horizontalAlignment == Element.ALIGN_JUSTIFIED_ALL ? Element.ALIGN_JUSTIFIED : horizontalAlignment
			);
		}
		
		colText.setLeading(0, text.getLineSpacingFactor());// * text.getFont().getSize());
		colText.setRunDirection(
			text.getRunDirectionValue() == RunDirectionEnum.LTR
			? PdfWriter.RUN_DIRECTION_LTR : PdfWriter.RUN_DIRECTION_RTL
		);

		try
		{
			colText.go();
		}
		catch (DocumentException e)
		{
			throw new JRRuntimeException(e);
		}
	}


	@Override
	public void draw()
	{
		//nothing to do
	}
}
