import java.util.Scanner;
public class Arrayops{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		for(int i =0; i<arr.length;i++){
			if(arr[i]==0){
				System.out.println(arr[i]+" is Zero");
			}
			else if(arr[i]>0){
				if(arr[i]%2==0){
					System.out.println(arr[i]+" is Positive and a Even Number");
				}
				else{
					System.out.println(arr[i]+" is Positive and a Odd Number");
				}
			}
			else{
				System.out.println(arr[i]+" is Negative number");
			}
		}
		if (arr[0]>arr[4]){
			System.out.println("First Element "+arr[0]+" is greater than the Last Element "+arr[4]);
		}
		else if (arr[4]>arr[0]){
			System.out.println("First Element "+arr[0]+" is lesser than the Last Element "+arr[4]);
		}
		else{
			System.out.println("Both Elements "+arr[0]+" and "+arr[4]+" are equal ");
		}
	}
}
				
				
				