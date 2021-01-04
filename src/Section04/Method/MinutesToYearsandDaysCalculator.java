package Section04.Method;

public class MinutesToYearsandDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            int getHour = (int) minutes/60;
            int getDay = getHour/24;
            long getYear = getDay/365;
            long remianingDay = getDay%365;

            System.out.println(minutes + " min = " + getYear + " y and " + remianingDay + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(-525600);

        printYearsAndDays(1051500);
        printYearsAndDays(561600);

    }
}
