import java.util.Scanner;
public class OddorEve{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if(num>0){
			int i=1;
			for (;i<=num;i++){
				if(i%2==0){
					System.out.println(i+" is an Even Number");
				}
				else{
					System.out.println(i+" is an Odd Number");
				}
			}
		}
		else{
			System.out.println("It is not a Natural number");
		}
	}
}

		
					
					
					