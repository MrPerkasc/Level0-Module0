package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.

		// Get the player to enter an adjective
		String input = JOptionPane.showInputDialog("Do you know how to write code?");
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null,"nice");


		} else {
			JOptionPane.showMessageDialog(null,"Learn");

			
		}

		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

