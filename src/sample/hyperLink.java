package sample;


/*
=================================================================================
	IMPORTS:
=================================================================================
*/
import javafx.application.Application;
import javafx.scene.control.Hyperlink;
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

		stage.setTitle("JavaFX hyperlink");

		Hyperlink link = new Hyperlink("this is a link");//defining hyperlink


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