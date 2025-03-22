import java.util.Scanner;
public class RemQuo{
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        int[] result = {quotient, remainder};
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number and Divisor");
        int num = sc.nextInt();
        int div = sc.nextInt();
        int Res[] = findRemainderAndQuotient(num,div);
        System.out.println("The Quotient & Remainder is: ");
        for (int i=0; i<Res.length; i++){
            System.out.print(Res[i]+" ");
        }
    }
}

