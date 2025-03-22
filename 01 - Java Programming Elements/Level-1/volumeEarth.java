public class volumeEarth{
	public static void main(String args[]){
		double Radius_Km = 6378;
		double Miles_Km = Radius_Km*0.6;
		double Volume_Km = 4/3*(Math.PI)*(Math.pow(Radius_Km,3));
		double Volume_Ml = 4/3*(Math.PI)*(Math.pow(Miles_Km,3));
		System.out.println("The volume of earth in cubic kilometers is "+Volume_Km+" and cubic miles is "+Volume_Ml);
	}
}
