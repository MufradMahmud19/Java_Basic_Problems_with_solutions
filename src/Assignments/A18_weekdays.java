package Assignments;

import java.util.Scanner;

public class A18_weekdays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String [] weekdays= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.print("Enter day number (1-7): ");
		int n=sc.nextInt();
		
		for(int i=0; i<weekdays.length; i++) {
			if(i==(n-1)) {
				System.out.println(weekdays[i]);
			}
		}
	}
}
