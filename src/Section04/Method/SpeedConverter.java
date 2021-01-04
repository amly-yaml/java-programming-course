package Section04.Method;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void main(String[] args) {
        long mileperhour = toMilesPerHour(10.25);
        System.out.println("Miles = " + mileperhour);

        printConversion(10.25);
    }
}
