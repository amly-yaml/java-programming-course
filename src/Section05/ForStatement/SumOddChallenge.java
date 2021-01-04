package Section05.ForStatement;

public class SumOddChallenge {
    public static boolean isOdd(int number){
        if (number<0){
            return false;
        }
        return (number%2!=0);
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if ((start<0) || (end<0) || (end<start)){
            return -1;
        }
        for(int i=start ; i<=end; i++){
            if(isOdd(i)){
                sum += i;
            }

        }
        return sum;

    }

    public static void main(String[] args) {
        boolean isOddNumber = isOdd(13);
        System.out.println(isOddNumber);
        System.out.println("Sum = " +sumOdd(10,5));
    }
}
