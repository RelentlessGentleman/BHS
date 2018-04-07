import javax.swing.*;

import java.awt.*;

public class Project413 
{

	
	public static void main(String[] args)
	{

		JFrame theGUI = new JFrame();
		theGUI.setTitle("Illusion");// Sets name to First GUI program
		theGUI.setSize(400,400);// Sets the window to open to that size
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Makes the program close
		Container pane= theGUI.getContentPane();
		pane.setLayout(new GridLayout(3,6));
	
	
		for(int i=0;i<18;i++)
		{
			
			JPanel paneli =new JPanel();
			if (i==7||i==10)
			{
				paneli.setBackground(Color.lightGray);
			}
			else if (i<=2||(i>=6 && i<=8)||(i>=12 && i<=14))
			{
				paneli.setBackground(Color.black);
				
			}	
			else
			{
				
				paneli.setBackground(Color.white);
			}
			
			pane.add(paneli);
		}
		theGUI.setVisible(true);
		

	}

}

