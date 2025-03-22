import java.util.Scanner;
public class factorialw{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n>=0){
			long Fact=1;
			while(n>0){
				Fact *= n;
				n--;
			}
			System.out.println(Fact);
		}
		else{
			System.out.println("Not a Natural number");
		}
	}
}

			