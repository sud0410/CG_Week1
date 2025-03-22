import java.util.Scanner;
public class Desc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int maxdigit = 5;
        int temp = 0;
        int[] arr = new int[maxdigit];
        for(int i=0; i<maxdigit; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<maxdigit;i++){
            for(int j=0; j<maxdigit; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i<maxdigit;i++){
            System.out.print(arr[i]+" ");
        }
    }
}