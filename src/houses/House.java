package houses;

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
			int size = rand.nextInt(3);
			if (size == 0) {
				drawHouse("small");
			} else if (size == 1) {
				drawHouse("medium");
			}

			else if (size == 2) {
				drawHouse("large");
			}

		}

	}

	static void drawHouse(String size) {
		int height = 0;

		if (size.equals("small")) {
			height = 60;
		}

		else if (size.equals("medium")) {
			height = 120;
		}

		else if (size.equals("large")) {
			height = 250;

		}

		rob.setRandomPenColor();
		rob.move(height);
		if (size.equals("large")) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}

		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 255, 0);
		rob.move(20);
		rob.setAngle(0);

	}

	static void drawPointyRoof() {
		rob.setAngle(0);
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
	}

	static void drawFlatRoof() {
		rob.setAngle(0);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}

}
