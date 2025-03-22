import java.util.Scanner;
public class TriangleArea{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Base = sc.nextFloat();
		double Height = sc.nextFloat();
		double BaseI = Base*0.39;
		double HeightI = Base*0.39;
		double Area = 0.5*Base*Height;
		double AreaI = 0.5*BaseI*HeightI;
		System.out.println("Area of triangle in Square Cm is "+Area+" and in Square inches is "+AreaI);
	}
}
