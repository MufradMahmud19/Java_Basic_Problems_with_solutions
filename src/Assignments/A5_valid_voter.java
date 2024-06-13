package Assignments;
import java.util.Scanner;

public class A5_valid_voter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		
		if (age>=18) {
			System.out.println("Valid Voter !");
		} else {
			System.out.println("Not a valid Voter !");
		}
	}

}
