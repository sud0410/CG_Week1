import java.util.Scanner;
public class Factors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 1;
		System.out.println("The Factors are listed below:");
		for(;i<=num;i++){
			if(num%i==0){
				System.out.println(i);
			}
		}
	}
}
