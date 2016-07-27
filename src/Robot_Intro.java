import org.jointheleague.graphical.robot.Robot;

public class Robot_Intro {
	public static void main(String[] args) {
	Robot NOTHING = new Robot ();
	Robot jasper = new Robot(200,300);
	Robot evan = new Robot(500,600);
	Robot brandon = new Robot(700,300);
	int not = 1;
	
	while(not<=1){
		NOTHING.penDown();
		NOTHING.setSpeed(10);
	NOTHING.move(100);
	NOTHING.turn(85);
	not=not+1;
	}
	while(not<=100000){
		evan.penDown();
		evan.move(1);
		evan.turn(1);
		not=not+1;
		}
	}
}
