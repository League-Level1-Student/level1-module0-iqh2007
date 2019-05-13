import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class House {

	static Robot rob = new Robot();

	public static void main(String[] args) {

		rob.setX(50);
		rob.setY(550);

		rob.setSpeed(100);
		rob.penDown();
		rob.setRandomPenColor();

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			drawHouse("small");
		}
		// medium triangle house
		// rob.turn(-90);
		// rob.move(300);
		// rob.turn(50);
		// rob.move(30);
		// rob.turn(90);
		// rob.move(30);
		// rob.turn(40);
		// rob.move(300);

	}

	static void drawHouse(String size) {
		int height;
		if(size.equals("small")) {
			height = 100;
		}
		rob.setRandomPenColor();
		rob.move(200);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(200);
		rob.turn(-90);
		rob.setPenColor(0, 255, 0);
		rob.move(20);
		rob.setAngle(0);
		rob.setPenColor(Color.black);
	}
	
	
	
}
