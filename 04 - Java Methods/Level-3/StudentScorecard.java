import java.util.Scanner;
import java.util.Random;
public class StudentScorecard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculateResults(scores);
        displayScorecard(scores, result);
    }

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + rand.nextInt(90);
            scores[i][1] = 10 + rand.nextInt(90);
            scores[i][2] = 10 + rand.nextInt(90);
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return result;
    }

    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("Roll No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t\t"
                    + scores[i][0] + "\t\t\t"
                    + scores[i][1] + "\t\t"
                    + scores[i][2] + "\t\t"
                    + result[i][0] + "\t"
                    + result[i][1] + "\t"
                    + result[i][2]);
        }
    }

}
