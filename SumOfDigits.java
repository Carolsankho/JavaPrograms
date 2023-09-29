/** A Java program to compute the sum of an integer's digits */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits calculator = new SumOfDigits();
        calculator.Calculate();
    }

    public void Calculate() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input an integer: ");
            String input = reader.readLine();

            if (!isValidInteger(input)) {
                System.err.println("Error: Invalid input. Please enter a valid integer.");
                return;
            }
            int number = Integer.parseInt(input);
            int sum = calculateSumOfDigits(number);
            System.out.println("The sum of the digits is: " + sum);

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

    public int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
