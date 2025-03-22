import java.util.Scanner;
public class sumzeroorless{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Total=0.0;
		double num;
		
		while(true){
			num = sc.nextDouble();
			if(num<=0){
				break;
			}
			Total += num;
		}
		System.out.println("The Final sum is "+Total);
	}
}
