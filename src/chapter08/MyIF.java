package chapter08;

public interface MyIF {
	// This is a "normal" interface declaration.
	// It does not define a default implementation.
	int getUserID();
	
	// This is a default method.  Notice that it provides
	// a default implementation.
	default int getAdminID() {
		return 1;
	}

}
