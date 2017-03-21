package chapter11;

// Suspending, resuming and stopping a thread

class MyThread6 implements Runnable {
	Thread thrd;
	
	boolean suspended;
	boolean stopped;
	
	MyThread6(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	
	// This is the entry point for the thread
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for (int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if ((i%10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				
				// Use synchronized block to check suspended and stopped.
				synchronized(this) {
					while (suspended) {
						wait();
					}
					if (stopped) break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " exiting.");
	}
	
	// Stop the thread
	synchronized void mystop() {
		stopped = true;
		
		// The following ensures that a suspended thread can be stopped.
		suspended = false;
		notify();
	}
	
	// Synchronize the thread
	synchronized void mysuspend() {
		suspended = true;
	}
	
	// Resume the thread
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}

public class Suspend {
	public static void main (String args[]) {
		MyThread6 ob1 = new MyThread6("MyThread");
		
		try {
			Thread.sleep(1000); // let ob1 thread start executing
			
			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Stopping thread");
			ob1.mystop();
			
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		
		// wait for thread to fininsh
		try {
			ob1.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("Main thread exiting.");
	}

}
