package chapter09;

// This won't work!
public class ExcTypeMismatch {
	public static void main(String args[]) {
		int nums[] = new int[4];
		
		try {
			System.out.println("Before exception is generated.");
			
			// generate index out-of-bounds exception
			nums[7] = 10;
			System.out.println("This won't be displayed.");
		}
		
		// Can't catch an array boundary error with an Arithmetic exception
		catch (ArithmeticException exc) {
			// catch the exception
			System.out.println("Index out-of-bounds!");
			
		}
		System.out.println("After catch statement.");
	}

}
