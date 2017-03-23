package chapter12;

// Use the built in enumeration methods

// An enumeration of Transport varieties
enum Transport2 {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo2 {
	public static void main(String args[]) {
		Transport2 tp;
		
		System.out.println("Here are all the Transport constants");
		
		//use values()
		Transport2 allTransports[] = Transport2.values();  // Obtain an array of Transport constants
		for (Transport2 t : allTransports)
			System.out.println(t);
		
		System.out.println();
		
		// use valueOf()
		tp = Transport2.valueOf("AIRPLANE");  // Obtain the constant with the name AIRPLANE
		System.out.println("tp contains " + tp);
		
	}

}
