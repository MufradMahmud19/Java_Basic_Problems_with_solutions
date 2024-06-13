package abstraction;

public class triangle extends shape{
	// abstract class shape er val1, val2 er access paise 
	triangle(double val1, double val2){
		super(val1, val2); // super class er constructor ke call
	}
	
	void area() {
		double result=val1*val2*0.5;
		System.out.println("Area of triangle: "+result);
	}
}
