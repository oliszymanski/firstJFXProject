package sample;

/*
=================================================================================
IMPORTS:
=================================================================================
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MyJavaClass extends Application{

	int win_width = 550, win_height = 600;	//setup the window parameters

	@Override
	public void start(Stage stage) throws Exception {


		/*
		=================================================================================
		OBJECTS:
		=================================================================================
		*/

		Label lbl1 = new Label("Hello there!");		//labels' texts'...
		Label lbl2 = new Label("Hello there second time");

		Scene sc1 = new Scene(lbl1);		//setting up the scenes
		Scene sc2 = new Scene(lbl2);



		/*
		=================================================================================
		MAIN:
		=================================================================================
		*/


		stage.setTitle("New stage");	//setting up stage title

		stage.setScene(sc1);			//setting the scene on stage...
		stage.setWidth(win_width);
		stage.setHeight(win_height);

		stage.setX(120.0);				//stage position on users screen
		stage.setY(22.0);




		//creating a New stage for the theater:
		Stage st2 = new Stage();

		st2.setTitle("modality stage");

		st2.setScene(sc2);
		st2.setWidth(win_width);
		st2.setHeight(win_height);

		st2.initModality(Modality.APPLICATION_MODAL);	//setting app modality on stage st2

		stage.show();				//for Stage object stage...

		st2.showAndWait();			//for Stage object st2...

	}



	/*
	 =================================================================================
	 	RUN APPLICATION:
	 =================================================================================
	*/

	@Override
	public void init() throws Exception {
		System.out.println("AppStatus> Opened");	//displays app status when window is opened...
	}

	@Override
	public void stop() throws Exception {
		System.out.println("AppStatus> Closed");	//displays app status when window is closed...
	}


	public static void main(String[] args) {
		launch();		//launches the whole application...
	}
}


/*
=================================================================================
	END OF FILE;
=================================================================================
*/