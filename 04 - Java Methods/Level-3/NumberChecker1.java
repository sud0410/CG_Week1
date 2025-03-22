import java.util.Scanner;
public class NumberChecker1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = Countdigitsinnumber(num);
        int[] arr = Storingnumberinarray(num);
        System.out.println("Digits in array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        boolean duck = CheckingDuckNumber(num);
        if (duck == true) {
            System.out.println("\nNumber " + num + " is a duck number.");
        } else {
            System.out.println("\nNumber " + num + " is not a duck number.");
        }
        int sum = isArmstrongnumber(num);
        if (sum == num) {
            System.out.println("Number " + num + " is a Armstrong number.");
        } else {
            System.out.println("Number " + num + " is not a Armstrong number.");
        }
        Largestand2ndlargest(arr);
        Smallestand2ndsmallest(arr);
    }

    public static int Countdigitsinnumber(int num) {
        int original = num;
        int count = 0;
        while (original != 0) {
            count++;
            original /= 10;
        }
        return count;
    }

    public static int[] Storingnumberinarray(int num) {
        int count = Countdigitsinnumber(num);
        int[] arr = new int[count];
        int original = num;
        int i = count - 1;
        while (original != 0) {
            int digit = original % 10;
            arr[i] = digit;
            i--;
            original /= 10;
        }
        return arr;
    }

    public static boolean CheckingDuckNumber(int num) {
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

    public static int isArmstrongnumber(int num) {
        int original = num;
        int sum = 0;
        while (original != 0) {
            int digit = original % 10;
            sum += Math.pow(digit, 3);
            original /= 10;
        }
        return sum;
    }

    public static void Largestand2ndlargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num != largest) {
                secondlargest = num;
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("No Second Largest Number.");
        } else {
            System.out.println("Largest number is: " + largest + " and second largest number is: " + secondlargest);
        }
    }
    public static void Smallestand2ndsmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondsmallest = smallest;
                smallest = num;
            } else if (num < secondsmallest && num != smallest) {
                secondsmallest = num;
            }
        }
        if (secondsmallest == Integer.MAX_VALUE) {
            System.out.println("No Second Smallest Number.");
        } else {
            System.out.println("Smallest number is: " + smallest + " and second smallest number is: " + secondsmallest);
        }
    }
}
