import java.util.Scanner;
public class Travel{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String Name = sc.nextLine();
		System.out.println("Enter the Starting City");
		String fromCity = sc.nextLine();
		System.out.println("Enter the via City");
		String viaCity = sc.nextLine();
		System.out.println("Enter the Final City");
		String finalCity = sc.nextLine();
		System.out.println("Enter the Distance Between "+fromCity+" and "+viaCity);
		double fromtovia = sc.nextDouble();
		System.out.println("Enter the Distance Between "+viaCity+" and "+finalCity);
		double viatofinal = sc.nextDouble();
		System.out.println("Time taken Between "+fromCity+" and "+ viaCity);
		double Timefromtovia = sc.nextDouble();
		System.out.println("Time taken Between "+viaCity+" and "+ finalCity);
		double Timeviatofinal = sc.nextDouble();
		double Total_Distance = fromtovia+viatofinal;
		double Total_Time = Timefromtovia+Timeviatofinal;
		System.out.println(Name+" was travelling from "+fromCity+" to "+finalCity+" via "+viaCity);
		System.out.println("Total Distance & Time taken during travel was "+Total_Distance+" KM , "+Total_Time+" Hours");
	}
}

		
		
		