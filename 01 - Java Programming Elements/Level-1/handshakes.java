import java.util.Scanner;
public class handshakes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int Total_Students = sc.nextInt();
		int Total_Handshakes = (Total_Students*(Total_Students-1))/2;
	System.out.println("Number of Possible handshakes: "+Total_Handshakes);
	}
}
