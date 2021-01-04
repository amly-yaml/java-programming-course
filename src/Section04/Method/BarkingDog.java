package Section04.Method;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        return barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23));
    }

    public static void main(String[] args) {
        boolean wakeup = shouldWakeUp(true, 22);
        System.out.println(wakeup);
    }
}
