import java.util.Scanner;
class StudChoc{
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int Quotient = number/divisor;
        int Remainder = number%divisor;
        int[] result = {Quotient,Remainder};
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Chocolates");
        int Chocolates = sc.nextInt();
        System.out.println("Enter the Number of Students");
        int Students = sc.nextInt();
        int[] res = findRemainderAndQuotient(Chocolates,Students);
        System.out.println("Number of Chocolates each student would get is: "+res[0]);
        System.out.println("Remaining Chocolates: "+res[1]);
    }
}

