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

	String styles = "-fx-background-color: #0000ff;" + "-fx-border-color: #ff0000;" ;



	@Override
	public void start(Stage stage) throws Exception {

		/*
		=================================================================================
			OBJECTS:
		=================================================================================
		*/

		Label label = new Label("some sentence");
		Button btn = new Button("Click on me");
		Scene scene = new Scene(btn);




		/*
		=================================================================================
			MAIN:
		=================================================================================
		*/

		btn.setStyle(styles);

		stage.setScene(scene);

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
