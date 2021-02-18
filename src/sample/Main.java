package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        int sc_width = 400;
        int sc_height = 200;
//      Button button = new Button("Press me");
        primaryStage.setTitle("Primary window");    //call first window "Primary window"

        //some other code that displays the screen...
        Label lbl = new Label("Hello world!");    //Label(s_sentence);
        Scene s1 = new Scene(lbl, sc_width, sc_height);    //Scene(n objects in scene, scene_width, scene_height)
        primaryStage.setScene(s1);
        primaryStage.show();




        //create a second window that will show up with the first one:


        /*Stage stage2 = new Stage();
        stage2.setTitle("Secondary window");    //call second window "Secondary window"
        stage2.show();*/
    }


    //TODO: clean the whole code and commit...

    @Override
    public void init() throws Exception{
        System.out.println("AppState> Opened");
    }

    @Override
    public void stop() throws Exception{
        System.out.println("AppState> Closed");
    }

    public static void main(String[] args) {
        //launching the app:
        launch();
    }
}
