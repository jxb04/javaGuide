package chapter12;

public enum Transport3 {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	private int speed;  // typical speed of each transport - an instance variable
	
	// Constructor
	Transport3(int s) {  // add a method
		speed = s;
	}
	
	int getSpeed() {     // add a constructor
		return speed;
	}

}
