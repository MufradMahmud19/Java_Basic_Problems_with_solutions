package Homework_temperature_conversion;

import java.util.Scanner;

public class HW {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double value;
        String c_f;

        System.out.print("Convert to what (C/F)? -> ");
        c_f = sc.nextLine();

        System.out.print("The value? -> ");
        value = sc.nextDouble();
        sc.nextLine(); // Consume the newline character left by nextDouble()

        if (c_f.equalsIgnoreCase("F")) {
            value = (1.8 * value) + 32; // F=(9/5)*C+32
        } else if (c_f.equalsIgnoreCase("C")) {
            value = 0.55556 * (value - 32); // C=(5/9)*(F-32)
        }
        System.out.print("The converted temperature is: " + value + " " + c_f.toUpperCase());
    }
}
