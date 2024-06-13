package polymorphism;

public class rectangle extends shape{
	double height, width;
	
	rectangle(double height, double width) {
		this.height=height;
		this.width=width;
	}
	
	double area() {
		System.out.print("Area of rectangle: ");
		return height*width;
	}
}
