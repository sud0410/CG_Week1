import java.util.Scanner;
public class AgeHeight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int AmarAge = sc.nextInt(); 
		int AkbarAge = sc.nextInt();
		int AnthonyAge = sc.nextInt();
		double AmarHeight = sc.nextDouble();
		double AkbarHeight = sc.nextDouble(); 
		double AnthonyHeight = sc.nextDouble();
		
		if((AmarAge<AkbarAge)&&(AmarAge<AnthonyAge)){
			System.out.println("Youngest friend is Amar and his age is "+AmarAge);
		}
		else if((AnthonyAge<AkbarAge)&&(AnthonyAge<AmarAge)){
			System.out.println("Youngest friend is Anthony and his age is "+AnthonyAge);
		}
		else{
			System.out.println("Youngest friend is Akbar and his age is "+AkbarAge);
		}
		if((AmarHeight>AkbarHeight)&&(AmarHeight>AnthonyHeight)){
			System.out.println("Tallest friend is Amar and his height is  "+AmarHeight);
		}
		if((AkbarHeight>AmarHeight)&&(AkbarHeight>AnthonyHeight)){
			System.out.println("Tallest friend is Akbar and his height is  "+AkbarHeight);
		}
		else{
			System.out.println("Tallest friend is Anthony and his height is  "+AnthonyHeight);
		}
	}
}
