package Self_try;

import java.util.Scanner;

public class fibonacci_series {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter which indexed fibonacci value you want to see? -> ");
		int n=sc.nextInt();
		
		int f=0,s=1,fib;
		
		System.out.print("The fibonacci series till nth value is -> "+f+" "+s+" ");
		
		for (int i=3; i<=n; i++) {
			fib=f+s;
			System.out.print(fib+" ");
			f=s;
			s=fib;
		}
	}
}
