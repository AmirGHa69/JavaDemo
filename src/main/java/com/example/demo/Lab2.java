package com.example.demo;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;

public class Lab2 extends Application {
    @Override
    public void start(Stage Pstage) {
        StackPane stackPane = new StackPane();
        stackPane.setAlignment(Pos.CENTER);

        URL image1 = this.getClass().getResource("Giraffe.jpg");
        Image img1= new Image(String.valueOf(image1));
        URL image2 = this.getClass().getResource("dog.jpg");
        Image img2= new Image(String.valueOf(image2));
        URL image3 = this.getClass().getResource("chicken.jpg");
        Image img3= new Image(String.valueOf(image3));
        URL image4 = this.getClass().getResource("rooster.jpg");
        Image img4= new Image(String.valueOf(image4));

        ImageView imageView1 = new ImageView(img1);
        imageView1.setFitHeight(400);
        imageView1.setFitWidth(400);
        ImageView imageView2 = new ImageView(img2);
        imageView2.setFitHeight(300);
        imageView2.setFitWidth(300);
        ImageView imageView3 = new ImageView(img3);
        imageView3.setFitHeight(200);
        imageView3.setFitWidth(200);
        ImageView imageView4 = new ImageView(img4);
        imageView4.setFitHeight(100);
        imageView4.setFitWidth(100);

        stackPane.getChildren().add(imageView1);
        stackPane.getChildren().add(imageView2);
        stackPane.getChildren().add(imageView3);
        stackPane.getChildren().add(imageView4);

        Scene scene = new Scene(stackPane);
        Pstage.setTitle("ss");
        Pstage.setScene(scene);
        Pstage.show();

    }
    public static void main(String[] args) {
        launch();






        }
    }