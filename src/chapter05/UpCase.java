package chapter05;

// Uppercase letters
public class UpCase {
	public static void main(String args[]) {
		char ch;
		
		for (int i = 0; i < 10; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);
			
			// This statement truns off the 6th bit.
			ch = (char) ((int) ch & 65503); // ch is now uppercase - AND each character with 65503 1111 1111 1101 1111
			
			System.out.print(ch + " ");
		}
	}

}
