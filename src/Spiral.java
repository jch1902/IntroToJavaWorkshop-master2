import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot jasper = new Robot();
		
		// 5. Set your robot's pen to the down position
		jasper.penDown();
		

		// 3. Set the robot to go at max speed (10)
		jasper.setSpeed(10);

		// 4. Repeat the code below 75 times (you’ll need to move the mustache!)
		for(int i=0;i<10000000;i=i+2){
			jasper.setRandomPenColor();
			jasper.setPenWidth(i);
			jasper.move(i*5);
			jasper.turn(360/7);
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
		}	

	}
}