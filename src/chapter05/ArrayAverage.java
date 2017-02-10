package chapter05;

//find the average of elements in an array

public class ArrayAverage {
	public static void main(String args[]) {
		double A[] = {1.2, 2.2, 3.2, 4.2, 5.4, 6.3, 7.7, 8.8, 9.9, 10.0};
		double total = 0;
		double average;
		
		for (int i = 0; i < A.length; i++) {
			total = total + A[i];
		}
		
		average = total / A.length;
		
		System.out.println("The average of all elements in the array is: " + average);
		
		
	}

}
