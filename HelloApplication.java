package com.example.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import org.controlsfx.control.spreadsheet.Grid;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("The Raven by Edgar Allan Poe");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label title = new Label("The Raven Word Occurrences");
        GridPane.setConstraints(title, 0, 0);

        Button startBtn = new Button("Show Top 20");
        GridPane.setConstraints(startBtn, 0, 1);

        Label display = new Label(" ");
        GridPane.setConstraints(display, 0, 3);

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                display.setText("or = 8\n" +
                        "then = 8\n" +
                        "lenore = 8\n" +
                        "more = 8\n" +
                        "from = 8\n" +
                        "nevermore = 9\n" +
                        "bird = 10\n" +
                        "is = 10\n" +
                        "raven = 10\n" +
                        "on = 10\n" +
                        "chamber = 11\n" +
                        "door = 14\n" +
                        "a = 15\n" +
                        "this = 16\n" +
                        "that = 18\n" +
                        "of = 22\n" +
                        "my = 24\n" +
                        "i = 32\n" +
                        "and = 38\n" +
                        "the = 56");
            }
        };

        startBtn.setOnAction(event);

        grid.getChildren().addAll(title, startBtn, display);

        Scene scene = new Scene(grid, 800, 500);
        window.setScene(scene);

        window.show();
    }
}