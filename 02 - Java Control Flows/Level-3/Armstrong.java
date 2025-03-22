import java.util.Scanner;
public class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int sum = 0;
		int i = 0;
		int num = number;
		while(num!=0){
			i = num%10;
			int digit = i*i*i;	
			sum += digit;
			num = num/10;
		}
		if (number==sum){
			System.out.println("It's an Armstrong Number");
		}
		else{
			System.out.println("It's not an Armstrong Number");
		}
	}
}

