import javax.swing.JOptionPane;

public class MadLibs {
public static void main(String[]arg){
	String noun=
		JOptionPane.showInputDialog("Please enter a noun");
	String adjective=
			JOptionPane.showInputDialog("Please enter an adjective");
	String adverb=
			JOptionPane.showInputDialog("Please enter an adverb");
	String verb=
			JOptionPane.showInputDialog("Please enter a verb");
	String noun1=
			JOptionPane.showInputDialog("Please enter a noun");
	String adjective1=
			JOptionPane.showInputDialog("Please enter an adjective");
	System.out.print("There once was a/an " + noun + ". The " + noun + " was wearing a/an " + adjective + " Heart. The " + noun + " " + verb + "s really " + adverb +"." + "There was also a/an " + noun1 + ". It was very "+ adjective1 + ".");
} 
}
