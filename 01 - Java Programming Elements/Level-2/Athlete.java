import java.util.Scanner;
public class Athlete{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		double s3 = sc.nextDouble();
		double perimeter = s1+s2+s3;
		double Rounds = 5/perimeter;
		int TotalRounds = (int) Math.floor(Rounds);
		System.out.println("The total number of rounds the athelete will run is "+TotalRounds+" to complete 5Km");
	}
}
