import java.util.Scanner;
public class stringsame {
    public static boolean Same(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String First = sc.nextLine();
        System.out.println("Enter the Second String");
        String Second = sc.nextLine();
        boolean func = Same(First, Second);
        boolean built = First.equals(Second);

        if (func == built) {
            System.out.println("Both Function returns the same Output");
        } else {
            System.out.println("Both Function doesn't return the same Output");
        }
        System.out.println("The output through Built in Function was: " + built);
        System.out.println("The output through defined Function was: " + func);
    }
}
