import java.util.Scanner;
public class KmtoMiles{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Km = sc.nextDouble();
		double Miles = (Km*0.621371);
		System.out.println("Km in Miles is: "+Miles);
	}
}