import java.util.Scanner;
public class digits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int count = 0;
		while(number!=0){
			number = number/10;
			count +=1;
		}
		System.out.println("Number of digits is :"+count);
	}
}



