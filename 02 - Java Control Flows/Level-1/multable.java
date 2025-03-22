import java.util.Scanner;
public class multable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int Mul = sc.nextInt();
		int i = 6;
		for (;i<=9;i++){
			int Prod = Mul*i;
			System.out.println(Mul+" * "+i+" = "+Prod);
		}
	}
}


		