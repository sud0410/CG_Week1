import java.util.Scanner;
public class UnitConvertor1 {
    private static final double km2miles=0.621371;
    private static final double miles2km=1.60934;
    private static final double meters2feet=3.28084;
    private static final double feet2meters=0.3048;

    public static double convertKmtoMiles(double km){
        return km*km2miles;
    }
    public static double convertMilestoKm(double miles){
        return miles*miles2km;
    }
    public static double convertmeterstofeet(double meters){
        return meters*meters2feet;
    }
    public static double convertfeettometers(double feet){
        return feet*feet2meters;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kms:");
        double km = sc.nextDouble();
        System.out.println(km+" KM = "+convertKmtoMiles(km)+" miles");
        System.out.println("Enter the distance in miles:");
        double miles = sc.nextDouble();
        System.out.println(miles+" miles = "+convertMilestoKm(miles)+" KM");
        System.out.println("Enter the distance in meters:");
        double meters = sc.nextDouble();
        System.out.println(meters+" meters = "+convertmeterstofeet(meters)+" feet");
        System.out.println("Enter the distance in feet:");
        double feet = sc.nextDouble();
        System.out.println(feet+" feet = "+convertfeettometers(feet)+" meters");

    }
}
