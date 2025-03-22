import java.util.Scanner;
public class sumofn{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int Sum = (n*(n+1))/2;
		
		if (n>0){
			System.out.println("The sum of "+n+" Natural Numbers is "+Sum);
		}
		else{
			System.out.println("The Number "+n+" i snot a Natural Number");
		}
	}
}

		