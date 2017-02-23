// Make the instance variables in Book protected
package chapter08.bookpack;

public class YetAnotherBook {
	// these are now protected
	protected String title;
	protected String author;
	protected int pubDate;
	
	public YetAnotherBook(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}

}
