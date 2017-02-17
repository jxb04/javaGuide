package chapter07;

//Add constructors to TwoDShape4

class TwoDShape5 {
	private double width;
	private double height;
	
	// default constructor
	TwoDShape5() {
		width = height = 0.0;
	}
	
	// Paramaterized constructor
	TwoDShape5(double w, double h) {   // A constructor for TwoDShape
		width = w;
		height = h;
	}
	
	// construct object with equal width and height
	TwoDShape5(double x){
		width = height = x;
	}
	
	// Accessor methods for width and height
	double getWidth() {  // returns width
		return width;
	}
	double getHeight() {  // retruns height
		return height;
	}
	
	void setWidth(double w) {
		width = w;
	}
	
	void setHeight(double h) {
		height = h;
	}
	
	void showDim() {
		System.out.println("Width and height are " + width + " " + height);
	}
}

//A subclass of TwoDShape for triangles
class Triangle5 extends TwoDShape5 {
	private String style;
	
	// A default constructor
	Triangle5() {
		super();
		style = "none";
	}
	
	// constructor
	Triangle5(String s, double w, double h) {
		super(w, h);  // call superclass constructor
		
		style = s;
	}
	
	// one argument constructor
	Triangle5 (double x) {
		super (x);  // call superclass constructor
		style = "filled";
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
public class Shapes5 {
	public static void main(String args[]) {
		Triangle5 t1 = new Triangle5();
		Triangle5 t2 = new Triangle5("outlined", 8.0, 12.0);
		Triangle5 t3 = new Triangle5(4.0);
		
		t1 = t2;
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
		System.out.println();
		
		System.out.println("Info for t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area is " + t3.area());
		
		System.out.println();

	}

}
