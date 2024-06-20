package Self_try;

import java.util.Scanner;

public class Exception_2 { // if scanner doesn't work write public class Exception_2 throws IOexception{..} to solve
	public static void main(String[] args) {
		int count=1;
		while(count==1) {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter first number: ");
				int num1=sc.nextInt();
				
				System.out.print("Enter second number: ");
				int num2=sc.nextInt();
				
				int res=num1/num2;
				
				System.out.println("Result: "+num1+"/"+num2+" = "+res);
				System.out.println("Execution Ended !!!");
				count=2;
			}catch(Exception e) {
				System.out.println("Exception: "+e);
				System.out.println("You must enter integer, please try again.");
				count=1;
			}
		}
	}
}