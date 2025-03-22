import java.util.Scanner;
public class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Principal = sc.nextDouble();
		double Rate = sc.nextDouble();
		double Time = sc.nextDouble();
		double SI = (Principal * Rate * Time)/100;
		System.out.println("The Simple Interest is "+SI+" for Principal "+Principal+", Rate of Interest "+Rate+" and "+Time+" Years.");
	}
}
