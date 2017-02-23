// A short package demonstration
package chapter08;
import chapter08.bookpack.*;

public class UseBook {
	public static void main(String args[]) {
		chapter08.bookpack.AnotherBook books[] = new chapter08.bookpack.AnotherBook[5];
		
		books[0] = new AnotherBook("Java: A Beginner's Guide", "Schildt", 2014);
		books[1] = new AnotherBook("Java: The Complete Reference", "Schildt", 2014);
		books[2] = new AnotherBook("The Art of Java", "Schildt and Holmes", 2003);
		books[3] = new AnotherBook("Red Storm Rising", "Clancy", 1986);
		books[4] = new AnotherBook("On the Road", "Kerouac", 1955);
		
		for (int i = 0; i < books.length; i++)
			books[i].show();
	}

}
