package Section07;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Array1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArray = getArray(5);
        for (int i=0; i<myArray.length; i++){
            System.out.println("Element " + i + " typed values was " + myArray[i]);
        }

        double average = getAverage(myArray);
        System.out.println("The average of 5 element " + average);

    }
    public static int[] getArray(int array){
        System.out.println("Enter 5 number:\r");
        int[] myarray = new int[array];

        for (int i=0; i<myarray.length; i++){
            myarray[i] = scanner.nextInt();
        }
        return myarray;

    }

    public static double getAverage(int[] array){
        int sum = 0;
//        for(int i=0; i<array.length; i++){
//            sum+=array[i];
//        }
        for (int value : array) {
            sum += value;
        }
        return (double) sum/ (double)array.length;


    }





}
