import java.util.Scanner;
public class Largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int maxdigit = 10;
        int[] arr = new int[maxdigit];
        int index = 0;
        int digit = 0;
        while(num>0 && index<maxdigit){
            digit = num%10;
            arr[index] = digit;
            num /=10;
            index++;
        }
        int largest = -1, secondlargest = -1;
        for(int i=0; i<index; i++) {
            if(arr[i]>largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest = arr[i];
            }
        }
        System.out.println("Largest Number "+largest);
        System.out.println("Second Largest Number "+secondlargest);
    }
}

