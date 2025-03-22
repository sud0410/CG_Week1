import java.util.Scanner;
public class factors {
    public static int[] fact(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factorials = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorials[index++] = i;
            }
        }
        return factorials;
    }

    public static int sumoffactors(int[] factorials) {
        int sum = 0;
        for (int i = 0; i < factorials.length; i++) {
            sum += factorials[i];
        }
        return sum;
    }

    public static int productoffactors(int[] factorials) {
        int prod = 1;
        for (int i = 0; i < factorials.length; i++) {
            prod *= factorials[i];
        }
        return prod;
    }

    public static int squareoffactors(int[] factorials) {
        int square = 0;
        for (int i = 0; i < factorials.length; i++) {
            square += factorials[i] * factorials[i];
        }
        return square;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f[] = fact(a);
        System.out.println("The Sum of Factors are: " + sumoffactors(f));
        System.out.println("The Product of Factors are: " + productoffactors(f));
        System.out.println("The Square of Factors are: " + squareoffactors(f));
    }
}