package abstraction;

public class rectangle extends shape {
	// abstract class shape er val1, val2 er access paise 
	rectangle(double val1, double val2){
		super(val1, val2); // super class er constructor ke call
	}
	
	void area() {
		double result=val1*val2;
		System.out.println("Area of rectangle: "+result);
	}
}
