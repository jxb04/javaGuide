package chapter03;

// Read input until q is received

public class Break2 {
	
	public static void main(String args[]) throws java.io.IOException {
		
		char ch;
		
		for ( ; ; ) {
			ch = (char) System.in.read();  // get a char
			if (ch == 'q') break;
		}
		System.out.println("you pressed q!");
	}

}
