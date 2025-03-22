import java.util.Scanner;
public class PriceQty{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			double unitPrice = sc.nextDouble();
			int Quantity = sc.nextInt();
			double purchase_price = unitPrice*Quantity;
			System.out.println("The total purchase price is INR "+purchase_price+" if the quantity "+Quantity+" and unit price is INR "+unitPrice);
	}
}
