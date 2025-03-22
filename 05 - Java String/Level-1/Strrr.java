import java.util.Scanner;
public class Strrr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The String that was entered is: "+str);
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println("The Reveresed String isL:"+rev);
        if(str.equals(rev)){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("It's not a Palindrome");
        }
    }
}