package chapter07;

// Demonstrate when constructors are executed

// Create a super class
class A1 {
	A1() {
		System.out.println("Constructing A1.");
	}
}

// Create a subclass by extending class A.
class B1 extends A1 {
	B1() {
		System.out.println("Constructing B1. ");
	}
}

// Create another subclass by extending B.
class C extends B1 {
	C() {
		System.out.println("Constructing C.");
	}
}

public class OrderOfConstruction {
	public static void main(String args[]) {
		C c = new C();
	}

}
