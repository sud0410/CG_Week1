import java.util.Scanner;
public class RPS{
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock") && computer.equals("scissors")) return "User";
        if (user.equals("scissors") && computer.equals("paper")) return "User";
        if (user.equals("paper") && computer.equals("rock")) return "User";
        return "Computer";
    }
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[1][0] = "Computer";
        stats[0][1] = String.valueOf(userWins);
        stats[1][1] = String.valueOf(computerWins);
        double userPercent = ((double) userWins / totalGames) * 100;
        double computerPercent = ((double) computerWins / totalGames) * 100;
        stats[0][2] = String.format("%.2f", userPercent) + "%";
        stats[1][2] = String.format("%.2f", computerPercent) + "%";
        return stats;
    }
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }
        System.out.println("\nPlayer\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] results = new String[n][3];
        int userWins = 0, computerWins = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(user, computer);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = winner;
        }
        String[][] stats = calculateStats(userWins, computerWins, n);
        displayResults(results, stats);
    }
}
