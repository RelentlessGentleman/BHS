import javax.swing.*;
import java.awt.*;
public class Project4_13 
{
	public static void main(String[] args)
	{
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Mid point tracker");
		theGUI.setSize(400,400);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane= theGUI.getContentPane();
		pane.setLayout(new GridLayout(4,7));
	
	
		for(int i=0;i<18;i++)
		{
			
			JPanel Panel =new JPanel();
			if (i==7||i==10)
			{
				Panel.setBackground(Color.gray);
			}
			else if (i<=2||(i>=6 && i<=8)||(i>=12 && i<=14))
			{
				Panel.setBackground(Color.black);
				
			}	
			else
			{
				
				Panel.setBackground(Color.white);
			}
			
			pane.add(Panel);
		}
		theGUI.setVisible(true);
		

	}

}

