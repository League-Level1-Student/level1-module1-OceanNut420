package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		
	Popcorn p = new Popcorn("");
	Microwave m = new Microwave();
	m.putInMicrowave(p);
	m.setTime(1);
	String ewe = JOptionPane.showInputDialog("what flavor popcorn?");
	
	}
}
