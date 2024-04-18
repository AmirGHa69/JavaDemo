package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.net.URL;
import java.util.Random;

public class TicTacToe extends Application {
    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                ImageView imageView = new ImageView(getRandomImage());
                imageView.setFitWidth(100);
                imageView.setFitHeight(100);
                gridPane.add(imageView, col, row);
            }
        }
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe");
        stage.show();
    }
    private Image getRandomImage() {
        URL image1 = this.getClass().getResource("TicTacToe_0.png");
        URL image2 = this.getClass().getResource("TicTacToe_X.png");
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if (randomNum == 0) {
            return new Image(String.valueOf(image1));
        } else if (randomNum == 1) {
            return new Image(String.valueOf(image2));
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}