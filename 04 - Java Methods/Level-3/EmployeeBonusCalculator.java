import java.util.Random;
public class EmployeeBonusCalculator {

    // Method to generate a random 5-digit salary and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numEmployees][2]; // 2 columns: salary, years of service

        for (int i = 0; i < numEmployees; i++) {
            // Generate a random 5-digit salary (between 10000 and 99999)
            int salary = 10000 + random.nextInt(90000);
            employeeData[i][0] = salary;

            // Generate random years of service (between 1 and 10, inclusive)
            int yearsOfService = random.nextInt(10) + 1;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] bonusAndNewSalary = new double[numEmployees][2]; // 2 columns: new salary, bonus

        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage;

            if (yearsOfService > 5) {
                bonusPercentage = 0.05; // 5% bonus
            } else {
                bonusPercentage = 0.02; // 2% bonus
            }

            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            bonusAndNewSalary[i][0] = newSalary;
            bonusAndNewSalary[i][1] = bonus;
        }
        return bonusAndNewSalary;
    }

    // Method to calculate and display the sum of old salaries, new salaries, and total bonus
    public static void displaySalaryAndBonusSummary(int[][] oldSalaries, double[][] newSalariesAndBonus) {
        int numEmployees = oldSalaries.length;
        double sumOldSalaries = 0;
        double sumNewSalaries = 0;
        double totalBonus = 0;

        System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-15s |\n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus");

        for (int i = 0; i < numEmployees; i++) {
            sumOldSalaries += oldSalaries[i][0];
            sumNewSalaries += newSalariesAndBonus[i][0];
            totalBonus += newSalariesAndBonus[i][1];

            System.out.printf("| %-10d | %-15d | %-15d | %-15.2f | %-15.2f |\n",
                    i + 1, oldSalaries[i][0], oldSalaries[i][1], newSalariesAndBonus[i][0], newSalariesAndBonus[i][1]);
        }
        System.out.printf("| %-10s | %-15.2f | %-15s | %-15.2f | %-15.2f |\n",
                "Total", sumOldSalaries, " ", sumNewSalaries, totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate employee data (salary and years of service)
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate new salary and bonus
        double[][] newSalariesAndBonus = calculateBonusAndNewSalary(employeeData);

        // Display the summary
        displaySalaryAndBonusSummary(employeeData, newSalariesAndBonus);
    }
}

