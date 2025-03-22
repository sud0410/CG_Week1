public class ManualSplit {

    public static String[] customSplit(String input, char delimiter) {
        // First count how many parts (words) we will have
        int count = 1; // at least one part
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == delimiter) {
                count++;
            }
        }

        // Create a string array to hold parts
        String[] result = new String[count];
        int resIndex = 0;

        // Create a char array manually for each part
        char[] temp = new char[input.length()];
        int tempIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == delimiter) {
                // Convert temp char array to String
                String word = "";
                for (int j = 0; j < tempIndex; j++) {
                    word += temp[j];
                }
                result[resIndex] = word;
                resIndex++;
                tempIndex = 0; // reset for next word
            } else {
                temp[tempIndex] = ch;
                tempIndex++;
            }
        }

        // Add the last word after the last delimiter
        String lastWord = "";
        for (int j = 0; j < tempIndex; j++) {
            lastWord += temp[j];
        }
        result[resIndex] = lastWord;

        return result;
    }

    public static void main(String[] args) {
        String text = "apple,banana,grape";
        char delimiter = ',';

        String[] parts = customSplit(text, delimiter);

        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + (i+1) + ": " + parts[i]);
        }
    }
}