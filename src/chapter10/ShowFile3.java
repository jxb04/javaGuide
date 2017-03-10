package chapter10;

/* this version of the ShowFile program uses a try-with-resources
 * statement to automatically close a file when it is no longer needed.
 */

import java.io.*;
public class ShowFile3 {
	public static void main(String args[]) {
		int i;
		
		// First make sure the filename has been specified.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile3 filename");
			return;
		}
		
		// The following code uses try-with-resources to open a file
		// and then automatically close it when the try block is left.
		try (FileInputStream fin = new FileInputStream(args[0])) {
			
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} 
			while (i != -1);
		}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}

}
