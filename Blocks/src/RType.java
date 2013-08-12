import javax.swing.JFrame;


public class RType extends JFrame{
	public RType() {
		
		JFrame frame = new JFrame();
		frame.add(new Core());
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new RType();
	}
}
