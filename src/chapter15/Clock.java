package chapter15;

// A simple clock applet

import java.applet.*;
import java.awt.*;
import java.util.*;
/*
<object code="Clock" width=200 height=50>
</object>
 */

public class Clock extends Applet implements Runnable {
	String msg;
	Thread t;
	Calendar clock;
	
	boolean stopFlag;
	
	// Initialize
	public void init() {
		t = null;
		msg = "";
	}
	
	// Start thread
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	// Entry point for the clock
	public void run() {
		// Redisplay clock
		for ( ; ; ) {
			try {
				repaint();
				Thread.sleep(1000);
				if (stopFlag)
					break;
			} catch (InterruptedException exc) {}
		}
	}
	
	// Pause the clock.
	public void paint(Graphics g) {
		clock = Calendar.getInstance();
		
		msg = "Current time is " + Integer.toString(clock.get(Calendar.HOUR));
		msg = msg + ":" + Integer.toString(clock.get(Calendar.MINUTE));
		msg = msg + ":" + Integer.toString(clock.get(Calendar.SECOND));
		g.drawString(msg, 30, 30);
	}

}
