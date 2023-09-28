/** A Java Program to convert Decimal Number to Octal values . */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToOctal {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a Decimal Number: ");
            String decimalInput = reader.readLine();

            int decimalNumber = Integer.parseInt(decimalInput);
            if (decimalNumber < 0) {
                System.err.println("Error: Negative numbers are not supported.");
                return;
            }

            String octalNumber = decimalToOctal(decimalNumber);
            System.out.println("Octal number is: " + octalNumber);

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
    private static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        if (decimal == 0) {
            octal.append("0");
        } else {
            while (decimal > 0) {
                int digit = decimal % 8;
                octal.insert(0, digit);
                decimal /= 8;
            }
        }
        
        return octal.toString();
    }
}