package Section07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getInteger(5);
        int[] mySortedArray = sortedArray(myArray);

        System.out.println("The highest to lowest number of typed value: ");
        printArray(mySortedArray);
    }

    public static int[] getInteger(int number){
        int[] array = new int[number];
        System.out.println("Enter " + number + " number: \r");
        for (int i=0; i<array.length; i++){
            array[i]= scanner.nextInt();
        }
        return array;

    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(i+1 + ": " + array[i]);
        }
    }

    public static int[] sortedArray(int[] array){
        // a way to copy the existing array
//        int[] sortedArray = new int[array.length];
//        for (int i=0; i<array.length; i++){
//            sortedArray[i]=array[i];
//        }
        // another way to copy the existing array
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag=false; // to break automitically when all the array inside is finished
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    // swap the number to order highest to lowest
                    temp = sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    // to check/continue until there is no sorted number left
                    flag=true;
                }
            }
        }
        return sortedArray;

    }
}
