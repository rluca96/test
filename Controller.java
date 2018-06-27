
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    AnchorPane blue;
    @FXML
    Pane green;
    @FXML
    AnchorPane red;
    @FXML
    Circle circle;
    private double mouseX, mouseY;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
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
        //red.setOnDragDropped(event -> );
    }
}
