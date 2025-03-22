import java.util.Scanner;
public class NumberChecker2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = Countdigitsinnumber(num);
        int[] arr = new int[count];
        arr = Storingnumberinarray(num);
        System.out.println("Digits in array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        int sum=Sumofdigitsinnumber(arr);
        System.out.println("\nSum of the digits of the number is: "+sum);
        int sum_square = Squareofdigitsofnumber(arr);
        System.out.println("Sum of squares of the digits od the number is: "+sum_square);
        int sum_harshad = isHarshadNumber(arr);
        if(num%sum_harshad==0){
            System.out.println("Number "+num+" is a Harshad Number.");
        }
        else{
            System.out.println("Number "+num+" is not a Harshad Number.");

        }
        int[][] digitfrequency = finddigitfrequency(num);
        System.out.println("Digit | Frequency");
        for(int i = 0 ; i<10;i++){
            if(digitfrequency[i][1]>0){
                System.out.println("  "+digitfrequency[i][0]+"   |   "+digitfrequency[i][1]);
            }
        }

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
    public static int Sumofdigitsinnumber(int[] arr) {
        int sum=0;
        for(int i = 0 ; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int Squareofdigitsofnumber(int[] arr) {
        int sum=0;
        for(int i = 0 ; i<arr.length;i++){
            sum+=Math.pow(arr[i],2);
        }
        return sum;

    }
    public static int isHarshadNumber(int[] arr){
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int[][] finddigitfrequency(int num){
        int[] frequency = new int[10];
        int original=num;
        while(original>0){
            int digit = original%10;
            frequency[digit]++;
            original/=10;
        }
        int[][] result = new int[10][2];
        for(int i = 0 ; i<10;i++){
            result[i][0]=i;
            result[i][1]=frequency[i];
        }
        return result;
    }
}
