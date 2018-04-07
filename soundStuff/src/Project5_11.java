import sounds.APSoundClip;

public class Project5_11 
{
	public static void main(String[] args) 
	{
		APSoundClip clip = new APSoundClip(0);

		clip.draw();
		while(clip.getLength() < 1000)
		{
		}
		clip.saveAs();
	}
}