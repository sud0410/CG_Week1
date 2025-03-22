import java.util.Scanner;
public class powerw{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int pow = sc.nextInt();
		int temp=1;
		int result = 1;
		if(num>0 && pow>0){
			while(temp<=pow){
				result *= num;
				temp++;
			}
		System.out.println(num+" raised to the power "+pow+" equals "+result);
		}
		else{
			System.out.println("Operation Not Valid");
		}
	}
}		


		