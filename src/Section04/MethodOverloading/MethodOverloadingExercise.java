package Section04.MethodOverloading;

public class MethodOverloadingExercise {
    public static double calcFeetAndInchestoCenti(double feet, double inches){
        double calcmfeet = (feet*12)*2.54;
        double calcminches = inches*2.54;

        if (feet >= 0 && inches>=0 && inches <= 12){
            calcmfeet += calcminches;
            // System.out.println(feet + " feet, " + inches + " inches = " + calcmfeet + " cm.");
            return calcmfeet;
        }
        System.out.println("Invalid value");
        return -1;
    }
    public static double calcFeetAndInchestoCenti(double inches){
        if (inches<0){
            return -1;
        }
        double feet = (int) (inches/12);
        double remaininginches = (int)(inches%12);

        System.out.println(inches + " is equal to = " + feet + " feet and " + remaininginches +  " inches.");
        return calcFeetAndInchestoCenti(feet, remaininginches);

    }

    public static void main(String[] args) {
        calcFeetAndInchestoCenti(6, 12);

        double calcinches = calcFeetAndInchestoCenti(0);
        if (calcinches < 0.0){
            System.out.println("Invalid Value for inches.");
        }
    }

}
