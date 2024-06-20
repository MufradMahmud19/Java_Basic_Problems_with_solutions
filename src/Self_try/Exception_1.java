package Self_try;

public class Exception_1 {
	public static void main(String[] args) {
		// First part 
		
		try {
			int x=10;
			int y=0;
			int res=x/y;
			System.out.println("Result: "+res);
		}catch(ArithmeticException e1) {
			System.out.println("Exception: "+e1);
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Exception: "+e2);
		}
		
		catch(Exception e) { // it is used if we don't have the idea of the type of exception, it's like universal
		System.out.println("Exception: "+e);
		}
	
		
		// Second part
		
		try {
			int [] a = new int[4];
			a[4]=32;
			
		}
		
		catch(ArithmeticException e1) {
			System.out.println("Exception: "+e1);
		}
		/*
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Exception: "+e2);
		}
		*/
		catch(Exception e) { // it is used if we don't have the idea of the type of exception, it's like universal
			System.out.println("Exception: "+e);
		}
		
		
		finally { // Any code after try and catch we wanna execute would have to be under finally
			int a=5;
			int b=11;
			int c=a+b;
			System.out.println(c);
			
			String aa="Mufr";
			String bb="ad";
			System.out.println("User name: "+aa+bb);
			
			System.out.println("Last line of code.");
		}
	}
}
