import java.util.Scanner;
public class ShortTallandMeanofheights {
    public static void main(String[] args) {
        int[] arr = new int[11];
        for (int i = 0; i < 11; i++) {
            arr[i] = (int) (Math.random() * 100 + 150);
            System.out.print(arr[i]+" ");
        }
        int sum = sumofelements(arr);
        int mean = meanofsumofelements(arr);
        int shortestheight = shortestplayer(arr);
        int tallestheight = tallestplayer(arr);
        System.out.println("\nSum of heights of all players: "+sum);
        System.out.println("Mean of the heights of all players: "+mean);
        System.out.println("Shortest player among the football team members has height: "+shortestheight);
        System.out.println("Tallest player among the football team members has height: "+tallestheight);


    }
    public static int sumofelements(int[] arr){
        int sum=0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int meanofsumofelements(int[] arr){
        int mean = 0;
        mean = sumofelements(arr)/arr.length;
        return mean;
    }
    public static int shortestplayer(int[] arr){
        int short_height= arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]<short_height){
                short_height=arr[i];
            }
        }
        return short_height;
    }
    public static int tallestplayer(int[] arr){
        int tall_height=arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>tall_height){
                tall_height=arr[i];
            }
        }
        return tall_height;
    }
}
