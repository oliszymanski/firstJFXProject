package sample;


/*
=================================================================================
	IMPORTS:
=================================================================================
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



/*
=================================================================================
	MAIN PROGRAM CODE:
=================================================================================
*/

public class button extends Application {

	int win_width = 600, win_height = 550;		// main window (stage) parameters (window width and window height)
	int btn_width = 150, btn_height = 25;	//button parameters
	String btn_style = "-fx-border-color: #f0f0f0; -fx-border-width: 1px;";		//button styling

	@Override
	public void start(Stage stage) throws Exception {



	/*
	=================================================================================
		OBJECTS:
	=================================================================================
	*/

		Button btn = new Button("Click me please!");	//creating a button
		Button btn1 = new Button("Click me too!");

		HBox hbox = new HBox(btn, btn1);

		Scene sc = new Scene(hbox, btn_width, btn_height);			//creating a scene


	/*
	=================================================================================
		MAIN:
	=================================================================================
	*/

		btn.setMaxSize(btn_width, btn_height);
		btn1.setStyle(btn_style);

		stage.setTitle("new some window");			//setting up the main stage
		stage.setMaxWidth(win_width);
		stage.setMaxHeight(win_height);

		stage.setScene(sc);
		stage.show();			//displaying the whole stage

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
