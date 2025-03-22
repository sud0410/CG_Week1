import java.util.Scanner;
public class strlen{
    public static int findLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count); // Will throw exception when count exceeds string length
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next(); // Takes input without spaces
        int customLength = findLength(userInput);
        int builtInLength = userInput.length(); // Built-in method for comparison
        System.out.println("Length (without using length()): " + customLength);
        System.out.println("Length (using length()): " + builtInLength);
    }
}
