import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void generateException(String input) {
        System.out.println("Generating IllegalArgumentException...");
        String result = input.substring(5, 2); // start > end
        System.out.println("Substring: " + result);
    }
    public static void handleException(String input) {
        System.out.println("Handling Exception...");
        try {
            String result = input.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        handleException(userInput);
    }
}
