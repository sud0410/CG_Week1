import java.util.Scanner;
public class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float Sum = num1+num2;
		float Difference = num1-num2;
		float Product = num1*num2;
		float Division = num1/num2;
		System.out.println("The addition, subraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+Sum+" , "+Difference+" , "+Product+" and "+Division);
	}
}
