import java.util.Scanner;
public class power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		if(num>0 && power>0){
			for(int i = 1; i<=power; i++){
				result *= num;
			}
			System.out.println(num+" raised to the power "+power+" equals "+result);
		}
	}
}

			