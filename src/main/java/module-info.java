module com.example.zmienna_char_inkrementacja {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zmienna_char_inkrementacja to javafx.fxml;
    exports com.example.zmienna_char_inkrementacja;
}