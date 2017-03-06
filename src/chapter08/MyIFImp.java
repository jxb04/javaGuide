package chapter08;

public class MyIFImp implements MyIF {

	// Only getUserID() defined my MyIF needs to (has to) be implemented
	// getAdminID() can be allowed to default.
	public int getUserID() {
		return 100;
	}

}
