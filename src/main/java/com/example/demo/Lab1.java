package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.net.URL;


public class Lab1 extends Application {
    @Override
    public void start(Stage Pstage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(15);
        pane.setVgap(15);

        URL image2 = this.getClass().getResource("dog.jpg");
        Image img2= new Image(String.valueOf(image2));
        URL image3 = this.getClass().getResource("chicken.jpg");
        Image img3= new Image(String.valueOf(image3));
        URL image4 = this.getClass().getResource("rooster.jpg");
        Image img4= new Image(String.valueOf(image4));

        double imageSize = 200;

        ImageView imageView1 = new ImageView(new Image(String.valueOf(this.getClass().getResource("Giraffe.jpg"))));
        imageView1.setFitHeight(imageSize);
        imageView1.setFitWidth(imageSize);
        ImageView imageView2 = new ImageView(img2);
        imageView2.setFitHeight(imageSize);
        imageView2.setFitWidth(imageSize);
        ImageView imageView3 = new ImageView(img3);
        imageView3.setFitHeight(imageSize);
        imageView3.setFitWidth(imageSize);
        ImageView imageView4 = new ImageView(img4);
        imageView4.setFitHeight(imageSize);
        imageView4.setFitWidth(imageSize);

        pane.add(imageView1,0,0);
        pane.add(imageView2,1,0);
        pane.add(imageView3,0,1);
        pane.add(imageView4,1,1);

        Scene scene = new Scene(pane);
        Pstage.setTitle("ss");
        Pstage.setScene(scene);
        Pstage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}
