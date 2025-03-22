import java.util.Scanner;
public class Spring{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int Month = sc.nextInt();
		int Days = sc.nextInt();
		
		if((Month==3&&Days>=20)||(Month==4)||(Month==5)||(Month==6&&Days<=20)){
			System.out.println("It's a spring Season");
		}
		else{
			System.out.println("It's not a spring Season");
		}
	}
}

			