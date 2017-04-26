package chapter15;
// Demonstrate the mouse event handlers
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
 * <applet code="MouseEvents" width=300 height=300>
 * </applet>
 */
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
	
	String msg = "";
	int mouseX = 0, mouseY = 0;    // coordinates of the mouse
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);  // Register this class as a listener for mouse events
	}
	
	// Handle mouse clicked
	public void mouseClicked(MouseEvent me) {    // This and the other event handlers respond to mouse events
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Clicked";
		repaint();
	}
	
	// Handle mouse entered
	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Entered.";
		repaint();
	}

	// Handle mouse exited
	public void mouseExited(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Exited.";
		repaint();
	}

	// Handle button pressed
	public void mousePressed(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();
	}

	// Handle button released
	public void mouseReleased(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up.";
		repaint();
	}

	// Handle mouse dragged
	public void mouseDragged(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}

	// Handle mouse moved
	public void mouseMoved(MouseEvent me) {
		// show status
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
	}
	
	// Display msg in applet window at current X,Y location.
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}

}
