package Assignments;

import java.util.Scanner;

public class A11_factorial{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		int res=1;
		for(int i=1; i<=a; i++) {
			res*=i;
		}
		System.out.println(a+"! = "+res);
	}
}