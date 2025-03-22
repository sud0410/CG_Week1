import java.util.Scanner;
public class getken2D{
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[] splitManual(String s) {
        int len = getLength(s);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') spaces++;
        }
        int[] spaceIndexes = new int[spaces + 2];
        spaceIndexes[0] = -1;
        int index = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') spaceIndexes[index++] = i;
        }
        spaceIndexes[index] = len;
        String[] words = new String[spaces + 1];
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                sb.append(s.charAt(j));
            }
            words[i] = sb.toString();
        }
        return words;
    }
    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] data = wordWithLengths(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));
        }
    }
}
