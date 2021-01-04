package Section05.UserInput;

public class ParseringValue {
    public static void main(String[] args) {
        // it can change to primitive type, integer, double, float
        String numberAsString = "1234";
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number in String = " + numberAsString);
        System.out.println("Number = " + number);

        number += 1;
        numberAsString += 1;
        System.out.println("Number in String = " + numberAsString);
        System.out.println("Number = " + number);

    }
}
