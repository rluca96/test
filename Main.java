package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {

    @FXML
    AnchorPane blue;
    @FXML
    AnchorPane green;
    @FXML
    AnchorPane red;
    @FXML
    Circle circle;

    private double mouseX, mouseY;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        circle.setOnMousePressed(e->{
            mouseX = e.getSceneX();
            mouseY = e.getSceneY();
            circle.setCursor(Cursor.MOVE);
        });
        circle.setOnMouseDragged(e->{
            double x;
            double y;
            x = e.getSceneX() - mouseX;
            y = e.getSceneY() - mouseY;
            circle.relocate(x, y);
        });
        circle.setOnMouseReleased(e->{
            circle.setCursor(Cursor.HAND);
        });

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


