import java.util.Scanner;
public class Multiplesrev{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int counter = num-1;
		System.out.println("The Multiples of "+num+" are listed below:");
		while(counter>=1){
			if(num%counter==0){
				System.out.println(counter);
			}
		counter--;
		}
	}
}
