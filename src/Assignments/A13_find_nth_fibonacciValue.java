package Assignments;

import java.util.Scanner;

public class A13_find_nth_fibonacciValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter which indexed fibonacci value you want to see? -> ");
		int n=sc.nextInt();
		
		long f=0;
		long s=1;
		long fib=0;
		
		System.out.print("The nth value of fibonacci series is -> ");
		
		for (int i=3; i<=n; i++) {
			fib=f+s;
			f=s;
			s=fib;
		}
		System.out.print(fib);
	}
}
