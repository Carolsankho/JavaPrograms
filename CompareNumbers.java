/** A Java program to compare two numbers without using built-in functions. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareNumbers {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input first integer: ");
            int num1 = Integer.parseInt(reader.readLine());

            System.out.print("Input second integer: ");
            int num2 = Integer.parseInt(reader.readLine());

            if (num1 != num2) {
                System.out.println(num1 + " != " + num2);
            }
            if (num1 < num2) {
                System.out.println(num1 + " < " + num2);
            }
            if (num1 <= num2) {
                System.out.println(num1 + " <= " + num2);
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
