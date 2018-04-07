import javax.swing.*;
import java.awt.*;
public class Example3_5 extends JPanel{

	public Example3_5(Color backColor) {
		setBackground(backColor);
	}
	public void paint(Graphics g) {
	    super.paint(g);
	    g.drawLine(0,0,100,100);
	    g.drawLine(10, 10, 20, 300);
	}
