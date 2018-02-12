import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		String silence = JOptionPane.showInputDialog("What is so delicate, saying it's name breaks it?");
		// 3. Ask the user a riddle. Here are some ideas: if
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (silence.equalsIgnoreCase("silence")) {
			score++;
			JOptionPane.showMessageDialog(null, "Score: " + score + "\nCorrect!");
		} else {
			JOptionPane.showMessageDialog(null, "Score: " + score + "\nIncorrect, the correct answer was silence");

		}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String smiles = JOptionPane.showInputDialog("What is the longest word in the dictionary?");
		// 3. Ask the user a riddle. Here are some ideas: if
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (smiles.equalsIgnoreCase("smiles")) {
			score++;
			JOptionPane.showMessageDialog(null, "Score: " + score + "\nCorrect!");
		} else {
			JOptionPane.showMessageDialog(null, "Score: " + score
					+ "\nIncorrect, the correct answer was smiles\nbecause there is a mile between each s!");
		}
JOptionPane.showMessageDialog(null, "Your score was "+score+"!");	
	}

	// 2. Make a pop up to show the score.
	
}
