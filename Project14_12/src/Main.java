import java.awt.*;
import javax.swing.*;

public class Main
{
	public static void main(String[] args) 
	{
		boolean t = true;
		boolean f = false;

		int squared = 12;
		int rows = squared;
		int vertical_rows = squared;

				String inputStr = JOptionPane.showInputDialog("Enter the height", "");
				JOptionPane.showInputDialog("Enter the width", "");
				if(inputStr == null)
					return;
				int a  = Integer.parseInt(inputStr);

		JFrame gui = new JFrame();
		gui.setTitle("Black and Red checkerboard");
		gui.setResizable(t);
		gui.setSize(a, a);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panels panel = new Panels(Color.red);
		Container pane = gui.getContentPane();
		pane.add(panel);
		gui.setVisible(t);
	}
	
}
