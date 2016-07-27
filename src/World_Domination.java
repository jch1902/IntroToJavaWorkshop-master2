import javax.swing.JOptionPane;

public class World_Domination {
	public static void main(String[] args) {
		String correct="yes";
		String yes=
				JOptionPane.showInputDialog("Do you know how to code?");

		if(yes.equals(correct)){
		JOptionPane.showMessageDialog(null, "You will dominate the world");
		}

		// 3. Otherwise, wish them good luck washing dishes.
		else{
			JOptionPane.showMessageDialog(null, "Wow, your life sucks mate.");
		}
	}

	
	}


