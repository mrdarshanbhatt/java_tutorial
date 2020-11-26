

public class LifeCycle extends Thread {

	@SuppressWarnings({ "static-access", "deprecation" })
	public static void main(String[] args) {

		ThreadCycle cycle = new ThreadCycle();

		// Set Thread name
		cycle.setName("1st Thread");

		// Set priority
		cycle.setPriority(cycle.MIN_PRIORITY);

		// Get Thread ID
		System.out.println(cycle.getId());

		// Thread Start
		cycle.start();

		// suspended thread
		cycle.suspend();

		// Thread Again Resume
		cycle.resume();

		// Destroy Thread
		cycle.destroy();

	}

}

class ThreadCycle extends Thread {

	public void run() {

		try {

			System.out.println("Thread start");

			Thread.sleep(10000);

			System.out.println("Thread end");

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

}
