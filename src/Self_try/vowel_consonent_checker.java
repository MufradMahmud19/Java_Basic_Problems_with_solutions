package Self_try;
import java.util.Scanner;

public class vowel_consonent_checker {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch); // Converting the character to lower-case
        String vowels = "aeiou"; // String containing all vowels in lower-case

        if (vowels.contains(Character.toString(ch))) {
            System.out.println("Vowel !");
        } else {
            System.out.println("Consonant !");
        }
    }
}