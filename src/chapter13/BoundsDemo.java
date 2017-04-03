package chapter13;

// In this version of NumbericFns, the type argument for T
// must be either Number, or a class derived from Number.

class NumericFns<T extends Number> {
	T num;
	
	// Pass the constructor a reference to a numeric object
	NumericFns(T n) {
		num = n;
	}
	
	// Return the recipricol.
	double recipricol() {
		return 1 / num.doubleValue();
	}
	
	// Return the fractional component
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}

// Demonstrate NumericFns
public class BoundsDemo {
	public static void main(String args[]) {
		
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);  // Integer is ok since it is a subclass of Number.
		
		System.out.println("Recipricol of iOb is " + iOb.recipricol());
		System.out.println("Fractional component of iOb is " + iOb.fraction());
		
		NumericFns<Double> dOb = new NumericFns<Double>(5.25);
		
		System.out.println("Recipricol of dOb is " + dOb.recipricol());
		System.out.println("Fractional component of dOb is " + dOb.fraction());
		
		// This won't compile because Sting is not a subclass of Number.
		// NumericFns<String> sOb = new NumericFns<String>("Error");
	}

}
