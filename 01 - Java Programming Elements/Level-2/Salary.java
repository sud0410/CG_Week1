import java.util.Scanner;
public class Salary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		double bonus = sc.nextDouble();
		double Income = salary+bonus;
		System.out.println("The Salary in INR "+salary+" and bonus in INR "+bonus+".");
		System.out.println("Hence Total income is INR "+Income);
	}
}

