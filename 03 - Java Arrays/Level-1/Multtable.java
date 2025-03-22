import java.util.Scanner;
public class Multtable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++){
			arr[i] = num*(i+1);
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(num+"*"+(i+1)+"="+arr[i]);
		}
	}
}

			