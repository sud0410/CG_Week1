import java.util.Scanner;
public class NumberChecker4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if(prime){
            System.out.println(num+" is a prime number.");
        }
        else{
            System.out.println(num+" is not a prime number.");
        }
        int neon = isNeon(num);
        if(neon==num){
            System.out.println(num+" is a neon number.");
        }
        else{
            System.out.println(num+" is not a neon number.");
        }
        int[] result = isSpy(num);
        System.out.println("Sum of the digits :"+result[0]);
        System.out.println("Product of the digits :"+result[1]);
        int auto = isAutomorphic(num);
        if(num%10==auto){
            System.out.println(num+" is a automorphic number.");
        }
        else{
            System.out.println(num+" is not a automorphic number.");
        }
        int buzz = isBuzz(num);
        if(num%7==0 || buzz==7){
            System.out.println(num+" is a buzz number.");
        }
        else{
            System.out.println(num+" is not a buzz number.");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int isNeon(int num){
        int sum = 0;
        int original = (int)Math.pow(num,2);
        while(original>0){
            int digit = original%10;
            sum+=digit;
            original/=10;
        }
        return sum;
    }
    public static int[] isSpy(int num){
        int sum=0;
        int product=1;
        int original=num;
        while(original!=0){
            int digit = original%10;
            sum+=digit;
            product*=digit;
            original/=10;
        }
        return new int[]{sum,product};
    }
    public static int isAutomorphic(int num){
        int original = num*num;
        return original%10;
    }
    public static int isBuzz(int num){
        return num%10;
    }
}
