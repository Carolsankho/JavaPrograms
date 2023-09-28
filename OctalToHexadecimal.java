/** A Java program to convert an octal number to a hexadecimal number. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToHexadecimal {    
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input an octal number: ");
            String octalInput = reader.readLine();
            if (!isValidOctal(octalInput)) {
                System.err.println("Error: Invalid octal input. Please enter a valid octal number.");
                return;
            }
            String hexadecimalValue = octalToHexadecimal(octalInput);
            System.out.println("Equivalent hexadecimal number: " + hexadecimalValue);
        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
    private static boolean isValidOctal(String octal) {
        for (char digit : octal.toCharArray()) {
            if (digit < '0' || digit > '7') {
                return false;
            }
        }
        return true;
    }
    private static String octalToHexadecimal(String octal) {
        int decimalValue = octalToDecimal(octal);
        return decimalToHexadecimal(decimalValue);
    }
    private static int octalToDecimal(String octal) {
        int decimalValue = 0;
        int length = octal.length();

        for (int i = 0; i < length; i++) {
            int digit = octal.charAt(i) - '0';
            decimalValue += digit * Math.pow(8, length - i - 1);
        }
        return decimalValue;
    }
    private static String decimalToHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexDigit = (char) (remainder < 10 ? '0' + remainder : 'A' + (remainder - 10));
            hexadecimal.insert(0, hexDigit);
            decimal /= 16;
        }
        return hexadecimal.toString();
    }
}
