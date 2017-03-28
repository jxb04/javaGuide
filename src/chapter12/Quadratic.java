package chapter12;

// Find the solution to a quadratic equation
import static java.lang.Math.*;

public class Quadratic {
	public static void main(String args[]) {
		
		// a, b and c represent the coefficients in the
		// quadratic equation: ax2 + bx + c = 0
		double a, b, c, x;
		
		// solve 4x2 + x - 3 for x.
		a = 4;
		b = 1;
		c = -3;
		
		// Find the first solution.
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution: " + x);
		
		// Find the second solution
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Second solution: " + x);
	}

}
