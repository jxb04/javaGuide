package chapter05;

// Lowercase letters
public class LowCase {
	public static void main(String args[]) {
		char ch;
		
		for (int i = 0; i < 10; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);
			
			// This statement truns on the 6th bit.
			ch = (char) ((int) ch | 32); // ch is now lowercase - OR each character with 32 - 0000 0000 0010 0000
			
			System.out.print(ch + " ");
		}
	}

}
