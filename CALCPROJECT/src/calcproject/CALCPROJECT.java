package calcproject;
import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.stage.Stage;

public class CALCPROJECT extends Application {

    public static void main(String[] args) {
         launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
          Parent gp= FXMLLoader.load(getClass().getResource("CALCGUI.fxml"));

    stage.setScene( new Scene(gp));
stage.setTitle("Calculator");
    stage.show();

    }
    
}
