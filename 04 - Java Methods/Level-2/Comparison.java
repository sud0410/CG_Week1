import java.util.Scanner;
public class Comparison {
    public static boolean ifPositive(int num){
        return num>=0;
    }
    public static boolean ifEven(int num){
        return num%2==0;
    }
    public static int compare(int num1 , int num2){
        if(num1>num2) return 1;
        else if (num1<num2) return -1;
        else return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0;i<5;i++){
            System.out.println("Enter number "+(i+1)+": ");
            numbers[i]=sc.nextInt();
        }
        for(int num:numbers){
            if(ifPositive(num)){
                System.out.println("\nThe number "+num+" is positive and ");
                if(ifEven(num)){
                    System.out.print("Even");
                }
                else{
                    System.out.print("Odd");
                }
            }
            else{
                System.out.println("\nThe number "+num+" is negative");
            }
        }
        int comparison = compare(numbers[0],numbers[4]);
        if(comparison>0){
            System.out.println("\n1st element is greater than the last element.");
        }
        else if (comparison<0) {
            System.out.println("\n1st element is lesser than the last element.");
        }
        else{
            System.out.println("\n1st element is equal to the last element.");
        }
    }
}
