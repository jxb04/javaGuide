package chapter13;

// A generic stack
public interface IGenStack<T> {
	void push(T obj) throws StackFullException;
	T pop() throws StackEmptyException;

}
