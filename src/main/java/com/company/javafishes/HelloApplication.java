package com.company.javafishes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene root = new Scene(fxmlLoader.load(), 900, 800);
        Controller controller = fxmlLoader.getController();
        Habitat habitat = new Habitat(fxmlLoader.getRoot(), 60, 40, 2, 2);
        habitat.update();
        stage.setTitle("Aquarium fish");
//        stage.setScene(habitat.getScene());
        stage.setScene(root);
        stage.getIcons().add(new Image(new FileInputStream("src/image/fill.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}