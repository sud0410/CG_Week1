import java.util.Scanner;
public class ArrayIndexDemo {
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        String name = names[names.length]; // Invalid index
        System.out.println("Accessed name: " + name);
    }
    public static void handleException(String[] names) {
        System.out.println("Handling Exception...");
        try {
            String name = names[names.length]; // Again, invalid index
            System.out.println("Accessed name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }
        handleException(names);
    }
}
