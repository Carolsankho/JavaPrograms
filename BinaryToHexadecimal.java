/** A Java program to convert a binary number to a hexadecimal number. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a Binary Number: ");
            String binaryInput = reader.readLine();
            if (!isValidBinary(binaryInput)) {
                System.err.println("Error: Invalid binary input. Please enter a valid binary number.");
                return;
            }
            String hexadecimalValue = binaryToHexadecimal(binaryInput);
            System.out.println("HexaDecimal value: " + hexadecimalValue);
        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
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
    private static boolean isValidBinary(String binary) {
        return binary.matches("[01]+");
    }
    private static String binaryToHexadecimal(String binary) {
        int decimalValue = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimalValue).toUpperCase();
    }
}
