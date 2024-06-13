package Assignments;

import java.util.Scanner;

public class A9_and_12_call_center {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Choose language option from below:\n1.Bengali.\n2.Hindi.\n3.Urdu.\n** Any other choice will automatically choose English as preferred language **\n\nChoose one language: ");
		int val=sc.nextInt();
		
		switch(val) {
		case 1:
			System.out.println("You have choosed Bengali language.");
			break;
		case 2:
			System.out.println("You have choosed Hindi language.");
			break;
		case 3:
			System.out.println("You have choosed Urdu language.");
			break;
		default:
			System.out.println("You have choosed English language.");
		}
	}
}
