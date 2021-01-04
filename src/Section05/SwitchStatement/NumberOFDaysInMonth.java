package Section05.SwitchStatement;

public class NumberOFDaysInMonth {

    public static boolean isLeapYear(int year){
        if (year>=1  && year<=9999) {
            return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if ((month<1 || month>12) || (year<1 || year>9999)){
            return -1;
        }
        int numberofDays;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numberofDays = 31;
                break;
            case 2:
                if(isLeapYear(year)){
                    numberofDays = 29;
                }else {
                    numberofDays = 28;
                }
                break;
            default:
                numberofDays = 30;
                break;

        }
        return numberofDays;
    }


    public static void main(String[] args) {
        boolean isLeap = isLeapYear(1600);
        System.out.println(isLeap);

        int getDays = getDaysInMonth(1, 1600);
        System.out.println(getDays);
    }

}
