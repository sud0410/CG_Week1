import java.util.Scanner;
public class StrtoArr{
    public static char[] strarr(String s1){
        char res[] = new char[s1.length()];
        for (int i=0; i<s1.length(); i++){
            res[i] += s1.charAt(i);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String  str = sc.nextLine();
        char result[] = strarr(str);
        char result2[] = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if (result[i] != result2[i]){
                System.out.println("Both methods doesn't return the same array");
            }
        }
        System.out.println("Both methods return the same array");
        System.out.println("The defined function array gives");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println();
        System.out.println("The built-in function array gives");
        for(int i=0; i<result2.length; i++){
            System.out.print(result2[i]);
        }
    }
}