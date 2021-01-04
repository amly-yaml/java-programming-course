package Section04.MethodOverloading;

public class SecondsMinutesChallenge {
    public static final String INVALID_MESSAGE = "Invalid Value";

    public static String getDurationString(int mins, int sec){
        if ((mins < 0) || (sec < 0) || (sec > 59)){
            return INVALID_MESSAGE;
        }
        int hour = mins/60;
        int remainingMinutes = mins%60;

        String hourString = hour + "h";
        if (hour < 10){
            hourString = "0" + hourString;
        }
        String minString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minString = "0" + minString;
        }
        String secString = sec + "s";
        if (sec<10){
            secString = "0" + secString;
        }

        return hourString + " " + minString + " " + secString ;
    }

    public static String getDurationString(int sec){
         if (sec<0){
             return INVALID_MESSAGE;
         }
         int minutes = sec/60;
         int remainigminutes = sec%60;
         // call back the first method
         return getDurationString(minutes, remainigminutes);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));

        System.out.println(getDurationString(3945));
    }
}
