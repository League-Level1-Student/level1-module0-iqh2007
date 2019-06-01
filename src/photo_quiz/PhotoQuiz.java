package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		
		String pig = "https://cdn.wallpapersafari.com/28/92/w5NUjp.jpg";

		// 2. create a variable of type "Component" that will hold your image
		
		Component babypig;
		
		// 3. use the "createImage()" method below to initialize your Component
		
		babypig = createImage(pig);

		// 4. add the image to the quiz window
		
		quizWindow.add(babypig);

		// 5. call the pack() method on the quiz window
		
		quizWindow.pack();

		// 6. ask a question that relates to the image
		
		String question = JOptionPane.showInputDialog("What color is the baby pig?");

		// 7. print "CORRECT" if the user gave the right answer
		
		if(question.equals("pink")) {
			System.out.println("correct!");
		}
		
		// 8. print "INCORRECT" if the answer is wrong
		
		else {
			System.out.println("wrong!");
		}
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		
		quizWindow.remove(babypig);
		
		// 10. find another image and create it (might take more than one line
		// of code)
		
		String cute = "https://i.imgur.com/Nbuz72C.jpg";
		Component cuteanimal;
		cuteanimal = createImage(cute);
		quizWindow.add(cuteanimal);
		quizWindow.pack();
		String question2 = JOptionPane.showInputDialog("What animal is this?");
		if(question2.equals("bunny")) {
			System.out.println("correct!");
		}
		else {
			System.out.println("wrong!");
		}
		

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
