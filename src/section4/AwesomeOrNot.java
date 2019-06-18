package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int rand=new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(rand);
	// 4. Get the user to enter something that they think is awesome
	String a=JOptionPane.showInputDialog("Enter somthing you think is awsome:");
	// 5. If the random number is 0
	if(rand==(0)) {
	// -- tell the user whatever they entered is awesome!
	JOptionPane.showMessageDialog(null, a+ " is awsome!");
	}
	// 6. If the random number is 1
	if(rand==(1)) {
	// -- tell the user whatever they entered is awesome!
	JOptionPane.showMessageDialog(null, a+" is ok!");
	}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
	if(rand==(2)) {
	// -- tell the user whatever they entered is awesome!
	JOptionPane.showMessageDialog(null, a+" is boring!");
	// -- tell the user whatever they entered is boring.
	}
	// 8. If the random number is 3
	if(rand==(3)) {
	// -- tell the user whatever they entered is awesome!
	JOptionPane.showMessageDialog(null, a+" is cool!");
	// -- write your own answer

}}}


