import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Core extends JPanel implements ActionListener {
	Timer updater;
	PlayerBlock player;
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
		player = new PlayerBlock(50, 50);

	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paint(g2);
		g2.drawImage(player.getImage(), player.getX(), player.getY(), null);	
		g.dispose();
	}
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		player.move();
	}
	
	private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
            craft.keyPressed(e);
        }
    }

}
