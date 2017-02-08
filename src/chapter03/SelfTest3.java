package chapter3;

public class SelfTest3 {

	public static void main(String args[]) throws java.io.IOException {
		
		char ignore;
		int spaceCount = 0;
		
		System.out.println("Enter a period to stop.");
		do {
			ignore = (char) System.in.read();
			if (ignore == ' ') {
				spaceCount = spaceCount + 1;
			}
		}  while (ignore != '.');
		
		System.out.println("The number of spaces that were input is: " + spaceCount);
		
			
	}
	
}
