import java.util.Scanner;
public class SumofNumbersComparison {
    public static int SumRecursion(int n){
        if(n==1){
            return 1;
        }
        return n+SumRecursion(n-1);
    }
    public static int SumFormula(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num<=0){
            System.out.println("Enter valid natural number!");
        }
        else {

            int sumwithrecursion = SumRecursion(num);
            int sumwithformula = SumFormula(num);
            System.out.println("Sum using recursion: "+sumwithrecursion);
            System.out.println("Sum using formula: "+sumwithformula);
            if(sumwithformula==sumwithrecursion){
                System.out.println("Both the results are correct and equal.");
            }
            else{
                System.out.println("Results are incorrect.");
            }
        }
    }
}
