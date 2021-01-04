package Section04.Method;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && temperature>=25 && temperature<=45){
            return true;
        }
        return !summer && temperature >= 25 && temperature <= 35;
    }

    public static void main(String[] args) {
        boolean isCatPlaying = isCatPlaying(false, 35);
        System.out.println(isCatPlaying);
    }

}
