import java.util.Scanner;

public class CollinearityCheck {

    public static boolean areCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slope1 = (y2 - y1) * (x3 - x2);
        double slope2 = (y3 - y2) * (x2 - x1);
        return slope1 == slope2;
    }

    public static boolean areCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coordinates of point A (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter coordinates of point B (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter coordinates of point C (x3 y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope method: " + (collinearSlope ? "Yes" : "No"));

        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area method: " + (collinearArea ? "Yes" : "No"));

        scanner.close();
    }
}
