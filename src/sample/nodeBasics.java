package sample;


/*
=================================================================================
	IMPORTS:
=================================================================================
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/*
=================================================================================
	MAIN PROGRAM CODE:
=================================================================================
*/

public class nodeBasics extends Application {

	int win_width = 600, win_height = 550;		// main window (stage) parameters (window width and window height)



	@Override
	public void start(Stage stage) throws Exception {



	/*
	=================================================================================
		OBJECTS:
	=================================================================================
	*/

		Pane pane = new Pane();		//creating a pane

		Circle c0 = new Circle(50, Color.BLUE);
		Rectangle r0 = new Rectangle(100, 100, Color.RED);



		/*
		=================================================================================
			MAIN:
		=================================================================================
		*/

		pane.setStyle("-fx-background-color: #2F2F2F");		//setting up the pane
		pane.setPrefSize(200, 200);

		c0.relocate(20, 20);		//relocating circle and rectangle
		r0.relocate(70, 70);

		pane.getChildren().addAll(c0, r0);	//adding all children to pane

		Scene s0 = new Scene(pane);			//setting the scene with object pane

		stage.setWidth(win_width);			//setting the scene for stage and displaying it
		stage.setHeight(win_height);
		stage.setScene(s0);
		stage.show();

	}



	/*
	=================================================================================
		RUN APPLICATION:
	=================================================================================
	*/

	@Override
	public void init() throws Exception {
		System.out.println("AppStatus> opened");
	}



	@Override
	public void stop() throws Exception {
		System.out.println("AppStatus> closed");
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