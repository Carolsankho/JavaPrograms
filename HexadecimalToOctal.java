/** A Java program to convert a hexadecimal value to an octal number. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexadecimalToOctal {
    public static void main(String[] args) {
        HexadecimalToOctal converter = new HexadecimalToOctal();
        converter.run();
    }

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a hexadecimal number: ");
            String hexInput = reader.readLine();
            if (!isValidHexadecimal(hexInput)) {
                System.err.println("Error: Invalid hexadecimal input. Please enter a valid hexadecimal number.");
                return;
            }
            String octalValue = hexadecimalToOctal(hexInput);
            System.out.println("Equivalent of octal number is: " + octalValue);

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }

    public boolean isValidHexadecimal(String hexadecimal) {
        for (char digit : hexadecimal.toCharArray()) {
            if (!((digit >= '0' && digit <= '9') || (digit >= 'A' && digit <= 'F') || (digit >= 'a' && digit <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public String hexadecimalToOctal(String hexadecimal) {
        // Converting the hexadecimal input to a decimal number
        int decimalValue = hexadecimalToDecimal(hexadecimal);

        // Converting the decimal number to octal
        return decimalToOctal(decimalValue);
    }

    public String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder);
            decimal /= 8;
        }

        return octal.toString();
    }

    public int hexadecimalToDecimal(String hexadecimal) {
        int decimalValue = 0;
        int length = hexadecimal.length();

        for (int i = 0; i < length; i++) {
            char digit = hexadecimal.charAt(i);
            int digitValue;

            if (digit >= '0' && digit <= '9') {
                digitValue = digit - '0';
            } else if (digit >= 'A' && digit <= 'F') {
                digitValue = 10 + (digit - 'A');
            } else {
                digitValue = 10 + (digit - 'a');
            }

            decimalValue += digitValue * Math.pow(16, length - i - 1);
        }

        return decimalValue;
    }
}
