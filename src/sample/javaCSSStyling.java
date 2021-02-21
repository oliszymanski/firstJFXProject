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

public class javaCSSStyling extends Application {

	int win_width = 600, win_height = 550;		// main window (stage) parameters (window width and window height)

	String styles_01 = "-fx-background-color: #0000ff;" + "-fx-border-color: #ff0000;" ;
	String styles_02 = "-fx-background-color: #7f7f7f;" + "border-color: #;";


	@Override
	public void start(Stage stage) throws Exception {

		/*
		=================================================================================
			OBJECTS:
		=================================================================================
		*/

		Label label = new Label("some sentence");
		Button btn1 = new Button("Click on me");
		Button btn2 = new Button("Click on me now!");
		Scene scene = new Scene(btn1);
		Scene s2 = new Scene(btn2);




		/*
		=================================================================================
			MAIN:
		=================================================================================
		*/

		btn1.setStyle(styles_01);
		btn2.setStyle(styles_02);

		stage.setScene(s2);

		stage.show();

	}


	@Override
	public void init() throws Exception {
		System.out.println("AppStatus> Opened");
	}



	@Override
	public void stop() throws Exception {
		System.out.println("AppStatus> Closed");
	}



	public static void main(String[] args) {
		launch();
	}
}
