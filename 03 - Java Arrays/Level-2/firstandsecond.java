import java.util.Scanner;
import java.util.Arrays;
public class firstandsecond {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);

        int maxDigit = 10;
        int index = 0;
        int[] arr = new int[maxDigit];
        long num = sc.nextLong();

        while (num > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(arr, 0, temp, 0, arr.length);
                arr = temp;
            }
            arr[index++] = (int) (num % 10);
            num /= 10;
        }
        int largest = -1, secondlargest =-1;
        for(int i=0; i< index;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondlargest && arr[i]<largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("The Largest Number is "+largest);
        System.out.println("The Largest Number is "+secondlargest);
    }
}
