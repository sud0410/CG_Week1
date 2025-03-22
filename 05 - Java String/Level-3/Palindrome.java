import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
    public static boolean isPalindromeWithArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = new char[original.length];
        int j = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            reversed[j++] = original[i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultArray = isPalindromeWithArray(text);
        System.out.println("Palindrome check using iterative method: " + resultIterative);
        System.out.println("Palindrome check using recursive method: " + resultRecursive);
        System.out.println("Palindrome check using character array: " + resultArray);
    }
}