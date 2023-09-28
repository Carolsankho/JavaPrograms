/**  A Java program to calculate and print the average of three numbers */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageOfNumbers {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the first number: ");
            String input1 = reader.readLine();
            double number1 = Double.parseDouble(input1);

            System.out.print("Enter the second number: ");
            String input2 = reader.readLine();
            double number2 = Double.parseDouble(input2);

            System.out.print("Enter the third number: ");
            String input3 = reader.readLine();
            double number3 = Double.parseDouble(input3);

            int average = (int)((number1 + number2 + number3) / 3.0);
            System.out.println("Average is = " + average);

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
