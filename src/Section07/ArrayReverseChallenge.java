package Section07;

import java.util.Arrays;

public class ArrayReverseChallenge {
    public static void main(String[] args) {
        int[] myArray = {1,2,4,6,7,8};
        getReverseArray(myArray);
        System.out.println("Reversed = " + Arrays.toString(myArray));

    }

    public static void getReverseArray(int[] array){
        int maxInteger = array.length-1;
        int halfArray = array.length/2;
        for (int i=0; i<halfArray; i++){
            int temp = array[i];
            array[i] = array[maxInteger-i];
            array[maxInteger-i]=temp;
        }




    }
}

