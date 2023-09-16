package lk.ijse.recolter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
            Parent rootNode = FXMLLoader.load(getClass().getResource("/view/login_form.fxml"));
            Scene scene = new Scene(rootNode);
            stage.setTitle("Recolter");
            stage.initStyle(StageStyle.UNDECORATED);
            stage.centerOnScreen();
            stage.setScene(scene);
            stage.show();
    }
}
