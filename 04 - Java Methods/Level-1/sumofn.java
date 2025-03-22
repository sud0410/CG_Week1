import java.util.Scanner;
class sumofn{
    int sumn(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
        //System.out.println("Sum of "+a+" Natural numbers is "+sum);
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Natural number");
        int num1 = sc.nextInt();
        sumofn obj = new sumofn();
        int result = obj.sumn(num1);
        System.out.println("The sum of "+num1+" Natural Numbers is "+result);
    }
}

