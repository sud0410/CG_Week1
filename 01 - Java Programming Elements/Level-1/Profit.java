public class Profit{
	public static void main(String args[]){
		double CostPrice = 129;
		double SellingPrice = 191;
		double Profit = SellingPrice - CostPrice;
		double Profit_Percentage = (Profit/CostPrice)*100;
		System.out.println("The Cost Price in INR "+CostPrice+" and Selling Price is INR "+SellingPrice);
		System.out.println("The profit is INR "+Profit+" and the Profit Percentage is "+Profit_Percentage);
	}
}
