package Section05.UserInput;

import java.util.Scanner;

public class MinAndMaxChallenge {
     public static void MinAndMaxInputChallenge(){
         Scanner scanner = new Scanner(System.in);
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;

         // boolean hasNumber  = scanner.hasNextInt();
         while (true) {
             System.out.print("Enter Number: ");
             boolean hasNumber  = scanner.hasNextInt();

             if(!hasNumber){
                 System.out.println("Invalid Number");
                 break;
             }
             else {
                 int number = scanner.nextInt();

                 if(number>max){
                     max = number;
                 }
                 if(number<min){
                     min = number;
                 }
             }
             // scanner.nextLine();
         }
         System.out.println("max = " + max + " min = " + min);

         scanner.close();
     }

    public static void main(String[] args) {
         MinAndMaxInputChallenge();

    }
}
