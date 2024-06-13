package Assignments;

import java.util.Scanner;

public class A17_pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n=sc.nextInt();
		
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				if(col%2==1) {
					System.out.print("1 ");
				}else if(col%2==0) {
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}
	}
}
