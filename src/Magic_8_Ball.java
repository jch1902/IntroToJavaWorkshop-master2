// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic_8_Ball {

  public static void main(String[]arg){

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int Random = new Random().nextInt(4);
		// 3. Print out this variable
System.out.print(int.class);
		// 4. Get the user to enter a question for the 8 ball
	String ask =
			JOptionPane.showInputDialog("Ask the Magic 8 ball a question");
	int x = 0;
	int y = 1;
	int z = 2;
	int a = 3;
		// 5. If the random number is 0
if(Random == 0)
{
	JOptionPane.showMessageDialog(null, "Yes");
}
		// -- tell the user "Yes"

		// 6. If the random number is 1
if(Random == 1){
	JOptionPane.showMessageDialog(null, "No");
}


		// -- tell the user "No"

		// 7. If the random number is 2
if(Random == 2){
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
if(Random == 3){
	JOptionPane.showMessageDialog(null, "Hmm...Tough question, maybe you should think about it yourself.");
}
		// -- write your own answer
 
  }

	
}

