public class Discount{
	public static void main(String args[]){
		double Fees = 125000;
		double discount_percent = 10;
		double discount_amount = Fees/discount_percent;
		double Final_Fee = Fees - discount_amount;
		System.out.println("The discount amount is INR "+discount_amount+" and final discounted fee is INR "+Final_Fee);
	}
}
