import java.util.Scanner;
public class GreatFactw{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int Greatestfact = 1; 
		int counter = num-1;
		while (counter>=1){
			if(num%counter==0){
				Greatestfact = counter;
				break;
			}
			counter--;
		}
		System.out.println("Greatest Factor of "+num+" is "+Greatestfact);
	}
}
			
				
				