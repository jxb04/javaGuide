package chapter02;

// A promotion surprise!

public class PromoDemo {
	
	public static void main(String args[]) {
		
		byte b;
		int i;
		
		b = 10;
		i = b * b;  //OK, no cast needed
		
		b = 10;
		b = (byte) (b * b); // cast is needed
		
		System.out.println("i and b: " + i + " " + b);
	}

}
