/*
 * Author : efilipetti
 * Date: May 31, 2021
 * Description:
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Addition extends Application {
	
	Pane pane=new Pane(); 
	Scene scene=new Scene(pane, 400,400);

	@Override
	public void start(Stage primaryStage) {
		Group group=new Group();
		Scene scene=new Scene(group,400,400);
		
	
		TextField txt1=new TextField();
		txt1.setLayoutX(100);
		txt1.setLayoutY(100);
		
		TextField txt2=new TextField();
		txt2.setLayoutX(100);
		txt2.setLayoutY(300);
		
		Label lbl1=new Label();
		lbl1.setLayoutX(100);
		lbl1.setLayoutY(500);
		
		Label lbl2=new Label();
		lbl2.setLayoutX(200);
		lbl2.setLayoutY(500);
		
		Label lbl3=new Label();
		lbl3.setLayoutX(300);
		lbl3.setLayoutY(500);
		
	lbl1.textProperty().bind(txt1.textProperty());
	
		
		
		
		
			txt1.textProperty().addListener((observable,oldValue,newValue) -> {
			System.out.println("nouvelle valeur " + newValue); });
		
		group.getChildren().add(b);
		group.getChildren().add(txt);
		
		 primaryStage.setScene(scene);
		 primaryStage.show();
	
	
	
	
	
	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
