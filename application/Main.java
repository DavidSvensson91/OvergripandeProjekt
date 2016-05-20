package application;
	
import java.awt.Shape;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	
	
	Rectangle r = new Rectangle();
	Player player = new Player();
	private boolean movingUp = true;
	int up = 5;
	int down = 5;
	int right = 5;
	int left = 5;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1024,720);
			
			
			
			r.setX(50);
			r.setY(50);
			r.setWidth(200);
			r.setHeight(100);
		    r.setFill(Color.RED);
		
			scene.addEventHandler(KeyEvent.KEY_PRESSED, event->{
				checkCollisions();
				if(event.getCode()==KeyCode.RIGHT){
					System.out.println("Right");
					player.setxPos(player.getxPos()+right);

					if (player.ball.getBoundsInParent().intersects(r.getBoundsInLocal())) {
						
						right = 0;
						
				} else {
					
					right = +5;
				}
				}
				if(event.getCode()==KeyCode.LEFT){
					System.out.println("Left");
					player.setxPos(player.getxPos()-left);

					if (player.ball.getBoundsInParent().intersects(r.getBoundsInLocal())) {
						
						left = 0;
						
				} else {
					
					left = +5;
				}
				}
				
				
				if(event.getCode()==KeyCode.UP){
					
					System.out.println("Right");
					player.setyPos(player.getyPos()-up);
					
					if (player.ball.getBoundsInParent().intersects(r.getBoundsInLocal())) {
						
						up = 0;
						
				} else {
					
					up = +5;
				}
				}
				
				if(event.getCode()==KeyCode.DOWN){
					System.out.println("Right");
					player.setyPos(player.getyPos()+down);
	
					if (player.ball.getBoundsInParent().intersects(r.getBoundsInParent())) {
						
						down = 0;
						
				} else {
					
					down = +5;
				}
					
				}
				
			});
			
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			root.getChildren().add(player.ball);
			root.getChildren().add(r);
			primaryStage.setScene(scene);
			primaryStage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void checkCollisions() {
		if (player.ball.getBoundsInParent().intersects(r.getBoundsInParent())) {
			r.setFill(Color.BLUE);
			
		
		} else {
			r.setFill(Color.RED);	
		}   
	}

	public static void main(String[] args) {
		launch(args);
	}
}
