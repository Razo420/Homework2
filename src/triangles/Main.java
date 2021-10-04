package triangles;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();

        triangle1.leftline = (int) (Math.random() * 10);
        triangle1.rightline = (int) (Math.random() * 10);
        triangle1.bottomline = (int) (Math.random() * 10);
        System.out.println("Generated first triangle with sides: " + triangle1.leftline + " " + triangle1.rightline + " " + triangle1.bottomline);

        triangle2.leftline = (int) (Math.random() * 10);
        triangle2.rightline = (int) (Math.random() * 10);
        triangle2.bottomline = (int) (Math.random() * 10);
        System.out.println("Generated second triangle with sides: " + triangle2.leftline + " " + triangle2.rightline + " " + triangle2.bottomline);

        triangle3.leftline = (int) (Math.random() * 10);
        triangle3.rightline = (int) (Math.random() * 10);
        triangle3.bottomline = (int) (Math.random() * 10);
        System.out.println("Generated third triangle with sides: " + triangle3.leftline + " " + triangle3.rightline + " " + triangle3.bottomline);

        System.out.println();

        HelperFunctions helpFunction = new HelperFunctions();

        if (helpFunction.checkTriangle(triangle1)) {
            helpFunction.calcPerimeter(triangle1);
            helpFunction.calcSquare(triangle1);
        } else {
            System.out.println("Generated first triangle is invalid");
        }

        System.out.println();

        if (helpFunction.checkTriangle(triangle2)) {
            helpFunction.calcPerimeter(triangle2);
            helpFunction.calcSquare(triangle2);
        } else {
            System.out.println("Generated second triangle is invalid");
        }

        System.out.println();

        if (helpFunction.checkTriangle(triangle3)) {
            helpFunction.calcPerimeter(triangle3);
            helpFunction.calcSquare(triangle3);
        } else {
            System.out.println("Generated third triangle is invalid");
        }

        System.out.println();
    }
}
