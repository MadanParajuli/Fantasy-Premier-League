import java.util.Scanner;

public class GameBalanceCalculator {

    public static void main(String[] args) {
        Player Aashish = new Player("Aashish Neupane", 25, -5);
        Player Arjun = new Player("Arjun Parajuli", -5, -5);
        Player Ashu = new Player("Ashu Adhikari", -5, -5);
        Player Bidur = new Player("Bidur Bhurtel", -5, -5);
        Player Dinesh = new Player("Dinesh Ayer", -5, -5);
        Player Madan = new Player("Madan Parajuli", -5, -5);
        Player Sujal = new Player("Sujal Dhungana", -5, -5);

        // Adding these players to an array for easy management
        Player[] players = {Aashish, Arjun, Ashu, Bidur, Dinesh, Madan, Sujal};

        // Simulate input to set the winner and calculate the balances
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the winning player:");
        String winnerName = scanner.nextLine();
        boolean winnerFound = false;

        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(winnerName)) {
                player.setWinningBalance(30); 
                winnerFound = true;
            } else {
                player.setWinningBalance(0);  
            }
        }

        if (!winnerFound) {
            System.out.println("Winner not found. Please check the name and try again.");
        } else {
            for (Player player : players) {
                System.out.println(player);
            }
        }

        scanner.close();
    }
}
