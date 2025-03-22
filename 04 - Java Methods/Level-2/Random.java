import java.util.Arrays;

public class Random {
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers = new int[size];
        for(int i = 0;i<size;i++){
            numbers[i]=1000+(int)(Math.random()*9000);
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0];
        int max=numbers[0];
        int sum = 0;
        for(int num :numbers){
            sum+=num;
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        double average = (double) sum/ numbers.length;
        return new double[]{average,min,max};
    }
    public static void main(String[] args){
        int size =5;
        int[] randomnumbers = generate4DigitRandomArray(size);
        System.out.println("Generated Numbers: "+ Arrays.toString(randomnumbers));
        double[] stats = findAverageMinMax(randomnumbers);
        System.out.println("Average: "+stats[0]);
        System.out.println("Minimum: "+stats[1]);
        System.out.println("Maximum: "+stats[2]);
    }
}
