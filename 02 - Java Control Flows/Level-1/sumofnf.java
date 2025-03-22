import java.util.Scanner;
public class sumofnf{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n>0){
			int formulasum = (n*(n+1))/2;
			int Sum = 0;
			int i=1;
			for (;i<=n;i++){
				Sum += i;
			}
			System.out.println("Output using Formula "+formulasum);
			System.out.println("Output using forloop "+Sum);
			if(formulasum==Sum){
				System.out.println("Both Outputs are matching");
			}
			else{
				System.out.println("Both Outputs aren't matching");
			}
		}
		else{
			System.out.println("It's not a Natural Number");
		}
	}
}
