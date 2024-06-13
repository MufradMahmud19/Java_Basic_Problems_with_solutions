package Assignments;

import java.util.Scanner;

public class A3_product_user_input {
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);
		
		int id, price;
		String title, description, category;
		
		System.out.print("Enter ID: ");
		id=sc1.nextInt();
		
		System.out.print("Enter title: ");
		title=sc2.nextLine();
		
		System.out.print("Enter price (in Euros): ");
		price=sc3.nextInt();
		
		System.out.print("Enter description: ");
		description=sc4.nextLine();
		
		System.out.print("Enter category: ");
		category=sc5.next();
		
		System.out.println("ID: "+id);
		System.out.println("Title: "+title);
		System.out.println("Price: "+price+" Euros");
		System.out.println("Description: "+description);
		System.out.println("Category: "+category);
	}
}