/** a Java program to input and display your password */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input your Password: ");
            String password = reader.readLine();
            System.out.println("Your password was: " + password);

            int length = password.length();
            if (length < 8) {
                System.out.println("Password is weak. It should be at least 8 characters long.");
            } 
            else {
                System.out.println("Password is strong.");
            }
        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}
