import java.util.Scanner;
public class Nested {
    public static String[] findFrequency(String str) {
        char[] characters = str.toCharArray();
        int[] frequency = new int[str.length()];
        String[] result = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (characters[i] != '0') {
                frequency[i] = 1;
                for (int j = i + 1; j < str.length(); j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0';
                    }
                }
            }
        }
        int resultIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (characters[i] != '0') {
                result[resultIndex] = characters[i] + ": " + frequency[i];
                resultIndex++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] frequencyArray = findFrequency(input);
        for (String s : frequencyArray) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}