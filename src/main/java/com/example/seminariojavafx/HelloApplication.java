package com.example.seminariojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Scene scene;
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scene = new Scene(loadFXML("ejemplo").load());
        stage.setScene(scene);
        stage.show();
    }

    static FXMLLoader setRoot(String fxml) throws IOException {
        FXMLLoader fxmlLoader = loadFXML(fxml);
        stage.hide();
        scene.setRoot(fxmlLoader.load());
        stage.setResizable(true);
        stage.show();
        return fxmlLoader;
    }

    private static FXMLLoader loadFXML(String fxml) throws IOException {
        return new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
    }

    public static void main(String[] args) {
        launch();
    }
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ejemplo.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
}