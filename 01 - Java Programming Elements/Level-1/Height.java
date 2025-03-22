import java.util.Scanner;
public class Height{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Height = sc.nextDouble();
		double Inch = Height/2.54;
		double Feet = Inch/12;
		System.out.println("Your Height in cm is "+Height+" while in Feet is "+Feet+" and Inches is "+Inch);
	}
}
