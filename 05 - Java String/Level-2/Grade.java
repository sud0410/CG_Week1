import java.util.Scanner;
public class Grade {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 51) + 50; // Generating random marks between 50
            }
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 80) grades[i] = "A (Level 4, above agency-normalized standards)";
            else if (perc >= 70) grades[i] = "B (Level 3, at agency-normalized standards)";
            else if (perc >= 60) grades[i] = "C (Level 2, below, but approaching agency-normalized standards)";
else if (perc >= 50) grades[i] = "D (Level 1, well below agency-normalized standards)";
            else if (perc >= 40) grades[i] = "E (Level 1-, too below agency-normalized standards)";
            else grades[i] = "R (Remedial standards)";
        }
        return grades;
    }
    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t"
                    +
                    (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\t\t" + grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        displayScoreCard(scores, results, grades);
    }
}
