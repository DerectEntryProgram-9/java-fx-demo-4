import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent container = FXMLLoader.load(this.getClass().getResource("view/MainForm.fxml"));
        var scene = new Scene(container);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Java FX Demo 4");
        primaryStage.show();
        primaryStage.centerOnScreen();
    }
}
