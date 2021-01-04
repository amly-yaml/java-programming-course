package Section05.WhileStatement;

public class EvenNumber {
    private static boolean isEvenNumber(int n){
        return (n%2 == 0);
    }

    private static void checkEven(){
        int number = 4;
        int finishNumber = 30;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println(number + " is a even number.");

        }

    }

    private static void checkCountEven(){
        int number = 4;
        int finishNumber = 30;
        int sum = 0;
        int count = 0;

        while (number <= finishNumber){
            if(isEvenNumber(number)) {
                count++;
                sum += number;
                System.out.println(number + " is a even number.");
                if (count == 5){
                    System.out.println("loop break at count " + count);
                    break;
                }
            }number++;

        }
        System.out.println("Total = " + sum);

    }

    public static void main(String[] args) {
        checkEven();
        System.out.println();
        checkCountEven();

    }

}
