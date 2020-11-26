

// Chance to run Waiting thread
public class YieldMethod extends Thread {

	public static void main(String[] args) {

		YieldThread yieldThread = new YieldThread();
		yieldThread.setName("Java Programming");
		yieldThread.start();

		YieldThread yieldThread2 = new YieldThread();
		yieldThread2.setName(" Language");
		yieldThread2.start();

		try {

			yieldThread2.sleep(10000000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

}

class YieldThread extends Thread {

	public void run() {

		try {

			Thread.yield();

			System.out.println("D = " + currentThread().getName());

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

}
