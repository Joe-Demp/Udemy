package lesson2;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/*	***Notes***
 * 	Stage [Title]
 * 		Scene [dimensions]	
 * 			Pane
 * 				Children: Buttons, Shapes etc.
 */
public class Nodes extends Application {
	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		pane.getChildren().add( new Button("StackPane") );
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("StackPane demo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage secondaryStage = new Stage();
		secondaryStage.setTitle("Hello again!");
		secondaryStage.setScene(new Scene(new Button("Second Scene"), 500, 700));
		secondaryStage.show();
		
		Stage stage2 = new Stage();
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.MAGENTA);
		circle.setFill(Color.MAGENTA);
		Pane pane1 = new Pane();
		pane1.getChildren().add( circle );
		
		Scene scene2 = new Scene(pane1, 200, 200);
		stage2.setTitle("Show Circle");
		stage2.setScene(scene2);
		stage2.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
