package chapter08;

public class SeriesDemo {
	public static void main(String args[]) {
		ByThrees ob = new ByThrees();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Next value is " + ob.getNext());
		}
		
		System.out.println("\nStarting at 100");
		ob.setStart(100);
		for (int i = 0; i < 5; i++){
			System.out.println("Next value is " + ob.getNext());
		}
	}

}
