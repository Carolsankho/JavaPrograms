/** A Java program to add two binary numbers. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryAddition {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input first binary number: ");
            String binary1 = reader.readLine();

            System.out.print("Input second binary number: ");
            String binary2 = reader.readLine();

            int num1 = Integer.parseInt(binary1, 2);
            int num2 = Integer.parseInt(binary2, 2);

            int sum = num1 + num2;
            String result = Integer.toBinaryString(sum);
            System.out.println("Sum of two binary numbers: " + result);

        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.err.println("Error: Invalid binary input. Please enter valid binary numbers.");
        } 
        finally {
            try {
                reader.close();
            } 
            catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
