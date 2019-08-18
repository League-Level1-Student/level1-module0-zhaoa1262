package Worksheets;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ModuleCheckpoint implements KeyListener  {
	JFrame frame = new JFrame();
	
	
public void run() {
	
	frame.setVisible(true);
	frame.setTitle("Press a Key");
	frame.addKeyListener(this);
	frame.pack();
	
	
}

static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }



@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

	speak("ouch");
		
		
}




@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


}



