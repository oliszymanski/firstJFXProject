package sample;


/*
=================================================================================
	IMPORTS:
=================================================================================
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/*
=================================================================================
	MAIN PROGRAM CODE:
=================================================================================
*/
public class hyperLink extends Application {

	int win_width = 400, win_height = 350;		// main window (stage) parameters (window width and window height)



	@Override
	public void start(Stage stage) throws Exception {


	/*
	=================================================================================
		OBJECTS:
	=================================================================================
	*/

		Hyperlink link = new Hyperlink("some link");	//defining hyperlink
		VBox vb = new VBox(link);
		Scene s0 = new Scene(vb);



	/*
	=================================================================================
		MAIN:
	=================================================================================
	*/

		stage.setTitle("JavaFX hyperlink stage");		//stage title

		stage.setWidth(win_width);		//stage width and height
		stage.setHeight(win_height);

		stage.setScene(s0);				//stage scene

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


/*
=================================================================================
	END OF FILE
=================================================================================
*/