package chapter04;

public class IsFact {
	
	public static void main(String agrs[]) {
		
		Factor x = new Factor();
		
		if (x.isFactor(2, 20)) System.out.println("2 is factor");
		if (x.isFactor(3, 20)) System.out.println("this won't be displayed");
	}

}
