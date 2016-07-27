import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot jasper=new Robot();
	
	void go() {
	

		// 6. Make the robot go as fast as possible
jasper.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50

		// 7. Do the following (up to step 10) 60 times
for(int l=50;l<60;l=l++){
			// 9. Change the color of the pen to a random color
	jasper.setRandomPenColor();
	jasper.penDown();
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(10);
}		// 10. Turn the tortoise 6 degrees to the right
jasper.turn(6);

	}	


		
	

	





	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		int l = 50;
		jasper.move(l);	
		jasper.turn(125);
			
			
		}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}



