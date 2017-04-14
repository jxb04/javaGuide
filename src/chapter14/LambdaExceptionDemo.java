package chapter14;

public class LambdaExceptionDemo {
	public static void main(String args[]) {
		double[] values = { 1.0, 2.0, 3.0, 4.0 };
		
		// this block lambda could throw an IOException.
		// thus, IOException must be specified in a throws
		// clause of ioAction() in MyIOAction
		MyIOAction myIO = (rdr) -> {
			int ch = rdr.read();  // could throw IOException
			return true;
		};
		System.out.println("done.");
	}

}
