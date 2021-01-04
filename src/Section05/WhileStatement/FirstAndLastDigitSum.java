package Section05.WhileStatement;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int sum;
        int lastDigit = number%10;
        while(number>=10){
            // get the first least digit with looping
            number/=10;

        }
        sum = number + lastDigit;
        return sum;
    }

    public static void main(String[] args) {
        int isSum = sumFirstAndLastDigit(10);
        System.out.println(isSum);
    }

}
