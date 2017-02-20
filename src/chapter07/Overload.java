package chapter07;

// Methods with different signatures are overloaded and not overwritten

class A3 {
	int i, j;
	
	A3(int a, int b) {
		i = a;
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// Create a subclass by extending class A3
class B3 extends A3 {
	int k;
	
	B3(int a, int b, int c) {
		super (a, b);
		k = c;
	}
	
	// overload show()
	void show(String msg) {  // because signatures differ, this show() simply overrides show() in superclass A3
		System.out.println(msg + k);
	}
}

public class Overload {
	public static void main(String args[]) {
		B3 subObj = new B3(1, 2, 3);
		subObj.show("This is k: ");   // This calls show() in B3
		subObj.show();                // This calls show() in A3
	}

}
