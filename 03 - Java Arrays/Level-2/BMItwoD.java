import java.util.Scanner;
public class BMItwoD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int persons = sc.nextInt();
        double[][] persondata = new double[persons][3];
        String[] Status = new String[persons];
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter the weight of person " + (i + 1));
            persondata[i][0] = sc.nextDouble();
            System.out.println("Enter the height of person " + (i + 1));
            persondata[i][1] = sc.nextDouble();
            persondata[i][2] = persondata[i][0] / (Math.pow(persondata[i][1], 2));
        }
        for (int i = 0; i < persons; i++) {
            if (persondata[i][2] >= 40.0) {
                Status[i] = "Obese";
            } else if (persondata[i][2] >= 25.0 && persondata[i][2] <= 39.9) {
                Status[i] = "Overweight";
            } else if (persondata[i][2] >= 18.5 && persondata[i][2] <= 24.9) {
                Status[i] = "Normal";
            } else {
                Status[i] = "Underweight";
            }
        }
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1) + " weight is " + persondata[i][0] + " height is " + persondata[i][1] + " and BMI is " + String.format("%.2f",persondata[i][2]) + " and the status is " + Status[i]);
        }
    }
}
