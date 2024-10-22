package lab2;


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		// Task #1: instantiate the FXMainPane and name it root
		FXMainPane root = new FXMainPane();
		
		// Task #1: Set the scene with root and define window size (e.g., 400x300)
		Scene scene = new Scene(root, 400, 300);
		
		// Task #1: Set the scene to the stage
		stage.setScene(scene);
		
		// Set the title of the stage
		stage.setTitle("Hello World GUI");
		
		// Display the stage
		stage.show();
	}
}
