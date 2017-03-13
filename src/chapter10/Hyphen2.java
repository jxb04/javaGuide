package chapter10;

/* Copy a text file, substituting hypens for spaces.
 * 
 * This version uses character streams.
 * 
 * To use this program, specify the name of the source file and the destination file.
 * For example,
 * 
 * java Hyphen2 source target
 */

import java.io.*;

public class Hyphen2 {
	public static void main(String args[]) throws IOException {
		int i;
		
		// First make sure both files have been specified.
		if (args.length != 2) {
			System.out.println("Usage: Hypen2 From To");
			return;
		}
		
		// Copy and substitute hyphens.
		// Use the try-with-resources statement.
		try (FileReader fin = new FileReader(args[0]); FileWriter fout = new FileWriter(args[1])) {
			do {
				i = fin.read();
				
				// convert space to a hyphen
				if ((char)i == ' ') 
					i = '-';
				
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}

}
