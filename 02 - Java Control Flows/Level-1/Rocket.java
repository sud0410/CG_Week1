import java.util.Scanner;
public class Rocket{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int counter = sc.nextInt();
		while (counter!=0){
			System.out.println(counter);
			counter -= 1;
		}
	}
}
