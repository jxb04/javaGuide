package chapter13;

// Demonstrate a raw type
class Gen2<T> {
	T ob;   // declare an object of type T
	
	// Pass the constructor a reference to an object of type T
	Gen2(T o) {
		ob = o;
	}
	
	// Retyrn ob;
	T getob() {
		return ob;
	}
}

// Demonstrate raw type
public class RawDemo {
	public static void main(String args[]) {
		
		// Create a Gen object for Integers.
		Gen2<Integer> iOb = new Gen2<Integer>(88);
		// Create a Gen object for Strings.
		Gen2<String> strOb = new Gen2<String>("Generics Test");
		
		// Create a raw-type Gen object and give it a Double value
		Gen2 raw = new Gen2(new Double(98.6));             // When no type argument is supplied, a raw type is created
		
		// Cast here is necessary because type is unknown.
		double d = (Double) raw.getob();
		System.out.println("value: " + d);
		
		// The use of a raw type can lead to run-time exceptions.  Here are some examples

		// The following cast causes a run-time error!
        // int i = (Integer) raw.getob();        // run-time error
       
        // This assignment overrides type safety.
        strOb = raw;   // OK, but potentially wrong.  Unchecked warning from compiler that raw type was used in a way that
                       // might jeopardize type safety.
        // String str = strOb.getob();   // run-time error
        
        // This assignment also overrides type safety.
        raw = iOb; // OK, but potentially wrong.
        // d = (Double) raw.getob();  // run-time error
        int i = (Integer) raw.getob();
        System.out.println("int value: " + i);
		
	}

}
