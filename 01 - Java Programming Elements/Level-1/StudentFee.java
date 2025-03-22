import java.util.Scanner;
public class StudentFee{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Fee = sc.nextDouble();
		double Disocunt_Percent = sc.nextDouble();
		double Discount_Amount = Fee/Disocunt_Percent;
		double Discounted_Fee = Fee-Discount_Amount;
		System.out.println("The Discount Amount is INR "+Discount_Amount+" and final discounted fee is INR "+Discounted_Fee);
	}
}
