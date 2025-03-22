import java.util.Scanner;
public class Sumofnw{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n>0){
			int formulaSum = (n*(n+1))/2;
			int Sum=0;
			int i=1;
			while(i<=n){
				Sum += i;
				i++;
			}
			System.out.println("Using formula "+formulaSum);
			System.out.println("Using while "+Sum);
			if(formulaSum==Sum){
				System.out.println("Both are equal");
			}
			else{
				System.out.println("Both are not equal");
			}
		}
		else{
			System.out.println("Not a Natural Number");
		}
	}
}
