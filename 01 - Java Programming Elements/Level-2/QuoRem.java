import java.util.Scanner;
public class QuoRem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int Quotient = num1/num2;
		int Remainder = num1%num2;
		System.out.println("The Quotient is "+Quotient+" and Reminder is "+Remainder+" of two number "+num1+" and "+num2);
	}
}
