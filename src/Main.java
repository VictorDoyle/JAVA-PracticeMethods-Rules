public class Main {

    /* overloading methods only work when you have unique sequence/num of parameters */
    public static void main(String[] args) {
        int newScore = calculateScore("Victor", 500);
        System.out.println("New Score is" + newScore);
        calculateScore(75);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + "scored" + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored" + score + "points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

}
