import java.util.Scanner;
public class UnitConvertor2 {
    private static final double Yards2feet = 3;
    private static final double feet2yards = 0.333333;
    private static final double meters2inches = 39.3701;
    private static final double inches2meters = 0.0254;
    private static final double inches2cm = 2.54;

    public static double convertyardstomiles(double yards){
        return yards*Yards2feet;
    }
    public static double convertfeettoyards(double feet){
        return feet*feet2yards;
    }
    public static double convertmeterstoinches(double meter){
        return meter*meters2inches;
    }
    public static double convertinchestometers(double inches){
        return inches*inches2meters;
    }
    public static double convertinchestocm(double inches){
        return inches*inches2cm;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards+" yards = "+convertyardstomiles(yards)+" miles");
        System.out.println("Enter the distance in feets: ");
        double feet = sc.nextDouble();
        System.out.println(feet+" feets = "+convertfeettoyards(feet)+" yards");
        System.out.println("Enter the distance in meters: ");
        double meter = sc.nextDouble();
        System.out.println(meter+" meters = "+convertmeterstoinches(meter)+" inches");
        System.out.println("Enter the distance in inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches+" inches = "+convertinchestometers(inches)+" meters");
        System.out.println(inches+" inches = "+convertinchestocm(inches)+" cm");
    }
}
