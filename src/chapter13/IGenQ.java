package chapter13;

// a generic queue interface
public interface IGenQ<T> {
	// Put an item into the queue
	void put(T ch) throws QueueFullException;
	
	// get an item from the queue
	T get() throws QueueEmptyException;

}
