module com.sh.webscraper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sh.webscraper to javafx.fxml;
    exports com.sh.webscraper;
}