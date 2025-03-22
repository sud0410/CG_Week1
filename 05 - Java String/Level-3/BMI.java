import java.util.Scanner;
public class BMI {
    public static double[][] getInputData(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        return data;
    }
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = bmi < 18.5 ? "Underweight" : bmi <= 24.9 ? "Normal" : bmi <= 30.9 ?
                    "Overweight" : "Obese";
            results[i][0] = String.format("%.2f", data[i][1]) + " cm";
            results[i][1] = String.format("%.2f", data[i][0]) + " kg";
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }
    public static void displayResults(String[][] results) {
        System.out.println("Person\tHeight\t\tWeight\t\tBMI\tStatus");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t"
                    + results[i][3]);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        double[][] data = getInputData(n);
        String[][] results = calculateBMI(data);
        displayResults(results);
    }
}