import java.util.Scanner;
public class Height{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[11];
		double sum = 0.0;
		for(int i=0; i<11; i++){
			double height = sc.nextDouble();
			arr[i]=height;
			sum += arr[i];
		}
		System.out.printf("The mean height is %.2f",(sum/11));
	}
}

		
	