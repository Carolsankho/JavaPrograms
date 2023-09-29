/** A Java program to compute the area of a hexagon.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfHexagon {
    public static void main(String[] args) {
        AreaOfHexagon calculator = new AreaOfHexagon();
        calculator.run();
    }

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input the length of a side of the hexagon: ");
            String input = reader.readLine();
            if (!isValidNumber(input)) {
                System.err.println("Error: Invalid input. Please enter a valid number.");
                return;
            }

            double sideLength = Double.parseDouble(input);
            double area = calculateHexagonArea(sideLength);
            System.out.println("The area of the hexagon is: " + area);

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }

    public double calculateHexagonArea(double sideLength) {
        return (6 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 6));
    }

    public boolean isValidNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

