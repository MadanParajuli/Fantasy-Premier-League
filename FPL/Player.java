public class Player {
    private String name;
    private int previousBalance;
    private int gameweekBalance;
    private int winningBalance;
    private int totalBalance;

    public Player(String name, int previousBalance, int gameweekBalance) {
        this.name = name;
        this.previousBalance = previousBalance;
        this.gameweekBalance = gameweekBalance;
        this.winningBalance = 0;  // Initialize with 0
        this.totalBalance = previousBalance + gameweekBalance + winningBalance;
    }

    public String getName() {
        return name;
    }

    public int getPreviousBalance() {
        return previousBalance;
    }

    public int getGameweekBalance() {
        return gameweekBalance;
    }

    public int getWinningBalance() {
        return winningBalance;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setWinningBalance(int winningBalance) {
        this.winningBalance = winningBalance;
        this.totalBalance = previousBalance + gameweekBalance + winningBalance;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", previousBalance=" + previousBalance +
                ", gameweekBalance=" + gameweekBalance +
                ", winningBalance=" + winningBalance +
                ", totalBalance=" + totalBalance +
                '}';
    }
}
