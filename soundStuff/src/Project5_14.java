import javax.swing.JOptionPane;
import sounds.APSoundClip;
import sounds.Sample;

public class Project5_14 
{
	public static void main(String[] args)
	{
		String file1 ="res/" + JOptionPane.showInputDialog("Enter File name: ") + ".wav";
		int delay =(Integer.parseInt(JOptionPane.showInputDialog("Enter the delay in seconds: "))) * 44100;
		
		APSoundClip clip1 = new APSoundClip(file1);
		APSoundClip clip2 = new APSoundClip(clip1.getLength() + delay);
		
		for(int x  = 0; x < clip2.getLength(); x++)
		{
			if(x <= delay)
			{
				Sample s = new Sample();
				clip2.setSample(x,s);
			}
			else
			{
				Sample s = clip1.getSample(x- delay);
				clip2.setSample(x,s);
			}
		}
		
		int length = clip2.getLength();
		int val = 0;
		APSoundClip newClip = new APSoundClip(length);
		
		for(int x = 0; x < length; x++)
		{
			Sample newSample = new Sample();
			if(clip1.getLength() <= x & clip1.getLength() < length)
			{
				Sample s =  new Sample();
				Sample s1 = clip2.getSample(x);
				val = s1.getValue() + s.getValue();
			}
			else if(clip2.getLength() <= x & clip2.getLength() < length)
			{
				Sample s = clip1.getSample(x);
				Sample s1 = newSample;
				val = s.getValue() + s1.getValue();
			}
			else
			{
			Sample s = clip1.getSample(x);
			Sample s1 =  clip2.getSample(x);
			val = s.getValue() + s1.getValue();
			}
			newSample.setValue(val);
			newClip.setSample(x, newSample);
		}
		newClip.draw();
	}
}