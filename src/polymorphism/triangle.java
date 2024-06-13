package polymorphism;

public class triangle extends shape{
	double height, base;
	
	triangle(double height, double base) {
		this.height=height;
		this.base=base;
	}
	
	double area() {
		System.out.print("Area of triangle: ");
		return height*base*0.5;
	}
}