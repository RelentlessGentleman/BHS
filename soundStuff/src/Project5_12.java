import javax.swing.JOptionPane;
import sounds.APSoundClip;
import sounds.Sample;

public class Project5_12 
{
	public static void main(String[] args)
	{
		String file1 ="res/" + JOptionPane.showInputDialog("Enter File 1 name: ") + ".wav";
		String file2 ="res/" + JOptionPane.showInputDialog("Enter File 2 name: ") + ".wav";
		
		APSoundClip clip1 = new APSoundClip(file1);
		APSoundClip clip2 = new APSoundClip(file2);
		int length = clip1.getLength() + clip2.getLength() + 4410;

		APSoundClip newClip = new APSoundClip(length);
		
		for(int x = 0; x < clip1.getLength(); x++)
		{
			Sample s = clip1.getSample(x);
			newClip.setSample(x,s);
		}
		for(int x = 0; x < clip2.getLength(); x++)
		{
			Sample s = clip2.getSample(x);
			
			newClip.setSample(x + 4410 + clip1.getLength(),s);
		}
		newClip.draw();
	}
}