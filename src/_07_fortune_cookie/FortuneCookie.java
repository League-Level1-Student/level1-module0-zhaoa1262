package _07_fortune_cookie;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	 public void showButton() {
         System.out.println("Button clicked");
         
          JFrame frame = new JFrame(); 
          frame.setVisible(true);
          JButton button = new JButton();
          frame.add(button);
          frame.pack();
          button.addActionListener(this);
         
          int rand = new Random().nextInt(5);
         
          if(rand==0) {
        	  JOptionPane.showMessageDialog(null, "A dubious friend may be an enemy in camouflage -_- ");
          }
          
          else if (rand==1) {
        	  JOptionPane.showMessageDialog(null, "A good way to keep healthy is to eat more Chinese food -_- ");
          }
          
          else if(rand==2) {
        	  JOptionPane.showMessageDialog(null, "Your shoes will make you happy today -_- ");
          }
          
          else if(rand==3) {
        	  JOptionPane.showMessageDialog(null, "Your life is going great at the moment, do not ruin it -_- ");
          }
          
          else if(rand==4) {
        	  JOptionPane.showMessageDialog(null, "This fortune will not affect your life in any possible way -_- ");
          }
          
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
	}
}

