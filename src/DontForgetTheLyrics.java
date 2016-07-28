import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "After listening to the song, type in the rest of the lyrics.");


	
		// 5. Use the playSound method to play your song.
playSound("/IntroToJavaWorkshop-master2/src/Mark Ronson - Uptown Funk ft. Bruno Mars");
		// 6. Make a pop-up for the player to type their answer.

JOptionPane.showInputDialog("Please type the rest of the lyrics below");
		// 7. If they answered correctly, tell them that they were right.

		// 8. Otherwise, tell them they are wrong, and give them the answer.

		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}

