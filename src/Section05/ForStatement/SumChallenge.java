package Section05.ForStatement;

public class SumChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i=1; i<=1000; i++){
            if (i%3==0 && i%5==0){
                System.out.println("Number divide by 3 and 5 = " + i);
                count++;
                sum += i;
                if(count == 5){
                    System.out.println("Break the loop at count " + count);
                    break;    // when count equals 5, break statement will terminate the whole for loop.
                }

            }

        }
        System.out.println("Sum of the numbers = " + sum);  // this println is outside theS for loop to print sum.
    }
}
