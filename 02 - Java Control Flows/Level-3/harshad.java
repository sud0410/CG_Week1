import java.util.Scanner;
public class harshad{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int i = 0;
		int sum = 0;
		int num=number;
		while(num!=0){
			i = num%10;
			sum += i;
			num = num/10;
		}
		if(number%sum==0){
			System.out.printf("It's an Harshad Number");
		}
		else{
			System.out.printf("It's not an Harshad Number");
		}
	}
}
			
			
			
		