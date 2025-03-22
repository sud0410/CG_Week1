import java.util.Scanner;
public class mult{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[4];	
		for(int i=6; i<=9; i++){
			arr[i-6] = num*i;
		}
		for(int i=6;i<=9;i++){
			System.out.println(num+"*"+i+"="+arr[i-6]);
		}
	}
}

			