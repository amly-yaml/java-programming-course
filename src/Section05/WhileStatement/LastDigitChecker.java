package Section05.WhileStatement;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c){
        if ((a<10) || (a>1000) || (b<10) || (b>1000) || (c<10) || (c>1000)){
            return false;
        }
        return ((a%10==b%10) || (a%10==c%10) || (b%10==c%10));

    }
    public static boolean isValid(int number){
        return (number>=10 && number<=1000);
    }

    public static void main(String[] args) {
        boolean hasSame = hasSameLastDigit(99,99, 999);
        System.out.println(hasSame);
        boolean isValid = isValid(-10);
        System.out.println(isValid);
    }

}
