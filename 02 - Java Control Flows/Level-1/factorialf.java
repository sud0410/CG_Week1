import java.util.Scanner;
public class factorialf{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n>=0){
			int i = 1;
			long Fact = 1;
			for(;i<=n;i++){
				Fact *= i;
			}
			System.out.println("The Factorial is "+Fact);
		}
		else{
			System.out.println("Not a Natural Number");
		}
	}
}

				
				
		