/** A Java program to Reverse a string .*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReversing {
    public static void main(String[] args) {
        StringReversing reverser = new StringReversing();
        reverser.traverse();
    }

    public void traverse() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a string: ");
            String input = reader.readLine();
            String reversed = reverseString(input);
            System.out.println("Reverse string: " + reversed);
        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }

    public String reverseString(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }
        return new String(characters);
    }
}
