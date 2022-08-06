package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SecondaryFormController {
    public Label lblSecondaryForm;
    public Button btnBack;

    public void initialize(){
        btnBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                URL resource = this.getClass().getResource("/view/MainForm.fxml");
                try {
                    Parent container = FXMLLoader.load(resource);
                    Scene secondScene = new Scene(container);
                    Stage stage = (Stage) btnBack.getScene().getWindow();
                    stage.setScene(secondScene);
                    stage.sizeToScene();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
