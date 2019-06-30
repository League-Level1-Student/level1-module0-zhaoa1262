package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r = new Robot ("mini");
public static void main(String[] args) {
	
	r.setX(20);
	r.setY(500);
	r.penDown();
	r.setSpeed(10);
	
	
	drawHouse("medium"); 
	drawHouse("large");
	drawHouse("small");
	drawHouse("medium"); 
	drawHouse("small");
	drawHouse("large");
	drawHouse("small");
	drawHouse("large");
	drawHouse("medium"); 
	
}
	
	static void drawHouse(String size) {
	int height = 60;
	if(size.equals("large")) {
		height = 250;
		r.setPenColor(102, 0, 51);
		r.move(height);
		drawFlatRoof();
		r.move(height);
		r.turn(-90);
		r.setPenColor(128, 255, 0);
		r.move(25);
		r.turn(-90);
	}
	else if(size.equals("medium")) {
		height = 120;
		r.setPenColor(102, 0, 51);
		r.move(height);
		r.turn(-90);
		drawPointyRoof();
		r.move(height);
		r.turn(-90);
		r.setPenColor(128, 255, 0);
		r.move(25);
		r.turn(-90);
	}
	else if(size.equals("small")) {
		r.setPenColor(102, 0, 51);
		r.move(height);
		r.turn(-90);
		drawPointyRoof();
		r.move(height);
		r.turn(-90);
		r.setPenColor(128, 255, 0);
		r.move(25);
		r.turn(-90);
	}
	
	
	
	
	}
	
	static void drawPointyRoof() {
		r.turn(-225);
		r.move(25);
		r.turn(90);
		r.move(25);
		r.turn(45);
	}
	
static void drawFlatRoof() {
		r.turn(90);
		r.move(50);
		r.turn(90);
	}

}
