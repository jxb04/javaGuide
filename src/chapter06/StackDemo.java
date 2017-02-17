package chapter06;

// A stack class for characters.
class Stack {
	private char stck[];  // this array holds the stack
	private int tos;       // the top of the stack
	
	// Construct an empty stack given its size
	Stack(int size) {
		stck = new char[size];  // allocate memory for the stack
		tos = 0;
	}
	
	// construct a stack from a stack
	Stack(Stack ob) {
		tos = ob.tos;
		stck = new char[ob.stck.length];
		
		// copy elements
		for(int i = 0; i < tos; i++)
			stck[i] = ob.stck[i];
	}
	
	// construct a stack with initial values
	Stack(char a[]) {
		stck = new char[a.length];
		
		for (int i = 0; i < a.length; i++) {
			push(a[i]);
		}
	}
	
	// push characters on the stack
	void push(char ch) {
		if(tos == stck.length) {
			System.out.println(" -- Stack is full");
			return;
		}
		
		stck[tos] = ch;
		tos++;
	}
	
	// Pop a character from the stack
	char pop() {
		if (tos==0) {
			System.out.println(" -- Stack is empty");
			return (char) 0;
		}
		tos--;
		return stck[tos];
		
	}

}

// Demonstrate the stack class
class StackDemo {
	public static void main(String args[]) {
		// construct 10 element empty stack
		Stack stk1 = new Stack(10);
		
		char name[] = {'T', 'o', 'm'};
		
		// construct stack from array
		Stack stk2 = new Stack(name);
		
		char ch;
		int i;
		
		// put some characters in stk1
		for (i = 0; i <= 10; i++) 
			stk1.push((char) ('A' + i));
			
		// construct stack from another stack
		Stack stk3 = new Stack(stk1);
		
		// show the stacks
		System.out.print("Contents of stk1: ");
		for(i = 0; i <= 10; i++) {
			ch = stk1.pop();
			System.out.print(ch);
		}
		System.out.println("\n");
		System.out.print("Contents of stk2: ");
		for(i = 0; i <= 3; i++) {
			ch = stk2.pop();
			System.out.print(ch);
		}
		System.out.println("\n");
		System.out.print("Contents of stk3: ");
		for(i = 0; i <= 10; i++) {
			ch = stk3.pop();
			System.out.print(ch);
		}
		
				
	}
}
    