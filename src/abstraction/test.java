package abstraction;

public class test {
	public static void main(String[] args) {
		shape sh; // abstract class er object create kora jayna, tobe reference var create kora jay
		
		sh = new rectangle(10,20);
		sh.area();
		
		sh = new triangle(10,30);
		sh.area();
		
		sh = new circle(10);
		sh.area();
		
	}
}
