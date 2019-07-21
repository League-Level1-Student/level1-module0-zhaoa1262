package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {

	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	JButton duck = new JButton ("duck");
	JButton frog = new JButton ("frog");
	JButton unicorn = new JButton ("unicorn");
	
	public void showButton() {
		// TODO Auto-generated method stub
		frame.setVisible(true);;
		
		duck.addActionListener(this);
		 frog.addActionListener(this);
		 unicorn.addActionListener(this);
		 
		panel.add(duck);
		panel.add(frog);
		panel.add(unicorn);
		frame.add(panel);
		frame.pack();
		
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed==duck) {
			showDucks();
		}
		
		if (buttonPressed==frog) {
			showFrog();
		}
		
		if (buttonPressed==unicorn) {
			showFluffyUnicorns();
		}
	}
	
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
