// A short package demonstration
package chapter08.bookpack;

public class AnotherBook {             // AnotherBook and its members must be public in order to be used by other packages
	private String title;
	private String author;
	private int pubDate;
	
	//Now public
	public AnotherBook (String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	
	// Now public
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}