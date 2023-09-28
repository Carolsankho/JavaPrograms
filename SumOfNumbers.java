/** A simple Java program to add two numbers entered by the user. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbers {    
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the first number: ");
            String input1 = reader.readLine();
            
            System.out.print("Enter the second number: ");
            String input2 = reader.readLine();
            int number1 = Integer.parseInt(input1);
            int number2 = Integer.parseInt(input2);

            int sum = number1 + number2;

            System.out.println("Sum of the 2 numbers is: " + sum);
        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter valid numbers.");
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
