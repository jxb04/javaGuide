package chapter04;

//A paramaterized constructor

class ParmMyClass {
	int x;
	
	ParmMyClass(int i) {
		x = i;
	}
}

public class ParmConsDemo {
	public static void main(String args[]) {
		ParmMyClass t1 = new ParmMyClass(10);
		ParmMyClass t2 = new ParmMyClass(88);
		
		System.out.println(t1.x + " " + t2.x);
	}

}
