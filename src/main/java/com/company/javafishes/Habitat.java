package com.company.javafishes;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.util.Random;

public class Habitat {
    public Habitat(Pane root, int _P1, int _P2, int _N1, int _N2) {
        super();
        N1 = _N1;
        N2 = _N2;
        P1 = _P1;
        P2 = _P2;
        arr = new Fish[10];
        group = root;

//        scene.setFill(Color.AQUA);
    }

//    public Scene getScene() {
//        return scene;
//    }

//    public Group getGroup() {
//        return group;
//    }

    public void update() {
        Timeline timeline1 = new Timeline(
                new KeyFrame(Duration.millis(N1), ae -> {
                    System.out.println("YEAP");
                    Random random = new Random();
                    int P = random.nextInt(100);
                    if (P1 <= P) {
                        try {
                            bornGold();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                }
                )
        );
        Timeline timeline2 = new Timeline(
                new KeyFrame(Duration.millis(N2), ae -> {
                    Random random = new Random();
                    int P = random.nextInt(100);
                    if (P2 <= P) {
                        try {
                            bornGuppy();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                }
                )
        );
        timeline1.play();
        timeline2.play();
    }

    private void bornGold() throws FileNotFoundException {
        Random random = new Random();
        GoldenFish fish = new GoldenFish(random.nextInt((int) 900), random.nextInt((int) 800));
        group.getChildren().add(fish.getImageView());
    }

    private void bornGuppy() throws FileNotFoundException {
        Random random = new Random();
        GuppyFish fish = new GuppyFish(random.nextInt((int) 900), random.nextInt((int) 800));
        group.getChildren().add(fish.getImageView());
    }

    private
    Fish[] arr;
    Pane group;
    //    Scene scene;
    int P1, P2;
    int N1, N2;
}
