package chapter16;

// Demonstrate a simple JList

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo implements ListSelectionListener {
	
	JList<String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;
	
	// Create an array of names
	String names[] = {"Sherry", "Jon", "Rachel", "Sasha", "Josselyn", "Randy", "Tom",
			          "Mary", "Ken", "Andrew", "Matt", "Todd"};                       // This array will be displayed as a JList
	
	ListDemo() {
		// Create a new JFrame container
		JFrame jfrm = new JFrame("JList Demo");
		
		// Specify a flow layout.
		jfrm.setLayout(new FlowLayout());
		
		// Give the frame an initial size
		jfrm.setSize(200, 160);
		
		// Terminate the program when the user closes the application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a new JList
		jlst = new JList<String>(names);                     // Create the list
		
		// Set the list selection mode to single-selection
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// Add list to a scroll pane
		jscrlp = new JScrollPane(jlst);
		
		// Set the preferred size of the scroll pane
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
		// Make a label that displays the selection
		jlab = new JLabel("Please choose a name");
		
		// Add list seleciton handler
		jlst.addListSelectionListener(this);          // listen for list selection events
		
		// Add the list and label to the content pane
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		
		// display the frame
		jfrm.setVisible(true);
	}
	
	// Handle the selection events
	public void valueChanged(ListSelectionEvent le) {
		// Get the index of the changed item
		int idx = jlst.getSelectedIndex();
		
		// Display selection, if item was selected
		if(idx != -1)
			jlab.setText("Current selection: " + names[idx]);
		else 
			jlab.setText("Please choose a name");
	}
	
	public static void main(String args[]) {
		// Create the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ListDemo();
			}
		});
	}

}
