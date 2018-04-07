// Program Name: GuiWindow.java
// Program Description: This'll make abuncha diffrent coloured GUI windows
// Programmer: Anthony Danilchenko
// Date: Sept. 23 2013

import javax.swing.*;
import java.awt.*;
public class GuiWindow {
	public static void main(String[] args)
	{
		JFrame theGUI = new JFrame();
		theGUI.setTitle("First GUI Program");
		theGUI.setSize(900, 500);
		//g.drawLine(20,15,90,15);
		
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.black);	
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.white);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.black);
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.white);
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.black);
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.white);
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.black);
		JPanel panel9 = new JPanel();
		panel9.setBackground(Color.white);
		Container pane = theGUI.getContentPane();
		pane.setLayout(new GridLayout(3, 3));
		pane.add(panel2);
		pane.add(panel1);
		pane.add(panel3);
		pane.add(panel4);
		pane.add(panel5);
		pane.add(panel6);
		pane.add(panel7);
		pane.add(panel8);
		pane.add(panel9);
		theGUI.setVisible(true);
		
	}
	

}
