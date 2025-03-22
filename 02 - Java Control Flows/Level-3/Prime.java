import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		boolean isPrime = true;
		int num = sc.nextInt();
		int i=2;
		if(num<1){
			isPrime = false;
		}
		else{
			for(;i<num;i++){
				if(num%i==0){
					isPrime = false;
				}
			}
		}
		if(isPrime == true){
			System.out.println("It's a prime Number");
		}
		else{
			System.out.println("It's not a prime Number");
		}
	}
}

