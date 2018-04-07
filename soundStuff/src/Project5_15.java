import javax.swing.JOptionPane;
import sounds.APSoundClip;
import sounds.Sample;

public class Project5_15 
{
	public static void main(String[] args)
	{
		String file1 ="res/" + JOptionPane.showInputDialog("Enter File name: ") + ".wav";
		
		APSoundClip clip1 = new APSoundClip(file1);
		APSoundClip clip2 = new APSoundClip(clip1.getLength());
		int y = 0;
		
		for(int x  = clip2.getLength() - 1; x > 0; x--)
		{
			Sample s = clip1.getSample(x-1);
			clip2.setSample(y,s);
			y++;
		}		
		clip2.draw();
	}
}