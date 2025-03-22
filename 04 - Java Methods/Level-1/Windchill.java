import java.util.Scanner;
class Windchill{
        public static double calculateWindChill(double temperature, double windSpeed){
            double windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * (Math.pow(windSpeed,0.16));
            return windChill;
        }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double speed = sc.nextDouble();
        double result = calculateWindChill(temp, speed);
        System.out.printf("The wind chill temperature is: %.2f ",result);
    }
}

