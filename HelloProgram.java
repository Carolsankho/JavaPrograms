/**
 A simple Java program that greets the user with "Hello" and requests their name,
 then validates the name input to ensure it consists of only alphabets.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloProgram {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            
            // Check if the name given has input consists only alphabets (including spaces)

            if (name.matches("[a-zA-Z\\s]+")) {
                System.out.println("Hello");
                System.out.println(name);
            } 
            else {
                System.err.println("Error: Name should consist of only alphabets and no other special characters or Numbers.");
            }
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
