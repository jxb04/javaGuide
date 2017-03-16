package chapter11;

public class JoinThreads {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		
		MyThread2 mt1 = new MyThread2("Child 1");  // Thread starts when it is created.
		MyThread2 mt2 = new MyThread2("Child 2");  // Thread starts when it is created.
		MyThread2 mt3 = new MyThread2("Child 3");  // Thread starts when it is created.

		try {
			mt1.thrd.join();                       // wait until the specified thread ends
			System.out.println("Child #1 joined");
			mt2.thrd.join();
			System.out.println("Child #2 joined");
			mt3.thrd.join();
			System.out.println("Child #3 joined");
		}  catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("Main thread ending.");
	}


}
