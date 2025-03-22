import java.util.Scanner;
public class leapyearndor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int Year = sc.nextInt();
		if(Year>1582){
			if((Year%4==0)&&(Year%400==0)||(Year%4==0)&&(Year%100!=0)){
				System.out.println(Year+" is a leap year");
			}
			else{
				System.out.println(Year+" is not a leap year");
			}
		}
		else{
			System.out.println("Make sure year>1852");
		}
	}
}
