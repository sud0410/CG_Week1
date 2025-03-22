import java.util.Scanner;
public class TwoDarray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int [][]arr = new int[3][3];
		int sum=0;
		
		for(int i =0; i<3; i++){
			for(int j=0; j<3; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j];
			}
		System.out.println();
		}
		System.out.println("The Sum of Matrix/Array is "+sum);
	}
}

