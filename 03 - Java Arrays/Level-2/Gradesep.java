import java.util.Scanner;
public class Gradesep {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        double[] phymark = new double[students];
        double[] chemmark = new double[students];
        double[] mathmark = new double[students];
        double[] avgmark = new double[students];
        String[] Grade = new String[students];
        for (int i = 0; i < students; i++) {
            System.out.println("Enter the student-" + (i + 1) + " your physics mark");
            phymark[i] = sc.nextDouble();
            System.out.println("Enter the student-" + (i + 1) + " your physics mark");
            chemmark[i] = sc.nextDouble();
            System.out.println("Enter the student-" + (i + 1) + " your physics mark");
            mathmark[i] = sc.nextDouble();
            avgmark[i] = (phymark[i] + chemmark[i] + mathmark[i]) / 3;
        }
        for (int i = 0; i < students; i++) {
            if (avgmark[i] >= 80) {
                Grade[i] = "A";
            } else if (avgmark[i] >= 70 && avgmark[i] < 80) {
                Grade[i] = "B";
            } else if (avgmark[i] >= 60 && avgmark[i] < 70) {
                Grade[i] = "C";
            } else if (avgmark[i] >= 50 && avgmark[i] < 60) {
                Grade[i] = "D";
            } else if (avgmark[i] >= 40 && avgmark[i] < 50) {
                Grade[i] = "E";
            } else {
                Grade[i] = "R";
            }
        }
        for (int i = 0; i < students; i++) {
            System.out.println("The Student-" + (i + 1) + " marks in Maths, Chemistry, Physics are " + mathmark[i] + "," + chemmark[i] + "," + phymark[i] + " respectively.");
            System.out.println("The Student's Average Mark is " + String.format("%.2f", avgmark[i]) + " and the Gradde is " + Grade[i]);
        }
    }
}
