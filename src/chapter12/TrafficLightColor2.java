package chapter12;

// Enumeration of traffic light colors with delay
public enum TrafficLightColor2 {
	RED(12000), GREEN(10000), YELLOW(2000);
	
	private int delay;
	
	TrafficLightColor2(int d) {
		delay = d;
	}
	
	int getDelay() { return delay; }
}
