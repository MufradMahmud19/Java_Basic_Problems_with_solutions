package Assignments;

import java.util.Scanner;

public class A7_Java_lover_or_not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Do you love Java? -> ");
		char ch=sc.next().charAt(0);
		
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Yes, you love Java.");
		} else if(ch == 'n' || ch == 'N') {
			System.out.println("No, you don't love Java.");
		}else {
			System.out.println("Invalid Answer.");
		}
	}

}
