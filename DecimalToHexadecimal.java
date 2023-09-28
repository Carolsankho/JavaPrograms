/** A Java program to convert a decimal number to a hexadecimal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToHexadecimal {
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

            char[] hexDigits = "0123456789ABCDEF".toCharArray();
            StringBuilder hexadecimalNumber = new StringBuilder();

            if (decimalNumber == 0) {
                hexadecimalNumber.append("0");
            } else {
                while (decimalNumber > 0) {
                    int digit = decimalNumber % 16;
                    hexadecimalNumber.insert(0, hexDigits[digit]); 
                    decimalNumber /= 16;
                }
            }

            System.out.println("Hexadecimal number is: " + hexadecimalNumber);

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
