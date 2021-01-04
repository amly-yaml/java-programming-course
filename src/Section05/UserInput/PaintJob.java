package Section05.UserInput;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        double area;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0){
            return -1;
        }
        area = width*height;
        // return  (int) Math.ceil(((width*height)/areaPerBucket));
        return (int) Math.ceil((area/areaPerBucket)-extraBucket);
         
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <=0 || height <= 0 || areaPerBucket <=0) {
            return -1;
        }
        return (int)(Math.ceil(width*height)/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area<=0 || areaPerBucket <= 0){
            return -1;
        }
        return (int)Math.ceil(area/areaPerBucket);

    }

    public static void main(String[] args) {
        int getArea = getBucketCount(8.45, 4.6, 2.25);
        System.out.println(getArea);
    }
}

