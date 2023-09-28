/** A Java program to calculate and print the area and perimeter of a circle */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PropertiesOfCircle {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the radius of the circle: ");
            String input = reader.readLine();

            double radius = Double.parseDouble(input);

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter a valid number.");
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
