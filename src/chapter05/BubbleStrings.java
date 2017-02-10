package chapter05;

// Demonstrate bubble sort on strings

public class BubbleStrings {
	public static void main(String args[]) {
		String nums[] = { "Hello", "Again", "100123", "flow", "Jackson", 
			           "turk", "white", "-9", "287", "Mason" };
		int a, b;
		int size;
		String t;
		int result;
		
		size = 10; // number of elements to sort
		
		// display original array
		System.out.println();		
		System.out.print("Original array is:");
		for (int i=0; i < size; i++) 
			System.out.print(" " + nums[i]);
		System.out.println();
		System.out.println();
		
		// This is bubble sort
		for (a = 1; a < size; a++) 
			for (b = size - 1; b >= a; b--) {
				result = nums[b-1].compareTo(nums[b]);
				if (result > 0) { // if out of order
					// exchange elements
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
			}
		// Display sorted array
		System.out.print("Sorted array is:");
		for (int i = 0; i < size; i++ ) 
			System.out.print(" " + nums[i]);
		System.out.println();
		}

}
