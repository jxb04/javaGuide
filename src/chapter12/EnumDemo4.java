package chapter12;

// Demonstrate ordinal() and compareTo

public class EnumDemo4 {
	public static void main(String args[]) {
		Transport3 tp1, tp2, tp3;
		
		// Obtain all ordinal values using ordinal()
		System.out.println("Here are all Transport constants and their ordinal values: ");
		for (Transport3 t : Transport3.values())
			System.out.println(t + " " + t.ordinal());  // obtain ordinal values
		
		tp1 = Transport3.AIRPLANE;
		tp2 = Transport3.TRAIN;
		tp3 = Transport3.AIRPLANE;
		
		System.out.println();
		
		// Demonstrate compareTo()
		if(tp1.compareTo(tp2) < 0)
			System.out.println(tp1 + " comes before " + tp2);
		
		if (tp1.compareTo(tp2) > 0)
			System.out.println(tp1 + " comes after " + tp2);
		
		if (tp1.compareTo(tp3) == 0)
			System.out.println(tp1 + " equals " + tp3);
		
	}

}
