package chapter07;

// Method overriding
class A2 {
	int i, j;
	A2(int a, int b) {
		i = a ;
		j = b;
	}
	
	// display i and j
	void show () {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B2 extends A2 {
	int k;
	
	B2(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// display k - this overrides show in A2
	void show() {
		
		super.show();  // this calls A2' show
		System.out.println("k: " + k);
	}
}

public class Override {
	public static void main(String args[]) {
		B2 subOb = new B2(1, 2, 3);
		
		subOb.show();  // this calls show() in B2
	}

}
