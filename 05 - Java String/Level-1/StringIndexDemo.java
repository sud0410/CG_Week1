import java.util.Scanner;
public class StringIndexDemo {
    public static void generateException(String input) {
        System.out.println("Generating Exception...");
        char ch = input.charAt(input.length());
        System.out.println("Character at invalid index: " + ch);
    }
    public static void handleException(String input) {
        System.out.println("Handling Exception...");
        try {
            char ch = input.charAt(input.length());
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        handleException(userInput);
    }
}
