package lesson5;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/*	***Notes***
 * 
 */
public class Colors extends Application {
	@Override
	public void start(Stage primaryStage) {
//		A stage with a small button, now rotated
//		button inside a pane
		StackPane pane = new StackPane();
		pane.getChildren().add( new Button("StackPane") );
		pane.setRotate(80);
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("StackPane demo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage secondaryStage = new Stage();
		secondaryStage.setTitle("Hello again!");
		secondaryStage.setScene(new Scene(new Button("Second Scene"), 500, 700));
		secondaryStage.show();
		
		Stage stage2 = new Stage();
		Pane pane1 = new Pane();
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane1.widthProperty().divide(2));
		circle.centerYProperty().bind(pane1.heightProperty().divide(2));
		circle.setRadius(50);
//		circle.setStroke(Color.AZURE);
//		circle.setFill(Color.AZURE);
		
//		Note: fxcss takes precedence over set methods
//			must comment this section out to ensure the section below works
//		circle.setStyle("-fx-stroke: black; -fx-fill: red;");
		
		/*Start of Tutorial*/
		Color color = new Color(0.4, 0.77, 0.522, 0.8);
		Color color2 = color.brighter();
		Color color3 = color2.darker();
		Color color4 = Color.color(0.9, 0.32, 0.11, 0.43);
		Color color5 = Color.rgb(234, 10, 210, 0.21);
		
		circle.setFill(color5);
		/*End of tutorial*/
		
		pane1.getChildren().add( circle );
		
		Scene scene2 = new Scene(pane1, 200, 200);
		stage2.setTitle("Show Circle");
		stage2.setScene(scene2);
		stage2.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

//	https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
}
