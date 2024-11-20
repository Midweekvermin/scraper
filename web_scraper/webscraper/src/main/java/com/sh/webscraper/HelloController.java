package com.sh.webscraper;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField sUrl;

    @FXML
    protected void onButtonClick() {
        try {
            String url = sUrl.getText().toString();
            System.out.println("url: " + url);
            ProcessBuilder processBuilder = new ProcessBuilder("python","src/main/resources/com/sh/webscraper/Scraper.py" ,url);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            System.out.println("Scraper started");
            int exitCode = process.waitFor();
            System.out.println(exitCode);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}