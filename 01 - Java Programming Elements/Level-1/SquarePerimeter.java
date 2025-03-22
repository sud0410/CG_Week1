import java.util.Scanner;
public class SquarePerimeter{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Side = sc.nextDouble();
		double Perimeter = 4*Side;
		System.out.println("the length of the side is "+Side+" whose perimeter is "+Perimeter);
	}
}


	