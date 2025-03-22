import java.util.Scanner;
public class factor{
	public static void main(String arggs[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int maxFactor = 10;
		int index = 0;
		int[] factarr = new int[maxFactor];
		for(int i =1; i<=num; i++){
			if(num%i==0){
				if(index == maxFactor){
					maxFactor *= 2;
					int[] temp = new int[maxFactor];
					
					for(int j=0;j<factarr.length;j++){
						temp[j]=factarr[j];
					}
				factarr=temp;
				}
				factarr[index++]=i;
			}
		}
		System.out.println("THe Factors of the given number are:");
		for(int i=0;i<index;i++){
			System.out.print(factarr[i]+" ");
		}
	}
}

	
	
				
		