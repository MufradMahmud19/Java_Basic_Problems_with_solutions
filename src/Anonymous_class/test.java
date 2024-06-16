package Anonymous_class;

public class test {
	public static void main(String[] args) {
		
		person p = new person();
		p.display();
		
		person p2 = new person() { // staring of anonymous class
			@Override
			void display() {
				System.out.println("This is anonymous test class.");
			}
		};
		p2.display();
	}
}