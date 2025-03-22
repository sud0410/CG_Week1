import java.util.Scanner;
public class NumberChecker5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int[] factors = Countandstoringfactors(num);
        for(int i = 0;i<factors.length;i++){
            System.out.print(factors[i]+" ");
        }
        int greatest = FindGreatestFactor(factors);
        System.out.println("\nGreatest factor of "+num+" is: "+greatest);
        int sum = FindSumofFactors(factors);
        System.out.println("Sum of the factors are: "+sum);
        int product = FindProductofFactors(factors);
        System.out.println("Product of the factors are: "+product);
        int Cubeproduct = FindProductofCubeofFactors(factors);
        System.out.println("Product of cube of factors are: "+Cubeproduct);
        boolean perfect = FindPerfectNumber(num);
        if(perfect){
            System.out.println(num+" is a perfect number.");
        }
        else{
            System.out.println(num+" is not a perfect number.");
        }
        boolean abundant = FindAbundantNumber(num);
        if(abundant){
            System.out.println(num+" is a abundant number.");
        }
        else{
            System.out.println(num+" is not a abundant number.");
        }
        boolean deficient = FindDeficientNumber(num);
        if(deficient){
            System.out.println(num+" is a deficient number.");
        }
        else{
            System.out.println(num+" is not a deficient number.");
        }
        boolean strong = FindStrongNumber(num);
        if(strong){
            System.out.println(num+" is a strong number.");
        }
        else{
            System.out.println(num+" is not a strong number.");
        }

    }
    public static int[] Countandstoringfactors(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        int index=0;
        int[] factors = new int[count];
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factors[index]=i;
                index++;
            }
        }
        return factors;
    }
    public static int FindGreatestFactor(int[] factors){
        int max=factors[0];
        for(int i=1;i<factors.length;i++){
            if(factors[i]>max){
                max=factors[i];
            }
        }
        return max;
    }
    public static int FindSumofFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }
    public static int FindProductofFactors(int[] factors){
        int product=1;
        for(int num : factors){
            product*=num;
        }
        return product;
    }
    public static int FindProductofCubeofFactors(int[] factors){
        int product=1;
        for(int num : factors){
            product*=Math.pow(num,3);
        }
        return product;
    }
    public static boolean FindPerfectNumber(int num){
        if(num<=1){
            return false;
        }
        int sum=0;
        for (int i = 1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
    public static boolean FindAbundantNumber(int num){
        int sum = 0;
        for(int i = 1;i<=num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum>num;
    }
    public static boolean FindDeficientNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }
    public static boolean FindStrongNumber(int num){
        int sum = 0;
        int original = num;
        while(original!=0){
            int fact = 1;
            int digit = original%10;
            for(int i =1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            original/=10;
        }
        return sum==num;
    }
}
