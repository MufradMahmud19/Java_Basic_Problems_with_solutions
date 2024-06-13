package Assignments;

import java.util.Scanner;

public class A8_and_operator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Have you done completed your Master's? -> ");
		char ms=sc.next().charAt(0);
		
		System.out.print("Are you fluent in English? -> ");
		char en=sc.next().charAt(0);
		
		if ((ms == 'y' || ms == 'Y') && (en == 'y' || en == 'Y')) {
			System.out.println("Yes, you are eligible for this job !");
		} else {
			System.out.println("No, you are not eligible for this job !");
		}
	}
}