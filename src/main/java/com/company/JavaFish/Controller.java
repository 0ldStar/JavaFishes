package com.company.JavaFish;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private AnchorPane pane;

    @FXML
    void keyPressed(KeyEvent event) {
        System.out.println("ABOBA");

    }

    @FXML
    void keyReleased(KeyEvent event) {
        System.out.println("ABOBA");

    }

    @FXML
    void keyTyped(KeyEvent event) {
        System.out.println("ABOBA");

    }

    @FXML
    void mouseClick(MouseEvent event) {
        System.out.println("ABEBA");

    }

    @FXML
    void initialize() {
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
