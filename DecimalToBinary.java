/** A Java program to convert a decimal number to a binary number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a Decimal Number: ");
            String decimalInput = reader.readLine();
            int decimalNumber = Integer.parseInt(decimalInput);

            if (decimalNumber < 0) {
                System.err.println("Error: Negative numbers are not supported.");
                return;
            }
            StringBuilder binaryNumber = new StringBuilder();
            if (decimalNumber == 0) {
                binaryNumber.append("0");
            } else {
                while (decimalNumber > 0) {
                    int remainder = decimalNumber % 2;
                    binaryNumber.insert(0, remainder);
                    decimalNumber /= 2;
                }
            }
            System.out.println("Binary number is: " + binaryNumber);

        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter a valid decimal number.");
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