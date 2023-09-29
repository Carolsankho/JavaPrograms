/**A Java program to convert an octal number to a binary number.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToBinary {
    public static void main(String[] args) {
        OctalToBinary converter = new OctalToBinary();
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
            String binaryNumber = octalToBinary(octalInput);
            System.out.println("Equivalent binary number: " + binaryNumber);

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

    public String octalToBinary(String octal) {
        StringBuilder binary = new StringBuilder();

        for (char digit : octal.toCharArray()) {
            int octalDigit = digit - '0';
            String binaryDigit = Integer.toBinaryString(octalDigit);
            while (binaryDigit.length() < 3) {
                binaryDigit = "0" + binaryDigit;
            }
            binary.append(binaryDigit);
        }
        return binary.toString();
    }
}
