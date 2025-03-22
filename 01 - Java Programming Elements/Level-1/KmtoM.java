import java.util.Scanner;
public class KmtoM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double km;
		km = sc.nextDouble();
		double mile = 0.62*km;
		System.out.println("The total miles is "+mile+" mile for the given "+km+" km");
	}
}
