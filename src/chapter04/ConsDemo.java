package chapter04;

// A simple constructor

class MyClass {
	int x;
	
	MyClass() {  // constructor name is the same as the namne of the class
		x = 10;
	}
}

public class ConsDemo {
	public static void main(String args[]) {
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();
		
		System.out.println(t1.x + " " + t2.x);
	}

}
