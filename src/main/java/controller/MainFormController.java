package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainFormController {
    public Button btnNextView;
    public Button btnViaNewStage;
    public Button btnModalWindow;

    public void initialize(){
        btnNextView.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                URL resource = this.getClass().getResource("/view/SecondaryForm.fxml");
                try {
                    Parent container = FXMLLoader.load(resource);
                    Scene secondScene = new Scene(container);
                    Stage stage = (Stage) btnNextView.getScene().getWindow(); // The scene is set for the current stage
                    stage.setScene(secondScene);
                    stage.setTitle("My Second Stage");
                    stage.show();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        btnViaNewStage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                URL resource = this.getClass().getResource("/view/SecondaryForm.fxml");
                try {
                    Parent container = FXMLLoader.load(resource);
                    Scene scene = new Scene(container);
                    Stage stage = new Stage();  // create new stage and set the scene
                    stage.setScene(scene);      // create new stage and set the scene
                    stage.setTitle("My second stage");
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        btnModalWindow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                URL resource = this.getClass().getResource("/view/SecondaryForm.fxml");
                try {
                    Parent container = FXMLLoader.load(resource);
                    Scene scene = new Scene(container);
                    Stage stage = new Stage();
//                    Stage stage = (Stage) btnViaNewStage.getScene().getWindow();
                    stage.setScene(scene);
                    stage.setTitle("My Second Stage");
                    stage.initModality(Modality.APPLICATION_MODAL);  // Modal Window
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }

    public void btnNextViewOnMouseClicked(MouseEvent mouseEvent) {

    }

    public void btnViaNewStageOnMouseClicked(MouseEvent mouseEvent) {

    }

    public void btnModalWindowOnMouseClicked(MouseEvent mouseEvent) {

    }


    public void btnNextViewOnAction(ActionEvent actionEvent) {

    }

    public void btnViaNewStageOnAction(ActionEvent actionEvent) {

    }


    public void btnModalWindowOnAction(ActionEvent actionEvent) {
    }
}
