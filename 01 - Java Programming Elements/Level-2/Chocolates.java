import java.util.Scanner;
public class Chocolates{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int Chocolates = sc.nextInt();
		int Children = sc.nextInt();
		int NoofChocolates = Chocolates/Children;
		int RemChocolates = Chocolates%Children;
		System.out.println("The Number of Chocolates each child gets is "+NoofChocolates+" and the number of remaining chocolates are "+RemChocolates);
	}
}
