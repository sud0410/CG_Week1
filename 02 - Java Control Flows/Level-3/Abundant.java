import java.util.Scanner;
public class Abundant{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i=1;
		int sum=0;
		for(;i<num;i++){
			if(num%i==0){
				sum +=i;
			}
		}
		if(sum>num){
			System.out.println("It's an Abundant Number");
		}
		else{
			System.out.println("It's not an Abundant Number");
		}	
	}
}
				
			
		