package com.sh.webscraper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 250);
        stage.setTitle("Scraper");
        stage.getIcons().clear();
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon_16x16.png")));
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon_32x32.png")));
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon_64x64.png")));
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon_128x128.png")));
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon_256x256.png")));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}