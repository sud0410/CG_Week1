import java.util.Scanner;
public class SumsquareproductofFactors {
    public static int[] Factorscount(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        int[] factors= new int[count];
        int index=0;
        for(int i =1;i<=num;i++){
            if(num%i==0){
                factors[index++]=i;
            }
        }
        return factors;
    }
    public static int SumofFactors(int[] factors){
        int sum=0;
        for(int factor : factors){
            sum+=factor;
        }
        return sum;
    }
    public static long ProductofFactors(int[] factors){
        long product=1;
        for(int factor:factors){
            product*=factor;
        }
        return product;
    }
    public static int SumofSquareofFactors(int[] factors){
        int Sumsquare=0;
        for(int factor : factors){
            Sumsquare+=Math.pow(factor,2);
        }
        return Sumsquare;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int[] factors = Factorscount(num);
        System.out.println("Factors of number "+num+" are: ");
        for(int factor : factors){
            System.out.print(factor+" ");
        }
        System.out.println("\nSum of factors "+SumofFactors(factors));
        System.out.println("Product of factors "+ProductofFactors(factors));
        System.out.println("Sum of Squares of factors "+SumofSquareofFactors(factors));
    }
}
