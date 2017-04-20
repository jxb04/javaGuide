package chapter14;

//This class stores an int value and defines the instance method isFactor(),
//which returns true if its argument is a factor of the stored value.
class MyIntNum {
	private int v;
	
	MyIntNum(int x) { v = x; }
	int getNum() { return v; }
	
	// Return true if n is a factor of v.
	boolean isFactor (int n) {
		return (v % n) == 0;
	}
	
	boolean hasCommonFactor(int n) {
		for(int i=2; i < v/i; i++)
			if (((v % i) == 0) && ((n % i) == 0)) return true;
		
		return false;
	}
}