package com.example.zmienna_char_inkrementacja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
       char ch;
       ch ='x';
       System.out.println("wartosc zmiennej = " + ch);
       ch ++;
       System.out.println("teraz wartosc zmiennej = " + ch);
       ch = 90;
       System.out.println("teraz wartosc zmiennej = " + ch);


}}