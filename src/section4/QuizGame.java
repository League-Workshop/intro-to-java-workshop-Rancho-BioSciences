package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		
		// 2.  Ask the user a question 
		String a=JOptionPane.showInputDialog("what is this formula for x=(-b+-root(b^2-4ac))/2");
		// 3.  Use an if statement to check if their answer is correct
if(a.equals("quadratic formula")) {
			
			speak("correct");
			score+=1;
		}
		else {
			
			speak("wrong use desmos!");
			
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
String b=JOptionPane.showInputDialog("how many feet is a mile?");
// 3.  Use an if statement to check if their answer is correct
if(b.equals("5,280")) {
	
	speak("correct");
	score+=1;
}
else {
	
	speak("Wrong google is helpful!!!!!");
	
}
// 4.  if the user's answer was
		// 6.  After all the questions have been asked, print the user's score 
		speak(""+score);
		JOptionPane.showMessageDialog(null, "This is your score: "+score);
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
