package org.ip.demo;

import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class RunnerProxy extends Runner {

    @Override
    public void generatePdf() throws DocumentException, FileNotFoundException {
        System.out.println("started:" + LocalDateTime.now());
        super.generatePdf();
        System.out.println("ended:" + LocalDateTime.now());
    }
}
