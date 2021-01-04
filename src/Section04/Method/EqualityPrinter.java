package Section04.Method;

public class EqualityPrinter {
    public static void printEqual(int x, int y, int z){
        if ((x<0) || (y<0)|| (z<0)){
            System.out.println("Invalid Value");
        }
        else if(x==y && y==z && x==z){
            System.out.println("All numbers are equal");
        }
        else if (x==y || y==z || x==z){
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All numbers are different");
        }
    }

    public static void main(String[] args) {
        printEqual(3,4,5);
        printEqual(1,4,1);
        printEqual(-9,8,0);
        printEqual(-3,-3,-3);
        printEqual(-9,-9,0);
        printEqual(7,7,9);
        printEqual(0,0,0);
    }

}
