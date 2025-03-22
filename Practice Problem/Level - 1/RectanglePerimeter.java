import java.util.Scanner;
public class RectanglePerimeter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double Perimeter_of_Rectangle = 2*(length+width);
		System.out.println("Perimeter of rectangle is: "+Perimeter_of_Rectangle+" Units");
	}
}
