package org.ip.demo;

import annotation.TrackTime;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Runner {

    public void doSomething(String s) {
        System.out.println(StringUtils.capitalize(s));
    }

    public void prefix(String s, String prefix) {
        System.out.println(StringUtils.prependIfMissing(s, prefix));
    }

    @TrackTime
    public void generatePdf() throws DocumentException, FileNotFoundException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("HelloIhor.pdf"));

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk("Hello Ihor", font);

        document.add(chunk);
        document.close();
    }

    public static void main(String[] args) {
        Netflix netflix = new Netflix();

        System.out.println(netflix.getMovies());
        netflix.payForSubscription();
        System.out.println(netflix.getMovies());

        System.out.println(new Calculator().minus(3, 5));
        System.out.println(new CalculatorPositive().minus(3, 5));
    }
}
