package chapter11;

// Use wait() and notify() to create a ticking clock.

class TickTock {
	String state;   // conains the state of the clock
	
	synchronized void tick(boolean running) {
		if (!running) {  // stop the clock
			state = "ticked";
			notify();  // notify waiting threads
			return;
		}
		
		System.out.print("Tick ");
		
		// wait 1/2 second
		try {
			Thread.sleep(500);
		} catch (InterruptedException exc) {
			System.out.println("Thread interupted.");
		}
		
		state = "ticked";  // set the current state to ticked
		
		notify();          // let tock() run
		try {
			while (!state.equals("tocked"))
				wait();    // wait for tock() to complete
		} catch(InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
	}
	
	synchronized void tock (boolean running) {
		if (!running) {  // stop the clock
			state = "tocked";
			notify();  // notify waiting threads
			return;
		}
		
		System.out.println("Tock");
		
		// wait 1/2 second
		try {
			Thread.sleep(500);
		} catch (InterruptedException exc) {
			System.out.println("Thread interupted.");
		}

		state = "tocked";  // set the current state to tocked
		
		notify();          // let tick() run
		try {
			while (!state.equals("ticked"))
				wait();    // wait for tick() to complete
		} catch(InterruptedException exc) {
			System.out.println("Thread interrupted");
		}		
	}
}

class MyThread5 implements Runnable {
	Thread thrd;
	TickTock ttOb;
	
	// construct a new thread
	MyThread5(String name, TickTock tt) {
		thrd = new Thread(this, name);
		ttOb = tt;
		thrd.start();  // start the thread
	}
	
	// begin execution of new thread
	public void run() {
		
		if (thrd.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++) ttOb.tick(true);
			ttOb.tick(false);
		}
		else {
			for (int i = 0; i < 5; i++) ttOb.tock(true);
			ttOb.tock(false);
		}
	}
}

public class ThreadCom {
	public static void main(String args[]) {
		TickTock tt = new TickTock();
		MyThread5 mt1 = new MyThread5("Tick", tt);
		MyThread5 mt2 = new MyThread5("Tock", tt);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main Thread Interrupted.");
		}
	}

}
