package Section04.Method;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
//        number1 =  (int)(number1 * 1000);
//        number2 = (int) (number2*1000);
//        if (number1 == number2){
//            return true;
//        }
//
//        return false;
        return (int)(number1 *1000) == (int)(number2*1000);

    }

    public static void main(String[] args) {
        boolean decimalplaces = areEqualByThreeDecimalPlaces(-3.123,3.123);
        System.out.println(decimalplaces);
    }
}
