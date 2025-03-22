import java.util.Scanner;
public class frequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int[] Freq = new int[10];

        while (num > 0) {
            int digit = (int) (num % 10);
            Freq[digit]++;
            num /= 10;
        }
        for(int i=0; i<10; i++){
            if (Freq[i]>0) {
                System.out.println("The Digit " + i + " frequency was " + Freq[i] + " times");
            }
        }
    }
}

