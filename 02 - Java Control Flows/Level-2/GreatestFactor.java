import java.util.Scanner;
public class GreatestFactor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int greatestFact = 1;
		int i = 1;
		for(;i<num;i++){
			if(num%i==0){
				greatestFact = i;
			}
		}
		System.out.println("The Greatest Factor of "+num+" is "+greatestFact);
	}
}

