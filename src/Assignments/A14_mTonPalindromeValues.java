package Assignments;

import java.util.Scanner;

public class A14_mTonPalindromeValues {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter initial value: ");
		int m=sc.nextInt();
		
		System.out.print("Enter last value: ");
		int n=sc.nextInt();
		
		int r, count=0;
		
		for(int i=m; i<=n; i++) {
			int temp=i;
			int sum=0;
			while(temp != 0) {
				r=temp%10;
				sum=sum*10+r;
				temp=temp/10;
			}
			if(sum==i) {
				System.out.println(i);
				count+=1;
			}
		}
		System.out.println("Total palindrome values between "+m+" to "+n+" is: "+count);
	}
}
