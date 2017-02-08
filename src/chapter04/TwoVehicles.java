package chapter04;

//This class declares an object of type Vehicle.
public class TwoVehicles {
	
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		// another way to do same thing with two statements
		Vehicle sportscar;             //declare reference to object 
		sportscar = new Vehicle();     //allocate a Vehicle object
		
		int range1, range2;
		
		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		//compute the ranges assuming a full tank of gas
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);
		
	}

}
