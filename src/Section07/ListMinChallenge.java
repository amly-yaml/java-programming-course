package Section07;

import java.util.Arrays;
import java.util.Scanner;

public class ListMinChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many count you want to enter?");
        int count = scanner.nextInt();
        int[] myIntArray = redInteger(count);
        System.out.println("Enter number: " + Arrays.toString(myIntArray));

        for (int i=0; i<myIntArray.length; i++){
            System.out.println("Element content = " + myIntArray[i]);
        }
        System.out.println("Minimun = " + findMinium(myIntArray));


    }
    public static int[] redInteger(int number){
        int[] myarray = new int[number];
        for (int i=0;i<myarray.length;i++){
            System.out.println("Please enter a number: ");
            myarray[i]=scanner.nextInt();

        }
        return myarray;
    }

    public static int findMinium(int[] array){
        // mint[] myArrayList = new int[array.length];
        int min = Integer.MAX_VALUE;
        int value;
        for (int i=0; i<array.length; i++){
            value = array[i];

            if(value<min){
                min = value;
            }

        }
        return min;



    }
}
