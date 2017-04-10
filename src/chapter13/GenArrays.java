package chapter13;

// Generics and arrays.

class Gen3<T extends Number> {
	T ob;
	T vals[];  // OK
	
	Gen3(T o, T[] nums) {
		ob = o;
		
		// This statemant is illegal
		// vals = new T[10];  // can't create an array of T
		
		// But, this statement is OK.
		vals = nums;  // OK to assign reference to existent array
	}
}

public class GenArrays {
	public static void main(String args[]) {
		Integer n[] = { 1, 2, 3, 4, 5 };
		
		Gen3<Integer> iOb = new Gen3<Integer> (50, n);
		
		// Can't create an array of type-specific generic references.
		// Gen3<Integer> gens[] = new Gen3<Integer>[10];   //Wrong!
		
		// This is OK.
		Gen3<?> gens[] = new Gen3<?>[10];  // OK
	}

}
