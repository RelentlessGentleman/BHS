import sounds.APSoundClip;
import sounds.Sample;
import java.util.Scanner;
public class TestClip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a volume factor: ");
		double factor = reader.nextDouble();
		APSoundClip clip = new APSoundClip("res/my_cooked_goose.wav");
		clip.draw();
		//clip.play();
		for (Sample s : clip){
			int newValue = (int)(s.getValue() * factor);
			s.setValue(newValue);
		}
	}
}
