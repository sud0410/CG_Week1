import java.util.Scanner;
public class sumtillzero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double total=0.0;
		double num = sc.nextDouble();
		while(num!=0){
			total += num;
			num = sc.nextDouble();
		}
		System.out.println("The Final Value is "+total);
	}
}
