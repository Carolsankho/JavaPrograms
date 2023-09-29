/** A Java Program to convert Binary values to Octal values. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToOctal {
    public static void main(String[] args) {
        BinaryToOctal converter = new BinaryToOctal();
        converter.run();
    }

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a Binary Number: ");
            String binaryInput = reader.readLine();

            if (!isValidBinary(binaryInput)) {
                System.err.println("Error: Invalid binary input. Please enter a valid binary number.");
                return;
            }
            String octalNumber = binaryToOctal(binaryInput);
            System.out.println("Octal number: " + octalNumber);

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

    public String binaryToOctal(String binary) {
        while (binary.length() % 3 != 0) {
            binary = "0" + binary; 
        }

        StringBuilder octal = new StringBuilder();
        int length = binary.length();

        for (int i = 0; i < length; i += 3) {
            String group = binary.substring(i, i + 3);
            int decimalValue = Integer.parseInt(group, 2);
            octal.append(Integer.toOctalString(decimalValue));
        }

        return octal.toString();
    }
}
