import java.util.Scanner;
public class LeadndTrail {
    public static int[] trimIndices(String s) {
        int start = 0;
        int end = 0;
        try {
            while (s.charAt(end) != '\0') {
                end++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        end--; // Move one step back after overflow

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int i = 0; // ✅ Moved outside to fix scope issue
        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (Exception e) {
            try {
                s2.charAt(i);
                return false;
            } catch (Exception ex) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] indices = trimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);

        System.out.println("Custom Trimmed: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed: '" + trimmedBuiltIn + "'");
        System.out.println("Both are same: " + isSame);
    }
}
