package com.company.javafishes;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private AnchorPane pane;

    @FXML
    void keyReleased(KeyEvent event) {
        System.out.println("ABOBA");
        System.out.println(event.getCharacter());
    }

}
