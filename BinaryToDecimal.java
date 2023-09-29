/** A Java Program  to convert Binary values to Decimal Values. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimal {
    public static void main(String[] args) {
        BinaryToDecimal converter = new BinaryToDecimal();
        converter.run();
    }

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a binary number: ");
            String binaryInput = reader.readLine();

            if (!isValidBinary(binaryInput)) {
                System.err.println("Error: Invalid binary input. Please enter a valid binary number.");
                return;
            }

            int decimalNumber = binaryToDecimal(binaryInput);
            System.out.println("Decimal Number: " + decimalNumber);
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

    public boolean isValidBinary(String binary) {
        return binary.matches("[01]+");
    }

    public int binaryToDecimal(String binary) {
        int decimalNumber = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binary.charAt(i));
            decimalNumber += digit * Math.pow(2, power);
            power++;
        }
        return decimalNumber;
    }
}