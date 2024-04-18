package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VelocityCal extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        Label initialVelocity = new Label("Initial velocity (m/s):");
        Label acceleration = new Label("Acceleration (m/s2):");
        Label time = new Label("Time (s):");
        Label finalVelocity = new Label("Final velocity (m/s):");

        TextField initialVelocityTextField = new TextField();
        TextField accelerationTextField = new TextField();
        TextField timeTextField = new TextField();
        TextField finalVelocityTextField = new TextField();

        initialVelocityTextField.setEditable(true);
        accelerationTextField.setEditable(true);
        timeTextField.setEditable(true);


        initialVelocityTextField.setPrefColumnCount(3);
        accelerationTextField.setPrefColumnCount(3);
        timeTextField.setPrefColumnCount(3);
        finalVelocityTextField.setPrefColumnCount(3);

        pane.getChildren().add(initialVelocity);
        pane.getChildren().add(initialVelocityTextField);
        pane.getChildren().add(acceleration);
        pane.getChildren().add(accelerationTextField);
        pane.getChildren().add(time);
        pane.getChildren().add(timeTextField);
        pane.getChildren().add(finalVelocity);
        pane.getChildren().add(finalVelocityTextField);

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);

        Button calculate = new Button("Calculate");
        box.getChildren().add(calculate);

        final double[] initialVelocityValue = new double[1];
        final double[] accelerationValue  = new double[1];
        final double[] timeValue = new double[1];
        final double[] finalVelocityValue = new double[1];

        calculate.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                initialVelocityValue[0] = Double.parseDouble(initialVelocityTextField.getText());
                accelerationValue[0] = Double.parseDouble(accelerationTextField.getText());
                timeValue[0] = Double.parseDouble(timeTextField.getText());
                finalVelocityValue[0] = (initialVelocityValue[0] + (accelerationValue[0] * timeValue[0]));
                finalVelocityTextField.setText(String.valueOf(finalVelocityValue[0]));
            }
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(box);

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Velocity Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}
