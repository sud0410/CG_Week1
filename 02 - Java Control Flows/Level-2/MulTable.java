import java.util.Scanner;
public class MulTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i=6;
		for(;i<=9;i++){
			int Mul = num*i;
			System.out.println(num+" * "+i+" = "+Mul);
		}
	}
}
