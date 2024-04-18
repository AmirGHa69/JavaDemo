package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        Label number1 = new Label("Number 1:");
        Label number2 = new Label("Number 2:");
        Label number3 = new Label("Result:");

        TextField num1 = new TextField();
        TextField num2 = new TextField();
        TextField result = new TextField();

        num1.setEditable(true);
        num2.setEditable(true);

        num1.setPrefColumnCount(3);
        num2.setPrefColumnCount(3);
        result.setPrefColumnCount(3);

        pane.getChildren().addAll(number1,num1,number2,num2,number3,result);

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);

        Button add = new Button("ADD");
        Button sub = new Button("SUB");
        Button div = new Button("DIV");
        Button multi = new Button("MULTI");

        box.getChildren().addAll(add,sub,div,multi);

        final double[] value1 = new double[1];
        final double[] value2  = new double[1];
        final double[] resultValue = new double[1];

        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                value1[0] = Double.parseDouble(num1.getText());
                value2[0] = Double.parseDouble(num2.getText());
                resultValue[0] = value1[0]+value2[0];
                result.setText(String.valueOf(resultValue[0]));

            }
        });
        sub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                value1[0] = Double.parseDouble(num1.getText());
                value2[0] = Double.parseDouble(num2.getText());
                resultValue[0] = value1[0]-value2[0];
                result.setText(String.valueOf(resultValue[0]));

            }
        });
        div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                value1[0] = Double.parseDouble(num1.getText());
                value2[0] = Double.parseDouble(num2.getText());
                resultValue[0] = value1[0]/value2[0];
                result.setText(String.valueOf(resultValue[0]));

            }
        });
        multi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                value1[0] = Double.parseDouble(num1.getText());
                value2[0] = Double.parseDouble(num2.getText());
                resultValue[0] = value1[0]*value2[0];
                result.setText(String.valueOf(resultValue[0]));

            }
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(box);


        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}






