package com.sh.webscraper;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField sUrl;

    @FXML
    protected void onButtonClick() {
    String url = sUrl.getText();

    }
}