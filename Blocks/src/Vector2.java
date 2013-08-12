
public class Vector2 {
	public int x, y;
	
	public Vector2(int X, int Y) {
		x = X;
		y = Y;
	}
	
	public void add(Vector2 vector) {
		x += vector.x;
		y += vector.y;
	}
	
	public void multiply(Vector2 vector) {
		x *= vector.x;
		y *= vector.y;
	}
	
	
	
	
}
