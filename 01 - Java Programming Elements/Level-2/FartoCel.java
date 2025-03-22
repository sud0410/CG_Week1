import java.util.Scanner;
public class FartoCel{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Fahrenheit = sc.nextDouble();
		double Celsius = (Fahrenheit-32)*(5d/9d);
		System.out.println("The Temperature in Fahrenheit is "+Fahrenheit+" and in Celsius is "+Celsius);
	}
}
	