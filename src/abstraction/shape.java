package abstraction;

public abstract class shape {
	double val1, val2;
	
	shape(double val1, double val2){
		this.val1=val1;
		this.val2=val2;
	}
	
	abstract void area(); // abstract method
}
