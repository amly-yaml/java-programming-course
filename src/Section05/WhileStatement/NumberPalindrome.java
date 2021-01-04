package Section05.WhileStatement;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int palin = number;
        while (palin != 0) {
            int lastDigit = palin % 10;
            reverse = (reverse*10) + lastDigit;
            palin/=10;
        }
        return (reverse == number);
    }

    public static void main(String[] args) {
        boolean isPalin = isPalindrome(11212);
        System.out.println(isPalin);
    }
}
