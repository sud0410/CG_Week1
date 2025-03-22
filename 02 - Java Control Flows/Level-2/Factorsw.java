import java.util.Scanner;
public class Factorsw{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println("The Factors of "+num+" are listed below:");
		int i = 1;
		while(i<=num){
			if(num%i==0){
				System.out.println(i);
			}
			i++;
		}
	}
}
