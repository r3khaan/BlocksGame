import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PlayerBlock{
	
	private Image image;
	private int xpos, ypos;
	private int dx, dy;
	private ImageIcon ii;
	private String direction;
	
	public PlayerBlock(int x, int y) {
		ii = new ImageIcon("/Users/rehaanamaan/Documents/Other/Old/EVERYTHING/Java/Projects/Blocks/src/images/Player.png");
		image = ii.getImage();
		
		xpos = x;
		ypos = y;
		
		direction = "right";
	}
	
	public Image getImage() {
		return image;
	}
	public int getX() {
		return xpos;
	}
	public int getY() {
		return ypos;
	}
	
	public String getDirection() {
		return direction;
	}
	
	public void move() {
		switchImage();
		xpos += (dx * 2);
		ypos += (dy * 2);
	}
	
	
	private void switchImage() {
		if (direction.equals("right")) {
			ii = new ImageIcon("/Users/rehaanamaan/Documents/Other/Old/EVERYTHING/Java/Projects/Blocks/src/images/Player.png");
		} else if (direction.equals("left")) {
			ii = new ImageIcon("/Users/rehaanamaan/Documents/Other/Old/EVERYTHING/Java/Projects/Blocks/src/images/PlayerFlipped.png");
		}
		image = ii.getImage();
	}

	
	public void keyPressed(KeyEvent e) {

	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	            dx = -1;
	            direction = "left";
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            dx = 1;
	            direction = "right";
	        }

	        if (key == KeyEvent.VK_UP) {
	            dy = -1;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            dy = 1;
	        }

	    }
	public void keyReleased(KeyEvent e) {
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	            dx = 0;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            dx = 0;
	        }

	        if (key == KeyEvent.VK_UP) {
	            dy = 0;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            dy = 0;
	        }
	 }

}
