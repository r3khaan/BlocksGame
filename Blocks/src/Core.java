import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Core extends JPanel implements ActionListener {
	Timer updater;
	Craft craft;
	
	public Core() {
		
		addKeyListener(new TAdapter());
        setFocusable(true);
        Initialize();
        updater.start();

    }
	private void Initialize() {
		updater = new Timer(16, this);
		craft = new Craft();
	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paint(g2);
		g2.drawImage(craft.player.getImage(), craft.player.getX(), craft.player.getY(), null);	
		ArrayList ms = craft.getMissiles();
		for (int i = 0; i < ms.size(); i++) {
			Missile m = (Missile) ms.get(i);
			m = (Missile) ms.get(i);
			g2.drawImage(m.getImage(), m.getX(), m.getY(), null);
		}
		g.dispose();
	}
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		craft.player.move();
		ArrayList ms = craft.getMissiles();
		for (int i = 0; i < ms.size(); i++) {
			Missile m = (Missile) ms.get(i);
			if (m.isVisible()) {
				m.move();
			} else {
				ms.remove(i);
			}
		}
		
	}
	
	private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            craft.player.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            craft.player.keyPressed(e);
            craft.keyPressed(e);
        }
    }

}
