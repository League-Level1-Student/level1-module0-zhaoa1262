package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SoundEffectsMachine implements ActionListener {
	
	JFrame frame = new JFrame(); 
	 JPanel panel = new JPanel();
	 JButton birds = new JButton("birds");
	 JButton bubbles = new JButton("bubbles");
	 JButton crickets = new JButton("crickets");
	 
	public void showButton() {
		 
		 
		 birds.addActionListener(this);
		 bubbles.addActionListener(this);
		 crickets.addActionListener(this);
		 
		 frame.setVisible(true);
		 panel.add(birds);
		 panel.add(bubbles);
		 panel.add(crickets);
		 frame.add(panel);
		 frame.pack();

		 
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	
	
		 private void playSound(String fileName) {
			    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
			    sound.play();
			
	}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) e.getSource();
			if(buttonPressed==birds) {
				playSound("cartoon-birds-2_daniel-simion (1).wav");
			}
			
			else if(buttonPressed==bubbles) {
				playSound("Bubbles-SoundBible.com-810959520.wav");
			}
			
			else if(buttonPressed==crickets) {
				playSound("Night_Sounds_-_Crickets-Lisa_Redfern-591005346.wav");
			}
		}
}
