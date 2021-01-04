package Section04.MethodOverloading;

public class AreaCalculator {

    public static double area(double radius){
        if (radius<0){
            return -1;
        }
        return radius*radius*Math.PI;
    }
    public static double area(double x, double y){
        if ((x<0) || (y<0)){
            return -1;

        }
        return x*y;

    }

    public static void main(String[] args) {
        double circleArea = area(34);
        System.out.println("Circle Area = " + circleArea);

        double ractangleArea = area(5,6);
        System.out.println("Rectangle Area = " + ractangleArea);


    }
}
