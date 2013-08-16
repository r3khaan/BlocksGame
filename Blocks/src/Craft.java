import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Craft {
	
	PlayerBlock player;
	ArrayList missiles;
	
	public Craft() {
		Initialize();
	}
	
	private void Initialize() {
		player = new PlayerBlock(50, 50);
		missiles  = new ArrayList();
	}
	
	public ArrayList getMissiles() {
		return missiles;
	}
	
	public void fire() {
		missiles.add(new Missile(player.getX(), player.getY(), player.getDirection()));
	}
		
	public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
        		fire();
        }
    }
}
