package chapter09;

// Using the Throwable methods.

class ExcTest2 {
	static void genException() {
		int nums[] = new int[4];
		
		System.out.println("Before exception is generated.");
		
		// generate an exception out-of-bounds exception.
		nums[7] = 10;
		System.out.println("this won't be displayed");
	}
}

public class UseThrowableMethods {
	public static void main(String args[]) {
		try {
			ExcTest2.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc){
			// catch the exception
			System.out.println("Standard message is: ");
			System.out.println(exc);
			System.out.println("\nStack Trace: ");
			exc.printStackTrace();
		}
		System.out.println("After catch statement.");
	}

}
