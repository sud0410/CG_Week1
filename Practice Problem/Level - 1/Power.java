import java.util.Scanner;
public class Power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Base = sc.nextDouble();
		double Exponent = sc.nextDouble();
		double PowerValue = Math.pow(Base, Exponent);
		System.out.println("Power Calculation is: "+PowerValue);
	}
}
