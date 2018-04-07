
public class SleepyThread extends Thread {
	private int sleepInterval;

	
	public SleepyThread(int number, int sleepMax) {
		super("Thread " + number);
		sleepInterval = (int) (Math.random()* sleepMax);
	}
	public void run(){
		System.out.println(getName() + " sleep interval: " + sleepInterval);
		
		try{
			sleep(sleepInterval);
		}catch(InterruptedException e){
			System.out.println(e.toString());
		}
		System.out.println(getName() + " waking up");
		
	}

}
