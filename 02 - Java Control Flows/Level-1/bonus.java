import java.util.Scanner;
public class bonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Salary = sc.nextDouble();
		int Years = sc.nextInt();
		if(Years>5){
			double Bonus = ((5d/100d)*Salary);
			System.out.println("The Bonus Amount is: "+Bonus);
		}
		else{
			System.out.println("No Bonus");
		}
	}
}
