import java.util.Scanner;
public class CylinderArea{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double height = sc.nextDouble();
		double radius = sc.nextDouble();
		double Area_Cylinder = Math.PI * Math.pow(radius,2) * height;
		System.out.println("Area of the Cylinder is: "+ Area_Cylinder +" Units");
	}
}
