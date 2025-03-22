import java.util.Scanner;
public class largest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int Larg;
			
		if (num1>num2 && num1>num3){
			Larg = num1;
		}
		else if (num2>num1 && num2>num3){
			Larg = num2;
		}
		else{
			Larg = num3;
		}
		System.out.println("The Largest Number is: "+Larg);
	}
}
