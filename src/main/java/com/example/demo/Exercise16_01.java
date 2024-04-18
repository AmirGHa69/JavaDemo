package com.example.demo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise16_01 extends Application {
  private final double paneWidth = 500;
  private final double paneHeight = 150;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    Text text = new Text(20, 40, "Programming is fun");
    text.setFont(new Font("Times", 20));
    Pane paneForText = new Pane();
    paneForText.getChildren().add(text);
    paneForText.setStyle("-fx-border-color: gray");

    
    RadioButton rbRed = new RadioButton("Red");
    RadioButton rbYellow = new RadioButton("Yellow");
    RadioButton rbBlack = new RadioButton("Black");
    RadioButton rbOrange = new RadioButton("Orange");
    RadioButton rbGreen = new RadioButton("Green");
    
    ToggleGroup group = new ToggleGroup();
    rbRed.setToggleGroup(group);
    rbYellow.setToggleGroup(group);
    rbBlack.setToggleGroup(group);
    rbBlack.setSelected(true);
    rbOrange.setToggleGroup(group);
    rbGreen.setToggleGroup(group);

    HBox hBox = new HBox(5);
    hBox.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
    hBox.setAlignment(Pos.CENTER);
  
    
    Image image = new Image("https://icons.iconarchive.com/icons/hopstarter/button/128/Button-Previous-icon.png");
    ImageView ivBtnLeft = new ImageView(image);
    ivBtnLeft.setFitHeight(30);
    ivBtnLeft.setFitWidth(30);
    
    ImageView ivBtnRight = new ImageView("https://icons.iconarchive.com/icons/hopstarter/button/128/Button-Next-icon.png");
    ivBtnRight.setFitHeight(30);
    ivBtnRight.setFitWidth(30);
    
    Button btLeft = new Button("", ivBtnLeft);//new Button("<=");
    Button btRight = new Button("",ivBtnRight);//new Button("=>");
    HBox hBoxForButtons = new HBox(5);
    hBoxForButtons.getChildren().addAll(btLeft, btRight);
    hBoxForButtons.setAlignment(Pos.CENTER);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setTop(hBox);
    borderPane.setCenter(paneForText);
    borderPane.setBottom(hBoxForButtons);


    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, paneWidth, paneHeight + 40);
    primaryStage.setTitle("Exercise16_01"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
//    rbRed.setOnAction(e -> text.setStroke(Color.RED));

    rbRed.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        text.setStroke(Color.RED);
      }
    });
    rbYellow.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        text.setStroke(Color.YELLOW);
      }
    });
    rbBlack.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        text.setStroke(Color.BLACK);
      }
    });
    rbGreen.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        text.setStroke(Color.GREEN);
      }
    });
    rbOrange.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        text.setStroke(Color.ORANGE);
      }
    });

    btLeft.setOnAction(e -> {
        text.setX(text.getX() >0? text.getX()-5 :0 );


    });
    btRight.setOnAction(e ->{
        text.setX(text.getX() < paneForText.getWidth()-100? text.getX() +5 : paneForText.getWidth()-100);

    });

    /*btLeft.setOnAction();
    btRight.setOnAction();*/
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
