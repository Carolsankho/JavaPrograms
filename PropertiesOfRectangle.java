/** A Java program to calculate and print the area and perimeter of a rectangle. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PropertiesOfRectangle {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the width of the rectangle: ");
            String widthInput = reader.readLine();
            double width = Double.parseDouble(widthInput);

            System.out.print("Enter the height of the rectangle: ");
            String heightInput = reader.readLine();
            double height = Double.parseDouble(heightInput);

            if (width != height) {
                int area = (int) (width * height);
                int perimeter = (int) (2 * (width + height));

                System.out.println("Area is = " + area);
                System.out.println("Perimeter is  = " + perimeter);
            } 
            else {
                System.err.println("Error: Width and height cannot be the same.");
            }
        } 
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter valid numbers.");
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
