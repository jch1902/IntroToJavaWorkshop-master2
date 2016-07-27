import javax.swing.JOptionPane;

public class name {
	public static void main(String[]arg){
		String name =
				JOptionPane.showInputDialog("What is your name?");
		String myname="Jasper";
		if(name.equals(myname)){
			JOptionPane.showMessageDialog(null, "YAY!! Your name is the same as mine!!");
		}
		else{
			JOptionPane.showMessageDialog(null, "GET A NEW NAME BRO! IT IS OUTDATED.");
		}
	}
}
