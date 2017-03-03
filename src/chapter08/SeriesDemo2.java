package chapter08;

public class SeriesDemo2 {
	public static void main(String args[]) {
		ByTwos twoOb = new ByTwos();                                    // object of type ByTwos, which implements Series
		ByThrees threeOb = new ByThrees();                              // object of type ByThrees, which implements Series
		Series ob;                                                      // reference to a Series interface
		
		for (int i = 0; i < 5; i++) {
			ob = twoOb;                                                 // access an object via an interface reference
			System.out.println("Next ByTwos value is   " + ob.getNext());
			
			ob = threeOb;                                               // access an object via an interface reference
			System.out.println("Next ByThrees value is " + ob.getNext());
		}
	}

}
