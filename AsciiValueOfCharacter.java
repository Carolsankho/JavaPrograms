/**A Java program to print the ASCII value of a given character */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiValueOfCharacter {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input a character: ");
            char input = reader.readLine().charAt(0);
            int asciiValue = getAsciiValue(input);
            System.out.println("The ASCII value of " + input + " is: " + asciiValue);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

    public static int getAsciiValue(char character) {
        return (int) character;
    }
}
