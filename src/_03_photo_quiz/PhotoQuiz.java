package _03_photo_quiz;
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
		String imageURL1 = "https://i.pinimg.com/originals/21/77/5f/21775f282e47a233f3f570d4597b2c16.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image1 = createImage(imageURL1); 
		// 3. use the "createImage()" method below to initialize your Component
		
		// 4. add the image to the quiz window
		quizWindow.add(image1);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("Which band is this kpop idol from?");
		// 7. print "CORRECT" if the user gave the right answer
		if (question.equals("Stray Kids")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the correct answer is Stray Kids");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image1);
		// 10. find another image and create it (might take more than one line
		// of code)
		String imageURL2 = "https://i1.wp.com/bibandtuck.com/wp-content/uploads/2018/11/word-image-7.jpeg?resize=618%2C381";
		Component image2;
		image2 = createImage(imageURL2);
		// 11. add the second image to the quiz window
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question2 = JOptionPane.showInputDialog("What is the name of this kpop idol?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (question2.equals("Felix")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the correct answer is Felix");
		}

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
