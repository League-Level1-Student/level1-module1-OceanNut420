package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		
	String ewe = JOptionPane.showInputDialog("what flavor popcorn?");
	String min = JOptionPane.showInputDialog("how many minutes?");
	int cat = Integer.parseInt(min);
	Popcorn p = new Popcorn(ewe);
	Microwave m = new Microwave();
	m.putInMicrowave(p);
	m.setTime(cat);
	m.startMicrowave();
	
	}
}
