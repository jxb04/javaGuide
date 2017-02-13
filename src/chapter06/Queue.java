package chapter06;

//An improved queue class for characters
class Queue {
	// these members are now private
	private char q[];           //this array holds the queue
	private int putloc, getloc; // the put and get indices
	
	Queue(int size) {       // constructor for the class
		q = new char[size]; // allocate memory for the queue
		putloc = getloc = 0;
	}
	
	// put a character in the queue
	void put (char ch) {
		if (putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;    //store the element and increment the put location
	}
	
	// get a character from the queue
	char get() {
		if  (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
}
