package chapter12;

// Use an enum constructor, instance variable, and method


public class EnumDemo3 {
	public static void main(String args[]) {
		Transport3 tp;
		
		// Display the speed of an airplane
		System.out.println("Typical speed for an airplane is " + Transport3.AIRPLANE.getSpeed() + " miles per hour.\n");
		
		// Display all Transports and speeds
		System.out.println("All Transport speeds: ");
		for (Transport3 t : Transport3.values())
			System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
	}

}
