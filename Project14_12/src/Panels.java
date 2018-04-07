import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Panels extends JPanel{
	public Panels(Color backColor){
		setBackground(backColor);
	}

	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.setColor(Color.black);

		int width = getWidth();
		int height = getHeight();
		int boxperrow = 8;//half of which will be colored SELECTED COLOR
		g.fillRect(0, 0, width, height);
		g.setColor(Color.red);
		int dim = (height/boxperrow)+1;//box dimensions.
		int dim2 = (width/boxperrow)+1;
		System.out.println(dim);
		int offsetcounter = 0; //when it equals one, it will stop a box from being made.
		for(int x  = 0; x < boxperrow;x++){
			offsetcounter++;
			for(int y  = 0; y < boxperrow;y++){
				if(offsetcounter%2 == 0)
					g.fillRect((x*dim2), (y*dim), dim2, dim);
				offsetcounter++;
			}

		}

	}

	private int getUserNumber() {
		String input_int = JOptionPane.showInputDialog("Enter the number of rows and columbs INTEGER INPUT ONLY", "");
		int a = Integer.parseInt(input_int);
		return a;
	}
}
