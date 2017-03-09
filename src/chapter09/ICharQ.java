package chapter09;

// A character queue interface
public interface ICharQ {
	// put a character in the queue
	void put(char ch) throws QueueFullException;
	
	// get a character from the queue
	char get() throws QueueEmptyException;

}
