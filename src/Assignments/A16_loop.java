package Assignments;

import java.util.Scanner;

public class A16_loop {
	public static void main(String[] args) {
		String username="mufrad";
		String pass="20101316";
		
		Scanner sc=new Scanner(System.in);
		boolean flag= false;
		while(!flag) { // until flag=true (loop condition) 
			System.out.print("Enter username: ");
			String a=sc.nextLine();
			
			System.out.print("Enter password: ");
			String b=sc.nextLine();
			
			if(a.equals(username) && (b.equals(pass))) {
				System.out.println("Welcome to the system !");
				flag = true;
			} else {
				System.out.println("Username/password incorrect. Please try again !");
			}
		}
	}
}
