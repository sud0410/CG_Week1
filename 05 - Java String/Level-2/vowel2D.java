import java.util.Scanner;
public class vowel2D {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static String[][] getCharDetails(String s) {
        int i = 0;
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        String[][] result = new String[count][2];
        try {
            while (i < count) {
                char ch = s.charAt(i);
                result[i][0] = String.valueOf(ch);
                result[i][1] = checkCharType(ch);
                i++;
            }
        } catch (Exception e) {
        }
        return result;
    }
    public static void displayCharTable(String[][] arr) {
        System.out.println("Character\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] result = getCharDetails(input);
        displayCharTable(result);
    }
}