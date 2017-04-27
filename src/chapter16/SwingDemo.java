package chapter16;

// A simple Swing program

import javax.swing.*;

public class SwingDemo {
	
	SwingDemo() {
		
		// create a new JFrame container.
		JFrame jfrm = new JFrame("A Simple Swing Application");
		
		// give the frame an initial size.
		jfrm.setSize(275, 100);                  // set the dimensions of the frame
		
		// Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               // terminate on close
		
		// create a text based label.
		JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");   // create a swing label.
		
		// Add the label to the content pane.
		jfrm.add(jlab);
		
		// Display the frame
		jfrm.setVisible(true);
	}
	
	public static void main (String args[]) {
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();            // swing demo must be created on the event dispatching thread
			}
		});
	}

}
