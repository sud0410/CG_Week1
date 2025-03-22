import java.util.Scanner;
public class Multiple{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i =1;
		System.out.println("The Multiples of "+num+" are given below:");
		if(num>0 && num<100){
			for(;i<=num;i++){
				if(num%i==0){
					System.out.println(i);
				}
			}
		}
	}
}


