import java.util.Scanner;
public class storearr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[10];
		double total = 0.0;
		int index = 0;
		while(true){
			double num = sc.nextDouble();
			if (num<=0 || index==10){
				break;
			}
			else{
				arr[index]=num;
				total += num;
				index++;
			}
		}
		System.out.println(total);
	}
}

				