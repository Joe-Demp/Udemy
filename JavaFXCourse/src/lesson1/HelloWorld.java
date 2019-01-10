package lesson1;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class HelloWorld extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button bt = new Button("Hello World!");
		Scene scene = new Scene(bt, 400, 300);
		primaryStage.setTitle("Hello");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage secondaryStage = new Stage();
		secondaryStage.setTitle("Hello again!");
		secondaryStage.setScene(new Scene(new Button("Second Scene"), 500, 700));
		secondaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
