package Self_try;
import java.util.Scanner;

public class multiplication_table {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the initial value of multiplication table: ");
		int st=sc.nextInt();
		
		System.out.print("Enter the final value of multiplication table: ");
		int fn=sc.nextInt();
		
		int res=1;
		
		for (int i=st; i<=fn; i++) {
			for (int j=1; j<=10; j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
			System.out.println("\n");
		}
	}
}
