import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Craft {
	
	ArrayList missiles;
	
	public Craft() {
		Initialize();
	}
	
	private void Initialize() {
		missiles  = new ArrayList();
	}
		
	public void fire() {
		
	}
	
	public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
        		
        }
    }
}
