import java.util.Scanner;
public class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double Result = 0;
		String op = sc.next();
		switch(op){
			case "+":
			Result = num1+num2;
			System.out.println(Result);
			break;
			case "-":
			Result = num1-num2;
			System.out.println(Result);
			break;
			case "*":
			Result = num1*num2;
			System.out.println(Result);
			break;
			case "/":
			if(num2!=0){
				Result = num1/num2;
				System.out.printf("%.2f",Result);
			}
			else{
				System.out.println("Division Impossible");
			}
			break;
		}
	}
}

	
			