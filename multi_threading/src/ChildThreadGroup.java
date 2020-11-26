

public class ChildThreadGroup {

	public static void main(String[] args) throws Exception {

		ThreadGroup group = new ThreadGroup("Parent Group");
		ThreadGroup childGroup = new ThreadGroup(group, "Childs");

		ThreadDemo demo = new ThreadDemo("First", group);
		System.out.println("Start First Thread");

		// Get Thread Group from Thread
		System.out.println("Thread Group : " + demo.getThreadGroup());

		ThreadDemo demo2 = new ThreadDemo("Second", childGroup);
		System.out.println("Start Second Thread");

		// Get Thread Group from Thread
		System.out.println("Thread Group : " + demo2.getThreadGroup());

		// Active Group Count
		System.out.println("Active Group Count : " + group.activeGroupCount());
	}

}

class ThreadDemo extends Thread {

	ThreadDemo(String tName, ThreadGroup group) {

		super(group, tName);

		start();

	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			try {

				System.out.println(i);

				Thread.sleep(10);

			} catch (InterruptedException ex) {

				System.out.println("Exception occurs...");

			}

		}

	}

}
