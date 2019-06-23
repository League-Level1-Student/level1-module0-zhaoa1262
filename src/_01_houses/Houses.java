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
	drawHouse("large"); 
	drawHouse("medium"); 
	drawHouse("small"); 
	drawHouse("large"); 
	drawHouse("small"); 

	
	
}
	
	static void drawHouse(String size) {
	int height = Integer.parseInt(size);
	r.move(height);
	r.turn(-90);
	r.move(-50);
	r.turn(-90);
	r.move(height);
	r.turn(-90);
	r.move(25);
	r.turn(-90);
	}
	
	void drawPointyRoof() {
		r.turn(45);
		r.move(25);
		r.turn(90);
		r.move(25);
	}
	
void drawFlatRoof() {
		r.turn(90);
		r.move(50);
	}

}
