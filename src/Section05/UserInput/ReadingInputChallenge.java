package Section05.UserInput;

import java.util.Scanner;

public class ReadingInputChallenge {
    public static void main(String[] args) {
        sumNumberBreak();

    }

    public static void sumNumberBreak(){
        Scanner inputNumber = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while (true){
            int order = counter + 1;
            System.out.print("Enter the number " + order + ": ");

            boolean hasInt = inputNumber.hasNextInt();
            if(hasInt){
                int number = inputNumber.nextInt();
                // System.out.println(number);
                counter++;
                sum += number;
                if (counter==10){
                    break;
                }

            } else {
                System.out.println("Invalid Number");
            }
            inputNumber.nextLine();
        }
        System.out.println("Sum = " + sum);
        inputNumber.close();

    }

    public static void sumNumbernoBreak(){
        Scanner inputNumber = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (counter<10){
            int order = counter + 1;
            System.out.print("Enter the number " + order + ": ");

            boolean hasInt = inputNumber.hasNextInt();
            if(hasInt){
                int number = inputNumber.nextInt();
                // System.out.println(number);
                counter++;
                sum += number;
//                if (counter==10){
//                    break;
//                }

            } else {
                System.out.println("Invalid Number");
            }
            inputNumber.nextLine();
        }
        System.out.println("Sum = " + sum);
        inputNumber.close();

    }

}
