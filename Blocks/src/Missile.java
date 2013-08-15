import java.awt.Image;

import javax.swing.ImageIcon;


public class Missile {
	private String _direction;
	private int	_speed;
	private int _boardWidth;
	private boolean _visible;
	private int _xpos, _ypos;
	private Image _image;
	
	public Missile(int x, int y, String dir) {
		_direction = dir;
		_speed = 1;
		_visible = true;
		_boardWidth = 400;
		_xpos = x;
		_ypos = y;
		
		ImageIcon ii = new ImageIcon();
		
		if (_direction.equals("right")) {
			ii = new ImageIcon("/Users/rehaanamaan/Documents/Other/Old/EVERYTHING/Java/Projects/Blocks/src/images/Player.png");
		}
		if (_direction.equals("left")) {
			ii = new ImageIcon("/Users/rehaanamaan/Documents/Other/Old/EVERYTHING/Java/Projects/Blocks/src/images/PlayerFlipped.png");
		}
		_image = ii.getImage();

	}
	
	public int getX() {
		return _xpos;
	}
	
	public int getY() {
		return _ypos;
	}
	
	public Image getImage() {
		return _image;
	}
	
	public boolean isVisible() {
		return _visible;
	}
	
	public void move() {
		if (_xpos > _boardWidth || _xpos < 0) {
			_visible = false;
		} else {
			_xpos += _speed;
		}
	}
	
}
