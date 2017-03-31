package chapter12;

// A computerized traffic light
class TrafficLightSimulator2 implements Runnable {
	private Thread thrd;            // holds the thread that runs the simulation
	private TrafficLightColor2 tlc; // holds the current traffic light color
	boolean stop = false;           // set to true to stop the simulation
	boolean changed = false;        // true when the light has changed
	
	TrafficLightSimulator2(TrafficLightColor2 init) {
		tlc = init;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator2() {
		tlc = TrafficLightColor2.RED;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	// start up the light
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(tlc.getDelay());
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			
			changeColor();
		}
	}
	
	// Change color.
	synchronized void changeColor() {
		switch(tlc) {
		case RED:
			tlc = TrafficLightColor2.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor2.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor2.YELLOW;
		}
		
		changed = true;
		notify();  // signal that the light has been changed
	}
	
	// Wait until a light change occurs.
	synchronized void waitForChange() {
		try {
			while (!changed)
				wait();  // wait for light to change
			changed = false;
		}  catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	// Return current color.
	synchronized TrafficLightColor2 getColor() {
		return tlc;
	}
	
	// Stop the traffic light.
	synchronized void cancel() {
		stop = true;
	}
}
public class TrafficLightDemo2 {
    public static void main(String args[]) {
    	TrafficLightSimulator2 t1 = new TrafficLightSimulator2(TrafficLightColor2.GREEN);
    	
    	for (int i = 0; i < 9; i++) {
    		System.out.println(t1.getColor());
    		t1.waitForChange();
    	}
    	
    	t1.cancel();
    }
}
