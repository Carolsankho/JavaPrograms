/** A Java program to count the different characters in a string.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingCharacters {
    public static void main(String[] args) {
        CountingCharacters counter = new CountingCharacters();
        counter.Count();
    }
    public void Count() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a string: ");
            String input = reader.readLine();
            int letterCount = 0;
            int spaceCount = 0;
            int numberCount = 0;
            int otherCount = 0;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLetter(c)) {
                    letterCount++;
                } 
                else if (Character.isDigit(c)) {
                    numberCount++;
                } 
                else if (Character.isWhitespace(c)) {
                    spaceCount++;
                }  
                else {
                    otherCount++;
                }
            }

            System.out.println("The string is: " + input);
            System.out.println("letters: " + letterCount);
            System.out.println("spaces: " + spaceCount);
            System.out.println("numbers: " + numberCount);
            System.out.println("others: " + otherCount);

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
}
