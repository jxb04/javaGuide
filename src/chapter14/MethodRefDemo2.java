package chapter14;



public class MethodRefDemo2 {
	public static void main (String args[]) {
		boolean result;
		
		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);
		
		// Here, a method reference to isFactor on myNum is created.
		IntPredicate ip = myNum::isFactor;                // A method reference to an instance method
		
		// Now, it is used to call isFactor() via test()
		result = ip.test(3);
		if(result) System.out.println("3 is a factor of " + myNum.getNum());
		
		// This time, a method reference to isFactor on myNum2 is created
		// and used to call isFactor() via test()
		ip = myNum2::isFactor;
		result = ip.test(3);
		if(!result) System.out.println("3 is not a factor of " + myNum2.getNum());

		// This time, a method reference to hasCommonFactor on myNum2 is created
		// and used to call hasCommonFactor() via test()
		ip = myNum2::hasCommonFactor;
		result = ip.test(9);
		if(result) System.out.println("Common factor found.");
	}

}
