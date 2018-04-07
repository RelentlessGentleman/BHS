import java.util.Random;
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	String[] BoardL1 = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}; //0-9 slots
		String[] BoardL2 = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		String[] BoardL3 = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		String[] BoardL4 = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		String[] BoardL5 = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};*/
		String[][] Board = new String[][]{
				  {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
				  {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
				  {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
				  {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
				  {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" }
				};
		Random Random = new Random(); 
		//Hero Stats
		int HeroHP = 500;
		int HeroMP;
		String Hero = "H"; // going to be represented on the board
		int HeroAttMax = 25;
		int HeroAttMin = 24; // will give a damage range of 24-50
		int HeroLevel = 1;
		int HeroPosition = 0;
		
		//Mob Stats
		int MobHP;
		int MobAttMax;
		int MobAttMin;
		String Mob = "M";
		int counter =0;

		
		while (HeroHP > 0)
		{
			int HeroPlaceX = Random.nextInt(10) + 0;
			int HeroPlaceY = Random.nextInt(6) + 0;
			
			System.out.println(HeroPlaceX);
			HeroHP = HeroHP-50;
		}
		
		


	}

}
