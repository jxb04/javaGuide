package chapter3;

//Changes lower case letters to upper and upper case to lower

public class CaseChanger {
	
	public static void main(String args[]) throws java.io.IOException {
		
		char letter;
		int count = 0;
		
		System.out.println("Enter a period to stop.");
		do {
			letter = (char) System.in.read();

			//convert lower to upper
			if (letter >= 'a' & letter <= 'z') {
				System.out.println("changed case: " + (char)(letter - 32));
				count = count + 1;
			}

			//convert upper to lower
			if (letter >= 'A' & letter <= 'Z') {
				System.out.println("changed case: " + (char)(letter + 32));
				count = count + 1;
			}
			
		} while (letter != '.');
        
		System.out.println("Number of changes made is " + count);
		
	}

}
