import java.util.Scanner;
class SmaLar {
    public static int[] findSmallestandLargest(int number1, int number2, int number3) {
        int[] arr = {number1, number2, number3};
        int smallest = -1, greatest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            } else {
                smallest = arr[i];
            }
        }
        int[] res = {smallest,greatest};
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int[] result = findSmallestandLargest(num1,num2,num3);
        System.out.println("The Smallest and Greatest numbers are: ");
        for(int i =0; i< result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}





