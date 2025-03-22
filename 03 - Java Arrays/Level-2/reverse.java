import java.util.Scanner;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long temp = num;
        int count = 0;
        while(temp>0){
            count++;
            temp /= 10;
        }
        int[] revarr = new int[count];
        for(int i=0; i<count; i++){
            revarr[i] = (int) (num%10);
            num /= 10;
        }
        System.out.println("The Array in reverse order is ");
        for (int i=0; i<count;i++){
            System.out.print(revarr[i]+" ");
        }
    }
}

