package Worksheets;

import org.jointheleague.graphical.robot.Robot;

public class MethodsCheckpoints {
  static Robot robot = new Robot();
public static void main(String[] args) {
	//1
		//food("apples");
		
	//2
		//truth(3);
		
	//3
		//drawLine();
		
	//4
		//jump(10);
	
	//5
	    jump("piggy");
}
/*1. Call this method so that it prints “I like apples”. 
	static void food(String fruit) {
	       System.out.println("I like " + fruit);
	}*/



	

	/* //2. Call this method to that it prints “Nerds rule”. 

	void truth(int x) {
	       if(x > 5)
	             System.out.println("Geeks rule");
	       else
	              System.out.println("Nerds rule");

	}*/


		/* //3.Use this method to draw a square. Don’t change the method.

	void drawLine() {
	      robot.move(100);
	       robot.turn(90);
	}*/

	//4. Call this method so that it only prints “The mouse jumped over the candlestick”.


	static void jump(int height) {
	       if (height > 100)
	             System.out.println("The mouse jumped over the moon.");
	       if (height > 50)
	              System.out.println("The mouse jumped over the broom.");
	       if (height > 5)
	              System.out.println("The mouse jumped over the candlestick.");
	}
	//5. Finish this method so that it prints: “The mouse jumped over the piggy” when I call it like this: jump("piggy");

	       static void jump(String obstacle) {

	             System.out.println("The mouse jumped over the " + obstacle);
	      }
	
	
	
	
}
	
	

