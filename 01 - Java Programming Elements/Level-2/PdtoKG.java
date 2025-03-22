import java.util.Scanner;
public class PdtoKG{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double pound = sc.nextDouble();
		double Kg = pound*0.45;
		System.out.println("The weight of the person in pound is "+pound+" and in Kg is "+Kg);
	}
}

