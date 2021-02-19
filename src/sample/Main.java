package sample;



/*
=================================================================================
	IMPORTS:
=================================================================================
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;



/*
=================================================================================
	MAIN PROGRAM:
=================================================================================
*/

public class Main extends Application {

    int sc_width = 400;     // setting window size (width and height)
    int sc_height = 200;

    @Override
    public void start(Stage primaryStage) throws Exception{



        /*
        =================================================================================
	        OBJECTS:
        =================================================================================
        */

        Label lbl = new Label("Hello world!");    //Label(s_sentence);
        Scene s1 = new Scene(lbl, sc_width, sc_height);    //Scene(n objects in scene, scene_width, scene_height)
        Button button = new Button("Press me");

        Stage stage2 = new Stage();         //creating new stage



        /*
	    =================================================================================
		    MAIN:
	    =================================================================================
	    */

        primaryStage.setTitle("Primary window");        //stage titles
        stage2.setTitle("Secondary window");

        primaryStage.setScene(s1);      //stage scenes

        primaryStage.show();            //displaying stages on screen...

        stage2.show();
    }



    /*
	 =================================================================================
	 	RUN APPLICATION:
	 =================================================================================
	*/

    @Override
    public void init() throws Exception{
        System.out.println("AppState> Opened");
    }



    @Override
    public void stop() throws Exception{
        System.out.println("AppState> Closed");
    }



    public static void main(String[] args) {
        launch();
    }
}
