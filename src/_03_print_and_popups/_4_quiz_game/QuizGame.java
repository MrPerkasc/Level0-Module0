package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog("is water clear?");
		int score = 0;
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null,"correct");
			score += 1;

		} else {
			JOptionPane.showMessageDialog(null,"wrong");

			
		}
		System.out.println(score);
		JOptionPane.showMessageDialog(null, score);

				// 2.  Ask the user a question 
				input = JOptionPane.showInputDialog("is dirt brown?");
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null,"correct");
			score += 1;

		} else {
			JOptionPane.showMessageDialog(null,"wrong");

			
		}
		System.out.println(score);
		JOptionPane.showMessageDialog(null, score);

				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
