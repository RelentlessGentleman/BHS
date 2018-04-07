import sounds.APSoundClip;

public class record 
{
	public static void main(String[] args)
	{
		APSoundClip clip = new APSoundClip();
		
		clip.draw();

		while(clip.getLength() < 1000)
		{
			if (clip.getLength() > 1000)
			{
				break;
			}
		}
		clip.saveAs();
	}
}