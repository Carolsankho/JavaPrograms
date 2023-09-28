/** A Java program to print the multiplication table of a number entered by the user. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTables {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            String input = reader.readLine();
            int number = Integer.parseInt(input);

            if (number == 0) {
                System.out.println("The multiplication table for 0 is trivial. All results are 0.");
            } 
            else {
                System.out.println("Multiplication table for " + number + ":");

                for (int i = 1; i <= 10; i++) {
                    int result = number * i;
                    System.out.println(number + " x " + i + " = " + result);
                }
            }
        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter a valid number.");
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
