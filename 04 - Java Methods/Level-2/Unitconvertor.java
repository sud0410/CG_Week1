import java.util.Scanner;
public class Unitconvertor{

    private static final double pounds2kg = 0.453592;
    private static final double kg2pounds = 2.20462;
    private static final double gallons2liters = 3.78541;
    private static final double liters2gallons = 0.264172;

    public static double converfahrenheittocelsius(double fahrenheit){
        return (fahrenheit-32)*((double)5/9);
    }
    public static double convertcelsiustofahrenheit(double celsius){
        return (celsius * ((double)9/5))+32;
    }
    public static double convertpoundstokg(double pounds){
        return pounds*pounds2kg;
    }
    public static double convertkgtopounds(double kg){
        return kg*kg2pounds;
    }
    public static double convertgallonstoliters(double gallons){
        return gallons*gallons2liters;
    }
    public static double convertliterstogallons(double liters){
        return liters*liters2gallons;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree in fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit+" fahrenheit = "+converfahrenheittocelsius(fahrenheit)+" celsius");
        System.out.println("Enter the degree in celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius+" celsius = "+convertcelsiustofahrenheit(celsius)+" fahrenheit");
        System.out.println("Enter the weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds+" pounds = "+convertpoundstokg(pounds)+" kg");
        System.out.println("Enter the weight in kg: ");
        double kg = sc.nextDouble();
        System.out.println(kg+" kg = "+convertkgtopounds(kg)+" pounds");
        System.out.println("Enter the volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons+" gallons = "+convertgallonstoliters(gallons)+" liters");
        System.out.println("Enter the volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters+" liters = "+convertliterstogallons(liters)+" gallons");
    }
}

