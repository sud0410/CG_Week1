import java.util.Scanner;
public class oddeve{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if (num<1){
			System.out.println("Enter a Natural Number");
		}
		int[] oddarr = new int[(num/2)+1];
		int[] evearr = new int[(num/2)+1];
		int oddIndex =0;
		int	evenIndex =0;
			for(int i = 1; i<=num; i++){
				if(i%2==0){
					evearr[evenIndex++]=i;
				}
				else{
					oddarr[oddIndex++]=i;
				}
			}
			System.out.println("Array with Odd Numbers");
			for(int i=0; i<oddIndex;i++){
				System.out.print(oddarr[i]+" ");
			}
			System.out.println();
			System.out.println("Array with Even Numbers");
			for(int i=0; i<evenIndex;i++){
				System.out.print(evearr[i]+" ");
			}
	}
}





			
					
					
			
			