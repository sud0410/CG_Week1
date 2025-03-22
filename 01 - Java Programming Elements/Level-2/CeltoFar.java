import java.util.Scanner;
public class CeltoFar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Celsius = sc.nextDouble();
		double Fahrenheit = (Celsius *(9d/5d))+32;
		System.out.println("The Temperature in Celsius is "+Celsius+" and in Fahrenheit is "+Fahrenheit);
	}
}

