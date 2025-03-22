import java.util.Scanner;
public class Voterage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] ages = new int[10];
		
		for (int i=0; i<ages.length; i++){
			ages[i] = sc.nextInt();
		}
		for(int i =0; i<ages.length; i++){
			if (ages[i]<0){
				System.err.println(ages[i]+" is an Invalid age");
			}
			else{
				System.out.println(ages[i] + (ages[i]>18? " is an valid age to vote." : " is not a valid age to vote"));
			}
		}
	}
}


		
