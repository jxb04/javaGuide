package chapter04;

public class Vehicle {
	int passengers; // number of passengers
	int fuelcap;    // fuel capacity in gallons
	int mpg;        // fuel consumption in miles per gallon
	
	//Display the range
	int range() {
		return mpg * fuelcap;
	}
}
