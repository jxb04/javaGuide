package chapter07;

// Demonstrate dynamic method dispatch.

class Sup {
	void who() {
		System.out.println("who() in Sup");
	}
}

class Sub1 extends Sup {
	void who() {
		System.out.println("who() in Sub1");
	}
}

class Sub2 extends Sub1 {
	void who() {
		System.out.println("who() in Sub2");
	}
}

public class DynDispDemo {
	public static void main(String args[]) {
		Sup superObj = new Sup();
		Sub1 subObj1 = new Sub1();
		Sub2 subObj2 = new Sub2();
		
		Sup supRef;
		
		supRef = superObj;
		supRef.who();
		
		supRef = subObj1;
		supRef.who();
		
		supRef = subObj2;
		supRef.who();
	}

}
