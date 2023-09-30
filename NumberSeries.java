/** A Java program that accepts an integer (n) and computes the value of n+nn+nnn */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSeries {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input number: ");
            int n = Integer.parseInt(reader.readLine());
            
            int nn = n * 10 + n;
            int nnn = nn * 10 + n;
            
            int result = n + nn + nnn;
            
            System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}
