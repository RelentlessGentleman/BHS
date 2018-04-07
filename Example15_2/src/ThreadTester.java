import java.util.Scanner;

public class ThreadTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number of threads: ");
		int numThreads = reader.nextInt();
		System.out.print("Enter the maximum sleep time: ");
		int sleepMax = reader.nextInt();
		
		SleepyThread[] threads = new SleepyThread[numThreads];
		for (int count = 1; count <= numThreads; count++)
			threads[count - 1] = new SleepyThread(count, sleepMax);
		
		for (SleepyThread thread: threads)
			thread.start();
		// TODO Auto-generated method stub

	}

}
