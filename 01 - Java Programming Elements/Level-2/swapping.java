import java.util.Scanner;
public class swapping{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");		
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
	
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The Swapped Numbers are "+num1+" and "+num2);
	}
}

		