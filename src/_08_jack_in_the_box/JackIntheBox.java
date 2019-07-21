package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class JackIntheBox implements ActionListener {
	
int x=0;
JButton button = new JButton();
JPanel panel = new JPanel();
	public void showButton() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.add(button);
		frame.pack();

	button.addActionListener(this);
	button.setLabel("Surprise");
		


	
		
	}






private void showPicture(String fileName) {
    try {
        JLabel imageLabel = createLabelImage(fileName);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(imageLabel);
        frame.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private JLabel createLabelImage(String fileName) {
	try {
            java.net.URL imageURL = getClass().getResource(fileName);
            if (imageURL == null) {
	       System.err.println("Could not find image " + fileName);
	       return new JLabel();
            } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
            }
        } catch (Exception e) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
}
private void playSound(String soundFile) { 
    try {
        AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
        sound.play();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	
	if(buttonPressed==button) {
		x = x + 1;
	}
	if(x==5) {
		panel.add(createLabelImage("jackInTheBox.png"));
		
		//createLabelImage("jackInTheBox.png");
			showPicture("jackInTheBox.png");
			playSound("homer-woohoo.wav");
		}
	
}
}
