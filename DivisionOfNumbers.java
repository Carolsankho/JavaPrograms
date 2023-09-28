/** A simple Java program to divide two numbers entered by the user. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionOfNumbers{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the dividend: ");
            String input1 = reader.readLine();
            
            System.out.print("Enter the divisor: ");
            String input2 = reader.readLine();

            double dividend = Double.parseDouble(input1);
            double divisor = Double.parseDouble(input2);

            // Checking for division-by-zero error
            if (divisor != 0) {
                int result = (int)(dividend / divisor);
                System.out.println("Result: "+result);
            } 
            else {
                System.err.println("Error: Division by zero is not allowed.");
            }
        } 
        catch (IOException e) {
            System.err.println("Error reading input: "+ e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter valid numbers.");
        } 
        finally {
            try {
                reader.close();
            } 
            catch (IOException e) {
                System.err.println("Error closing BufferedReader: "+ e.getMessage());
            }
        }
    }
}
