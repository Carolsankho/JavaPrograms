/** A Java program to multiply two binary numbers */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryMultiplication {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input the first binary number: ");
            String binary1 = reader.readLine();

            System.out.print("Input the second binary number: ");
            String binary2 = reader.readLine();

            int num1 = Integer.parseInt(binary1, 2);
            int num2 = Integer.parseInt(binary2, 2);
            int product = num1 * num2;

            String result = Integer.toBinaryString(product);
            System.out.println("Product of two binary numbers: " + result);

        } 
        catch(IOException e){
            System.err.println("Error reading input: " + e.getMessage());
        } 
        catch(NumberFormatException e){
            System.err.println("Error: Invalid binary input. Please enter valid binary numbers.");
        } 
        finally{
            try{
                reader.close();
            }catch (IOException e){
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
