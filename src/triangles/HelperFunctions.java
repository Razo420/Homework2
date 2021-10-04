package triangles;

public class HelperFunctions {
    boolean checkTriangle(Triangle object){
        return object.leftline < object.rightline + object.bottomline && object.rightline < object.leftline + object.bottomline && object.bottomline < object.leftline + object.rightline;
    }
    public int calcPerimeter(Triangle object) {
        int perimeter = object.rightline + object.leftline + object.bottomline;
        System.out.println("The perimeter of this triangle is: " + perimeter);
        return perimeter;
    }
    public double calcSquare(Triangle object){
        int a = object.leftline;
        int b = object.rightline;
        int c = object.bottomline;
        int p = a + b + c;
        double square = Math.sqrt(p *(p-a) * (p-b) * (p-c));
        System.out.println("The square of this triangle is :" + square);
        return square;
    }
}
