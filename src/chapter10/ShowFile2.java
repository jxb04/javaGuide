package chapter10;

/* This variation wraps the code that opens and 
 * accesses the file within a single try block.
 * The file is closed by the finally block.
 */

import java.io.*;

public class ShowFile2 {
	public static void main(String args[]) {
		int i;
		FileInputStream fin = null;        // fin is initialized to null
		
		// First, confirm a file name has been specified.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile filename.");
			return;
		}
		
		// The following code opens a file, reads characters until EOF
		// is encountered, and then closes the file via a finally block.
		try {
			fin = new FileInputStream(args[0]);
			
			do {
				i = fin.read();
				if (i != -1) System.out.print((char) i);
			} while (i != -1);
		}
/*		catch (FileNotFoundException exc) {
			System.out.println("File not found.");
		}
*/		catch (IOException exc) {
			System.out.println("I/O error: " + exc);
		}
		finally {
			// close the file in all cases
			try {
				if (fin != null) fin.close();   // Close fin only if not null ie, only if it has been opened
			}
			catch (IOException exc) {
				System.out.println("Error closing file");
			}
		}
	}

}
