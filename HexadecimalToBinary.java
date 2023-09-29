/**  A Java program to convert a hexadecimal value to a binary number. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        HexadecimalToBinary converter = new HexadecimalToBinary();
        converter.run();
    }

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter Hexadecimal Number: ");
            String hexInput = reader.readLine();
            if (!isValidHexadecimal(hexInput)) {
                System.err.println("Error: Invalid hexadecimal input. Please enter a valid hexadecimal number.");
                return;
            }

            // Convert the hexadecimal input to a binary number
            String binaryValue = hexadecimalToBinary(hexInput);
            System.out.println("Equivalent Binary Number is: " + binaryValue);

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

    public String hexadecimalToBinary(String hexadecimal) {
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < hexadecimal.length(); i++) {
            char digit = hexadecimal.charAt(i);
            int digitValue;

            if (digit >= '0' && digit <= '9') {
                digitValue = digit - '0';
            } else if (digit >= 'A' && digit <= 'F') {
                digitValue = 10 + (digit - 'A');
            } else {
                digitValue = 10 + (digit - 'a');
            }
            String binaryDigit = String.format("%4s", Integer.toBinaryString(digitValue)).replace(' ', '0');
            binary.append(binaryDigit);
        }
        return binary.toString();
    }
}
