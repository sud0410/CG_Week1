import java.util.Scanner;
public class smallest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);;
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int smallest;
		
		if(num1<num2 && num1<num3){
			smallest = num1;
		}
		else if (num2<num1 && num2<num3){
			smallest = num2;
		}
		else{
			smallest = num3;
		}
		System.out.println("The Smallest Number is: "+smallest);
	}
}
