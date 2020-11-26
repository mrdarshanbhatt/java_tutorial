

public class ThreadGroupp {

	public static void main(String[] args) {

		ThreadGroup group = new ThreadGroup("Parent Group");

		ThreadGroupDemo first = new ThreadGroupDemo("First", group);
		System.out.println("First Thread Start");

		ThreadGroupDemo second = new ThreadGroupDemo("Second", group);
		System.out.println("Second Thread Start");

		// Active Thread Count
		System.out.println("Active Thread : " + group.activeCount());

		//
		System.out.println(first.isInterrupted()); // false

		second.interrupt();
		System.out.println(second.isInterrupted()); // True
	}

}

class ThreadGroupDemo extends Thread {

	public ThreadGroupDemo(String tName, ThreadGroup group) {

		super(group, tName);

		start();

	}

	@Override
	public void run() {
		try {

			for (int i = 0; i < 10; i++) {

				Thread.sleep(1000);

			}

		} catch (Exception e) {

			System.out.println("Exception occurs...");

		}

	}

}