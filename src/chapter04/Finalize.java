package chapter04;

class FDemo {
	int x;
	
	FDemo (int i) {
		x = i;
	}
	
	// called when object is recycled
	protected void finalize() {
		System.out.println("Finalizing " + x);
	}
	
	//generates an object that is immediately destroyed
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}

public class Finalize {
	public static void main(String args[]) {
		int count;
		
		FDemo ob = new FDemo(0);
		
		/* now generate a large number of ojbects.  At
		 * some point, garbage collection will occur.
		 * Note:  you might need to increase the number
		 * of objects generated in order to force
		 * garbage collection.
		 */
		
		for (count = 1; count < 100000; count++)
			ob.generator(count);
	}
}
