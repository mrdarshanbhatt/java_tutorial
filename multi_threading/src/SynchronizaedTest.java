

// Using Synchronization Achieve Mutual Exclusive Condition
public class SynchronizaedTest {

	public static void main(String[] args) {

		SyncTest syncTest = new SyncTest();

		FinalSync finalSync = new FinalSync(syncTest, "  i  ");

		FinalSync finalSync2 = new FinalSync(syncTest, "  like  ");

		FinalSync finalSync3 = new FinalSync(syncTest, "  java  ");

	}

}

class SyncTest {

	synchronized void call(String a) {

		System.out.print(a);

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}

}

class FinalSync extends Thread {
	SyncTest syncTest;

	String string;

	Thread thread;

	public FinalSync(SyncTest syncTest, String string) {

		this.syncTest = syncTest;

		this.string = string;

		thread = new Thread(this);

		thread.start();

	}

	public void run() {

		syncTest.call(string);

	}

}