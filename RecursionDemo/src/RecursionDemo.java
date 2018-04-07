import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class RecursionDemo extends JPanel{


	public static void main(String[] args) {
		long x = 0;
		while(true){
		String comm = JOptionPane.showInputDialog("Enter: ", x);
		if(comm == null)
			return;
		x = Long.parseLong(comm);
		x = factorial(x);
		}

	}
	private static long factorial(long n)
	{
		if (n==1)
			return 1;
		else
			return n*factorial(n-1);
	}

}
