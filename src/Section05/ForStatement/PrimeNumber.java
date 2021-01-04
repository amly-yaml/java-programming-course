package Section05.ForStatement;

public class PrimeNumber {
    public static boolean isPrime(int number){
        if (number==1){
            return false;
        }
        for (int i=2; i<=number/2; i++){  // i always starts at 2 when j change the new number again & again
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void countPrime(){
        int count = 0;
        for (int k=10;k<=59;k++){
            if(isPrime(k)){
                count++;
                System.out.println(k + " number is a prime number.");
                if (count == 10){
                    System.out.println("Break the loop at count " + count);
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        // int num = 30;
        for (int j=1; j<=30; j++){
            System.out.println("Prime number "+ j + " = " + isPrime(j));

        }
        System.out.println("*********************");
        countPrime();
    }
}
