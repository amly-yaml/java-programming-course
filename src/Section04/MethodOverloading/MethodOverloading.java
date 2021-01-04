package Section04.MethodOverloading;

public class MethodOverloading {
    public static int calculateScore(String name, int score){
        System.out.println("Player "  + name + " scored " + score + " point." );
        return score*5000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unamed Player scored " + score + " point." );
        return score*5000;

    }
    public static int calculateScore() {
        System.out.println("Unamed Player with no scored.");
        return 0;

    }

    public static void main(String[] args) {
        int score1 = calculateScore();
        System.out.println(score1);
        int score = calculateScore(800);
        System.out.println("New Score: " + score);
        int score2 = calculateScore("John", 345);
        System.out.println("New Score: " + score2);

    }

}
