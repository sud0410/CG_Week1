import java.util.Scanner;
public class CircleArea{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		double AreaofCircle = Math.PI * Math.pow(radius,2);
		System.out.println("Area of Circle is: "+AreaofCircle+ " Units");
	}
}