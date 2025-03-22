import java.util.Scanner;
public class substring{
    public static String sub(String str, int start, int end){
        String res = "";
        for (int i=start; i<end; i++){
            res += str.charAt(i);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String str = sc.nextLine();
        System.out.println("Enter the Start & Ending Indexes of the Array");
        int starting = sc.nextInt();
        int ending = sc.nextInt();
        String substr = sub(str, starting, ending);
        String substr2 = str.substring(starting,ending);
        boolean eq = substr.equals(substr2);
        if (eq){
            System.out.println("Both returned the same value "+substr+"&"+substr2);
        }
        else{
            System.out.println("Both didn't return the same value "+substr+"&"+substr2);
        }
    }
}
