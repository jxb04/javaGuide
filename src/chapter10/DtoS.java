package chapter10;

// A simple disk-to-screen utility that demonstrates a FileReader.

import java.io.*;
public class DtoS {
	public static void main(String args[]) {
		String s;
		
		// Create and use a FileReader wrapped in a BufferedReader.
		try (BufferedReader br = new BufferedReader(new FileReader("TEST.TXT")))  // Create a File Reader.
		{
			while((s = br.readLine()) != null) {   // read lines from the file and display them on the screen
				System.out.println(s);
			}
		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
				
	}

}
