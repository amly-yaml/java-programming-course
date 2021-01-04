package Section04.Method;

public class ExerciseMethods {
    public static void main (String [] args){
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("John", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Mark", highScorePosition);

    }


    public static void displayHighScorePosition(String playerName, int highScore){
        System.out.println(playerName + " manage to get the position " + highScore + " on the high score table.");
    }

    public static int calculateHighScorePosition(int player_score){
//        if (player_score >= 1000){
//            return 1;
//        }
//        else if (player_score >= 500){
//            return 2;
//        }
//        else if (player_score >= 100){
//            return 3;
//        }
//        else{
//            return 4;
//        }
        int position = 4;
        if (player_score >= 1000){
            return position;
        }
        else if (player_score >= 500){
            return position;
        }
        else if (player_score >= 100){
            return position;
        }

        return position;

    }
}
