package Section05.WhileStatement;

public class DigitSumChallenge {
    public static int sumDigits(int number){
        if (number<10){
            return -1;
        }
        int sum = 0;
        while(number>0){
            // extract the least-significant digit
            int reminder = number%10;
            sum += reminder;

            // drop the least-significant digit
            number/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum = " + sumDigits(32341));
        System.out.println("sum = " + sumDigits(-32341));
        System.out.println("sum = " + sumDigits(5));
        System.out.println("sum = " + sumDigits(32123));

    }
}
