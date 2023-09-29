/** A Java program to compute the area of a polygon.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfPolygon {
    public static void main(String[] args) {
        AreaOfPolygon calculator = new AreaOfPolygon();
        calculator.Calculate();
    }
    public void Calculate() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input the number of sides on the polygon: ");
            String sidesInput = reader.readLine();
            int sides = Integer.parseInt(sidesInput);

            System.out.print("Input the length of one of the sides: ");
            String sideLengthInput = reader.readLine();
            double sideLength = Double.parseDouble(sideLengthInput);

            double area = calculatePolygonArea(sides, sideLength);
            System.out.println("The area is: " + area);
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
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }

    public double calculatePolygonArea(int sides, double sideLength) {
        return (sides * sideLength * sideLength) / (4 * Math.tan(Math.PI / sides));
    }
}
