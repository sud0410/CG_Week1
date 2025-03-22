import java.util.Scanner;
public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int count = Countdigitsinnumber(num);
        int[] arr1 = new int[count];
        System.out.println("1st array elements: ");
        for (int i = 0; i < count; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[count];
        System.out.println("\n2nd array elements: ");
        for (int i = 0; i < count; i++) {
            arr2[i] = sc.nextInt();

        }
        System.out.println("\nCount of the digits in numbers: " + count);
        System.out.println("Number stored in array");
        int[] arr = Storingdigitinarray(num);
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }


        int[] rev = Reversingarray(arr);
        System.out.println("\nReversed array");
        for (int i = 0; i < count; i++) {
            System.out.print(rev[i] + " ");
        }
        boolean check = Comparisonof2arrays(arr1, arr2);
        if (check) {
            System.out.println("\nBoth arrays are equal");
        } else {
            System.out.println("\nBoth arrays are not equal");
        }
        boolean palindrome = isPalindrome(arr, rev);
        if (palindrome) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
        boolean duck = CheckingDuckNumber(num);
        if (duck) {
            System.out.println("It is a Duck number");
        } else {
            System.out.println("It is not a Duck number");
        }

    }

    public static int Countdigitsinnumber(int num) {
        int count = 0;
        int original = num;
        while (original != 0) {
            int digit = original % 10;
            count++;
            original /= 10;
        }
        return count;
    }

    public static int[] Storingdigitinarray(int num) {
        int count = Countdigitsinnumber(num);
        int[] arr = new int[count];
        int i = count - 1;
        int original = num;
        while (original != 0) {
            arr[i] = original % 10;
            i--;
            original /= 10;
        }
        return arr;
    }

    public static int[] Reversingarray(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        return rev;
    }

    public static boolean Comparisonof2arrays(int[] arr1, int[] arr2) {
        boolean comp = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                comp= false;
                break;
            }
        }
        return comp;
    }
    public static boolean isPalindrome(int[] arr,int[] rev){
        boolean palindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rev[i]) {
                palindrome = false;
                break;
            }
        }
        return palindrome;

    }
    public static boolean CheckingDuckNumber ( int num){
        int count = Countdigitsinnumber(num);

        int original = num;
        while (original > 0) {
            int digit = original % 10;
            original /= 10;
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
}
