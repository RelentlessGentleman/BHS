import java.awt.*;
import javax.swing.*;

public class Line_Basic extends JPanel{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Here's some lines");
		theGUI.setSize(100, 100);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		theGUI.getContentPane().add(new Line_Basic());
		theGUI.setVisible(true);

	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawLine(20, 15, 90, 15);
		g.drawString("<", 15, 20);
		g.drawString(">", 90, 20);
		g.drawLine(20, 30, 90, 30);
		g.drawString(">", 15, 35);
		g.drawString("<", 90, 35);
	}

}
