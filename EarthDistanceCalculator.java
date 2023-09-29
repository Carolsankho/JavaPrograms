/** A Java Program to calculate the distance between points on the Earth */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EarthDistanceCalculator {
    public static void main(String[] args) {
        EarthDistanceCalculator calculator = new EarthDistanceCalculator();
        calculator.Calculate();
    }

    public void Calculate() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter latitude of point 1: ");
            String latitude1Input = reader.readLine();
            double latitude1 = Double.parseDouble(latitude1Input);

            System.out.print("Enter longitude of point 1: ");
            String longitude1Input = reader.readLine();
            double longitude1 = Double.parseDouble(longitude1Input);

            System.out.print("Enter latitude of point 2: ");
            String latitude2Input = reader.readLine();
            double latitude2 = Double.parseDouble(latitude2Input);

            System.out.print("Enter longitude of point 2: ");
            String longitude2Input = reader.readLine();
            double longitude2 = Double.parseDouble(longitude2Input);

            double distance = calculateDistance(latitude1, longitude1, latitude2, longitude2);
            System.out.println("The distance between the points is: " + distance + " km");
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

    public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double radius = 6371.01; // Earth's radius in kilometers

        // Convert latitude and longitude from degrees to radians
        double x1 = Math.toRadians(lat1);
        double y1 = Math.toRadians(lon1);
        double x2 = Math.toRadians(lat2);
        double y2 = Math.toRadians(lon2);

        // Calculate the distance using the formula
        double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        return distance;
    }
}
