package chapter11;

// Improved MyThread

class MyThread2 implements Runnable {
	Thread thrd;
	
	// Construct a new thread.
	MyThread2(String name) {
		thrd = new Thread(this, name);  // The thread is named when it is created.
		thrd.start();                   // start the thread
	}
	
	// begin execution of the new thread.
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", count is " + count);
			}
		}  catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}

public class UseThreadsImproved {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		
		MyThread2 mt = new MyThread2("Child 1");  // Thread starts when it is created.
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}  catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}

}
