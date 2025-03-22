import java.util.Scanner;
public class LowUppCases {
    public static String LowertoUpper(String str){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            res.append(ch);
        }
        return res.toString();
    }
    public static String UppertoLowe(String str){
        StringBuilder res = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch>='A'&&ch<='Z'){
                ch = (char)(ch+32);
            }
            res.append(ch);
        }
        return res.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str1 = sc.nextLine();
        String resultUpper = LowertoUpper(str1);
        String resultLower = UppertoLowe(str1);
        System.out.println("The String in UpperCase is "+resultUpper);
        System.out.println("The String in LowerCase is "+resultLower);
    }
}
