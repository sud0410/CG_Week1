import java.util.Scanner;
public class FizzBuzzw{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		while(true){
			if((num%3==0)&&(num%5==0)){
				System.out.println("FizzBuzz");
				break;
			}
			else if(num%3==0){
				System.out.println("Fizz");
				break;
			}
			else if(num%5==0){
				System.out.println("Buzz");
				break;
			}
			else{
				System.out.println("Not Divisible by 5 or 3");
				break;
			}
		}
	}
}

		