import java.util.Scanner;
public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        // Create a UnitConverter object
        UnitConverter unitConverter = new UnitConverter();

        // Call the method to convert km to miles
        double miles = unitConverter.convertKmToMiles(km);

        // Display value in miles
        System.out.println("Distance in miles: " + miles);

        // Close the Scanner object
        sc.close();
    }
}
