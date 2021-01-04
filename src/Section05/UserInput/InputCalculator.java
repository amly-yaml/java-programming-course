package Section05.UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 0;

        while (true){
            System.out.print("Enter Number: ");
            boolean hasInt = scanner.hasNextInt();

            if(hasInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
                average = (double)sum/count;

            }
            else {
                System.out.println("Make sure you enter number.");
                break;
            }


        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        scanner.close();
    }


    public static void main(String[] args) {
        // inputThenPrintSumAndAverage();

        // String seatNum = null;
        int seatNum = 0;
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println(" Enter a number between 0 and 7");
//            seatNum = scanner.nextLine();
//            if (seatNum.matches("[0-7]")) break; // makes sure user enter a number also between the range
//            else System.out.println("Enter between 0 and 7");
//
//        }


        Scanner seatNumber = new Scanner(System.in);
        do {
            try {
                System.out.println("Please choose a seat number");
                seatNum = seatNumber.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The index you have entered is invalid");
                System.out.println("Please enter an index number between 0 and 7");
                seatNumber.nextLine();
            }
        } while ((seatNum <= 0 || seatNum >= 7));
    }
}
