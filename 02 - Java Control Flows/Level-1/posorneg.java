import java.util.Scanner;
public class posorneg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if (num>0){
			System.out.println("The number "+num+" is a positive number");
		}
		else if (num<0){
			System.out.println("The number "+num+" is a negative number");
		}
		else{
			System.out.println("The Number "+num+" is zero");
		}
	}
}

		