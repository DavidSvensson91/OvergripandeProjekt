package application;

import javafx.scene.shape.Circle;

public class Player {
	static String username;
	static Double xPos = 512.0;
	static Double yPos = 360.0;
	final Double size = 10.0;
	static Circle ball = new Circle();

	public Player() {
		ball.setRadius(size);
		ball.setCenterX(xPos);
		ball.setCenterY(yPos);
		
		
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		Player.username = username;
	}

	public static Double getxPos() {
		return xPos;
	}

	public static void setxPos(Double xPos) {
		Player.xPos = xPos;
		ball.setCenterX(xPos);
	}

	public static Double getyPos() {
		return yPos;
	}
	public static void setyPos(Double yPos) {
		Player.yPos = yPos;
		ball.setCenterY(yPos);
	}
	
}
