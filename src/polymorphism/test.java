package polymorphism;

public class test {
	public static void main(String[] args){
		shape s=new shape();
		rectangle r=new rectangle(10, 20);
		triangle t=new triangle(10,5);
		
		System.out.println(s.area());
		System.out.println(r.area());
		System.out.println(t.area());
		
		System.out.println();
		
		// next dynamic dispatch example
		// here, we will use the superclass (shape) and refer the subclass objects
		
		shape s1=new shape();
		shape s2=new rectangle(10, 5);
		shape s3=new triangle(8,5);
		
		System.out.println(s1.area());
		System.out.println(s2.area());
		System.out.println(s3.area());
		
		System.out.println();
		
		// for easy execution I will use array
		
		shape [] sh=new shape[3];
		sh[0]=new shape();
		sh[1]=new rectangle(12, 6);
		sh[2]=new triangle(20,10);
		
		for (int i=0; i<sh.length; i++) {
			System.out.println(sh[i].area());
		}
		
	}
}
