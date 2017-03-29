package chapter12;

public class EnumTest {
	public static void main(String args[]) {
		System.out.println("Contents of the tool box:");
		
		//use values()
		Tools allTools[] = Tools.values();  // Obtain an array of Tools constants
		for (Tools t : allTools)
			System.out.println(t);
	}

}
