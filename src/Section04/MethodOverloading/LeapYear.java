package Section04.MethodOverloading;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year > 0 && year < 9999){
            if (year%4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
        }
        return false;
    }
    public static boolean isleapYear(int year){
        if ((year%4==0 && year%100!=0) || (year%400==0)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        boolean leapyear = isLeapYear(1924);
        System.out.println(leapyear);
        boolean isleap = isleapYear(1924);
        System.out.println(isleap);
    }
}
