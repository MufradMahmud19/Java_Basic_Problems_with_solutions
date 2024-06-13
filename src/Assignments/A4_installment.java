package Assignments;

import java.util.Scanner;

public class A4_installment {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			
			int phonePrice, numberOfInstallment, installmentPerMonth;
			
			System.out.print("Price of Phone (in Euros)? -> ");
			phonePrice=sc.nextInt();
			
			System.out.print("Number of installments? -> ");
			numberOfInstallment=sc.nextInt();
			
			installmentPerMonth=phonePrice/numberOfInstallment;
			System.out.println("Installment Per Month: "+installmentPerMonth);
		}
	}
}
