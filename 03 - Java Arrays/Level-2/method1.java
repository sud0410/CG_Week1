import java.util.Scanner;

public class method1{
	public static int[] findSandL(int n1, int n2, int n3){
		int small = Math.min(n1 , Math.min(n2,n3));
		int large = Math.max(n1 , Math.max(n2,n3));
		return new int[]{small,large};
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		n1= sc.nextInt();
		n2= sc.nextInt();
		n3= sc.nextInt();
	int[] res = findSandL(n1,n2,n3);
	System.out.println("Smallest= "+ res[0]);
	System.out.println("largesr= " + res[1]);
	sc.close();
	}
}
