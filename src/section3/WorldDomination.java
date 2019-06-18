package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String a=JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(a.equals("yes")) {
			
			speak("You will rule the world");
			
		}
		else {
			
			speak("If you dont know coding, good luck washing dishes!");
			
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
}

