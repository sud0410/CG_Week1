import java.util.Scanner;
public class FeettoMile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double Feet = sc.nextDouble();
		double Yard = Feet/3;
		double Mile = Yard/1760;
		System.out.println("Your Distance in Feet is "+Feet+" while in Yard is "+Yard+" and mile is "+Mile);
	}
} 
