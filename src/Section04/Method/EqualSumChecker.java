package Section04.Method;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return ((num1+num2) == num3);

    }

    public static void main(String[] args) {
        boolean equalSum = hasEqualSum(1,4,4);
        System.out.println(equalSum);
    }
}
