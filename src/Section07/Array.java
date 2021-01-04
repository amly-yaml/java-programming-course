package Section07;

public class Array {
    public static void main(String[] args) {
       int[] myArray = new int[10];
        myArray[0] = 3;
        // System.out.println(myArray[0]);
        double[] myArraydouble = new double[10];
        myArraydouble[0] = 1;
        // System.out.println(myArraydouble[0]);

        for (int i=0; i<myArray.length; i++){
            myArray[i]= i*10;
            // System.out.println(myArray[i]);
        }

//        for(int i=0; i<myArray.length; i++){
//            System.out.println(i + " * " + " 10 = " + myArray[i]*10);
//        }

        getArray();

    }

    public static void getArray(){
        int[] myarray = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<myarray.length; i++){
            myarray[i]= myarray[i]*10;
            System.out.println(myarray[i]);
        }

    }
}
