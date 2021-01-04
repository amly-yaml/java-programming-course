package Section07;

import java.util.ArrayList;

class Intclass{
    private int number;

    public Intclass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class Auto_Unboxing {
    public static void main(String[] args) {
        // list-array
        String[] myString = new String[10];
        int[] myInt = new int[10];

        // arrayList
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Very Nice");

        // call above Intclass
        ArrayList<Intclass> myIntArray = new ArrayList<>();
        myIntArray.add(new Intclass(10));

        // but can use Integer Class without creating Int class
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i=0; i<10; i++){
            // this is called boxing: change premitative data type to class int wrapper
            integerArrayList.add(i);  // i = Integer.valueOf(i)
        }
        System.out.println(integerArrayList);

        for (int i=0; i<integerArrayList.size(); i++){
            // this is called unboxing: change class int value to premitative data int type
            System.out.println(i + "->" + integerArrayList.get(i));  // integerArrayList.get(i).intValue(
        }

        // it can use directly number in Integer class
        Integer myIntClass = 56;  // Integer.valueOf(56)
        int preInt = myIntClass.intValue(); // myIntClass

        Double myDouClass = 25.56;

        System.out.println("------------------------------");

        // Using double here
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (double i=0; i<=10; i++){
          doubleArrayList.add(i);  // = doubleArrayList.add(Double.valueOf(i))
          // System.out.println(doubleArrayList);
        }
        System.out.println(doubleArrayList);

        for (int i=0; i<doubleArrayList.size(); i++){
            System.out.println(i+1 + "-->" + doubleArrayList.get(i)); // = doubleArrayList.get(i).doubleValue()
        }

        

    }
}
