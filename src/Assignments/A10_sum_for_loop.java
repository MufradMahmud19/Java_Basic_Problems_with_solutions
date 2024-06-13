package Assignments;

import java.util.Scanner;

public class A10_sum_for_loop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the initial number: ");
		int a=sc.nextInt();
		
		System.out.print("Enter the last number: ");
		int b=sc.nextInt();
		
		int sum=0;
		
		
		// for loop
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		
		
		/*
		 * while loop 
		 * 
		while(a<=b) {
			sum+=a;
			a++;
		}
		
		*/
		
		/*
		 * do while loop
		 * 
		do {
			sum+=a;
			a++;
		}while(a<=b);
			
		*/
		
		System.out.println("The sum from the initial number to the last number is: "+sum);
	}
}
