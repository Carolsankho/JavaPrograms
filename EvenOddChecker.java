/** A Java Program to Check if a give number is odd or even.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddChecker {
    public static void main(String[] args) {
        EvenOddChecker checker = new EvenOddChecker();
        checker.find();
    }
 public boolean isEven(int number) {
        return (number % 2) == 0;
    }
    public void find() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a number: ");
            int number = Integer.parseInt(reader.readLine());

            int result = isEven(number) ? 1 : 0;
            System.out.println(result);

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
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
   
}
