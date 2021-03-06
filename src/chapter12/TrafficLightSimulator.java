package chapter12;

// A computerized traffic light
public class TrafficLightSimulator implements Runnable {
	private Thread thrd;            // holds the thread that runs the simulation
	private TrafficLightColor tlc;  // holds the current traffic light color
	boolean stop = false;           // set to true to stop the simulation
	boolean changed = false;        // true when the light has changed
	
	TrafficLightSimulator(TrafficLightColor init) {  // initial color can be specified
		tlc = init;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;  // initial color defaults to red
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	// Start up the light
	public void run() {
		while (!stop) {
			try {
				switch(tlc) {
				case GREEN:
					Thread.sleep(10000);  // green for 10 seconds
					break;
				case YELLOW:
					Thread.sleep(2000);   // yellow for 2 seconds
					break;
				case RED:
					Thread.sleep(12000);  // red for 12 seconds
					break;
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	
	// Change color
	synchronized void changeColor() {
		switch (tlc) {
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
			break;
		}
		
		changed = true;
		notify();  // signal that the light has changed
	}
	
	// Wait until a light change occurs
	synchronized void waitForChange() {
		try {
			while(!changed)
				wait();  // wait for the light to change
			changed = false;
		} catch(InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	// Return the current color
	synchronized TrafficLightColor getColor() {
		return tlc;
	}
	
	// Stop the traffic light
	synchronized void cancel() {
		stop = true;
	}

}
