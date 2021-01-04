package Section05.SwitchStatement;

public class DayOfWeekchallenge {

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("It is Monday.");
                break;
            case 2:
                System.out.println("It is Tuesday.");
                break;
            case 3:
                System.out.println("It is Wednesday.");
                break;
            case 4:
                System.out.println("It is Thursday.");
                break;
            case 5:
                System.out.println("It is Friday.");
                break;
            case 6:
                System.out.println("It is Saturday.");
                break;
            case 0:
                System.out.println("It is Sunday.");
                break;
            default:
                System.out.println("Invalid Day");

        }
    }

    public static void main(String[] args) {
        printDayOfTheWeek(3);
    }
}

