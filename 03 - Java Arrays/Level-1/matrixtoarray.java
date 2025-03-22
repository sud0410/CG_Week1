import java.util.Scanner;
public class matrixtoarray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No. of Rows");
		int row = sc.nextInt();
		System.out.println("No. of Columns");
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		int[] array = new int[row*col];
		int index = 0;
		
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				array[index++] = matrix[i][j];
			}
		}
		System.out.println("The Array is:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}


			
			
			