package abstraction;

public class circle extends shape{
	// abstract class shape er val1, val2 er access paise 
	circle(double r){
		super(r,r); // super class er constructor ke call
	}
	
	void area() {
		double result= Math.PI*val1*val2;
		System.out.printf("Area of cirle: %.4f", result); // decimal process
	}
}
