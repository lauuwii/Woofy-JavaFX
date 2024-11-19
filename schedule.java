package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class schedule extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Header
        Pane headerPane = new Pane();
        headerPane.setPrefHeight(50);
        headerPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        Label headerLabel = new Label("Schedule");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        headerLabel.setTextFill(Color.WHITE);
        headerLabel.setLayoutX(130);
        headerLabel.setLayoutY(15);
        headerPane.getChildren().add(headerLabel);

        // Vaksin & Eat Schedule
        HBox optionBox = new HBox(10);
        optionBox.setAlignment(Pos.TOP_CENTER);
        optionBox.setPadding(new Insets(50,10,50,20));

        Label vaksinScheduleLabel = new Label("Vaksin Schedule");
        vaksinScheduleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        vaksinScheduleLabel.setTextFill(Color.WHITE);
        vaksinScheduleLabel.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        vaksinScheduleLabel.setPadding(new Insets(10));
        vaksinScheduleLabel.setPrefWidth(150);

        Label eatScheduleLabel = new Label("Eat Schedule");
        eatScheduleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        eatScheduleLabel.setTextFill(Color.WHITE);
        eatScheduleLabel.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        eatScheduleLabel.setPadding(new Insets(10));
        eatScheduleLabel.setPrefWidth(150);

        optionBox.getChildren().addAll(vaksinScheduleLabel, eatScheduleLabel);

        // Calendar
        GridPane calendarPane = new GridPane();
        calendarPane.setAlignment(Pos.CENTER);
        calendarPane.setPadding(new Insets(10));
        calendarPane.setHgap(5);
        calendarPane.setVgap(5);

        // Weekday Labels
        Label[] weekdays = new Label[]{
                new Label("S"),
                new Label("M"),
                new Label("T"),
                new Label("W"),
                new Label("T"),
                new Label("F"),
                new Label("S")
        };
        for (int i = 0; i < weekdays.length; i++) {
            weekdays[i].setFont(Font.font("Arial", FontWeight.BOLD, 14));
            calendarPane.add(weekdays[i], i, 0);
        }

        // Calendar Dates
        for (int row = 1; row <= 6; row++) {
            for (int col = 0; col <= 6; col++) {
                Label dateLabel = new Label("");
                dateLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
                if (row == 1 && col > 0) {
                    dateLabel.setText(String.valueOf(col));
                } else if (row > 1) {
                    int date = (row - 1) * 7 + col + 1 - 7;
                    dateLabel.setText(String.valueOf(date));
                }
                if (row == 2 && col == 0) {
                    dateLabel.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                    dateLabel.setTextFill(Color.WHITE);
                }
                if (row == 5 && col == 1) {
                    dateLabel.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                    dateLabel.setTextFill(Color.WHITE);
                }
                calendarPane.add(dateLabel, col, row);
            }
        }

        // Vaksin Schedule
        VBox scheduleBox = new VBox(10);
        scheduleBox.setAlignment(Pos.CENTER_LEFT);
        scheduleBox.setPadding(new Insets(10));

        // Vaksin 1
        Pane vaksin1Pane = new Pane();
        vaksin1Pane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        vaksin1Pane.setPrefHeight(50);

        Label vaksin1DateLabel = new Label("08 Apr");
        vaksin1DateLabel.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        vaksin1DateLabel.setTextFill(Color.WHITE);
        vaksin1DateLabel.setLayoutX(10);
        vaksin1DateLabel.setLayoutY(10);

        Label vaksin1TimeLabel = new Label("17:50");
        vaksin1TimeLabel.setFont(Font.font("Arial", 14));
        vaksin1TimeLabel.setTextFill(Color.WHITE);
        vaksin1TimeLabel.setLayoutX(10);
        vaksin1TimeLabel.setLayoutY(30);

        Label vaksin1NameLabel = new Label("Vaksin Bordetella Bronchiseptica");
        vaksin1NameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vaksin1NameLabel.setTextFill(Color.WHITE);
        vaksin1NameLabel.setLayoutX(150);
        vaksin1NameLabel.setLayoutY(15);

        vaksin1Pane.getChildren().addAll(vaksin1DateLabel, vaksin1TimeLabel, vaksin1NameLabel);

        // Vaksin 2
        Pane vaksin2Pane = new Pane();
        vaksin2Pane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        vaksin2Pane.setPrefHeight(50);

        Label vaksin2DateLabel = new Label("08 Apr");
        vaksin2DateLabel.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        vaksin2DateLabel.setTextFill(Color.WHITE);
        vaksin2DateLabel.setLayoutX(10);
        vaksin2DateLabel.setLayoutY(10);

        Label vaksin2NameLabel = new Label("Vaksin Hepatitis");
        vaksin2NameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vaksin2NameLabel.setTextFill(Color.WHITE);
        vaksin2NameLabel.setLayoutX(150);
        vaksin2NameLabel.setLayoutY(15);

        vaksin2Pane.getChildren().addAll(vaksin2DateLabel, vaksin2NameLabel);

        scheduleBox.getChildren().addAll(vaksin1Pane, vaksin2Pane);

        // Root Pane
        StackPane root = new StackPane();
        root.getChildren().addAll(headerPane, optionBox, calendarPane, scheduleBox);
        root.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setPadding(new Insets(10));

        // Scene and Stage
        Scene scene = new Scene(root, 400, 700);
        primaryStage.setTitle("Schedule App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
