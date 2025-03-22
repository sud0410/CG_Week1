import java.util.Scanner;
public class SplitshortndLong{
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
    public static String[][] getWordLengthPairs(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    public static int[] findMinMaxIndexes(String[][] data) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);
            int minLen = Integer.parseInt(data[minIndex][1]);
            int maxLen = Integer.parseInt(data[maxIndex][1]);
            if (length < minLen) minIndex = i;
            if (length > maxLen) maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] wordLengthPairs = getWordLengthPairs(words);
        int[] indexes = findMinMaxIndexes(wordLengthPairs);
        System.out.println("Shortest word: " + wordLengthPairs[indexes[0]][0]);
        System.out.println("Longest word: " + wordLengthPairs[indexes[1]][0]);
    }
}