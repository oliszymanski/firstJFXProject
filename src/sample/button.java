package sample;


/*
=================================================================================
	IMPORTS:
=================================================================================
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



/*
=================================================================================
	MAIN PROGRAM CODE:
=================================================================================
*/

public class button extends Application {

	int win_width = 600, win_height = 550;		// main window (stage) parameters (window width and window height)


	@Override
	public void start(Stage stage) throws Exception {



	/*
	=================================================================================
		OBJECTS:
	=================================================================================
	*/

		Button btn = new Button("Click me");	//creating a button
		Scene sc = new Scene(btn);			//creating a scene


	/*
	=================================================================================
		MAIN:
	=================================================================================
	*/

		stage.setTitle("new");			//setting upi the main
		stage.setMaxWidth(win_width);
		stage.setMaxHeight(win_height);
		stage.setScene(sc);
		stage.show();

	}


	/*
	 =================================================================================
	 	RUN APPLICATION:
	 =================================================================================
	*/

	@Override
	public void init() throws Exception {
		System.out.println("Application opened");
	}



	@Override
	public void stop() throws Exception {
		System.out.println("Application closed");
	}



	public static void main(String[] args) {
		launch();
	}
}
