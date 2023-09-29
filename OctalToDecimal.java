/**A Java program to convert an octal number to a decimal number.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToDecimal {
    public static void main(String[] args) {
        OctalToDecimal converter = new OctalToDecimal();
        converter.run();
    }

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input any octal number: ");
            String octalInput = reader.readLine();

            if (!isValidOctal(octalInput)) {
                System.err.println("Error: Invalid octal input. Please enter a valid octal number.");
                return;
            }
            int decimalNumber = octalToDecimal(octalInput);
            System.out.println("Equivalent decimal number: " + decimalNumber);

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
    public boolean isValidOctal(String octal) {
        for (char digit : octal.toCharArray()) {
            if (digit < '0' || digit > '7') {
                return false;
            }
        }
        return true;
    }

    public int octalToDecimal(String octal) {
        int decimalNumber = 0;
        int length = octal.length();
        for (int i = 0; i < length; i++) {
            int digit = octal.charAt(i) - '0';
            decimalNumber += digit * Math.pow(8, length - i - 1);
        }

        return decimalNumber;
    }
}

