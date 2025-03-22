import java.util.Scanner;
public class leapyear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int Year = sc.nextInt();
		if(Year>1582){
			if(Year%400==0){
				System.out.println(Year+" is a Leap Year");
			}
			else if(Year%100==0){
				System.out.println(Year+" is not a Leap Year");
			}
			else if(Year%4==0){
				System.out.println(Year+" is a Leap Year");
			}
			else{
				System.out.println(Year+" is not a Leap Year");
			}
		}
		else{
			System.out.println("Make sure Year Input is >1582");
		}
	}
}

		