import java.util.Scanner;
public class NumberFormatDemo {
    public static void generateException(String input) {
        System.out.println("Generating NumberFormatException...");
        int number = Integer.parseInt(input); // Will throw exception if input is not a valid integer
        System.out.println("Parsed number: " + number);
    }
    public static void handleException(String input) {
        System.out.println("Handling Exception...");
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String userInput = scanner.nextLine();
        handleException(userInput);
    }
}
