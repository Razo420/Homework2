package homework7;

public class StaticMethods {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 14;
        int result1 = sum(num1, num2);
        System.out.println("Task 1:\nThe sum of num1 and num2 = " + result1);

        long num3 = 25;
        System.out.println("\nTask 2:\nThe volume of num3 = " + volume(num3));

        String name = "Razo";
        System.out.println("\nTask 3:");
        middleChar(name);

        int[] myArray1 = new int[10];
        System.out.print("\n\nTask 4:\nArray values: ");
        randArray(myArray1);

        String[] myArray2 = {"Bmw", "Mercedes", "Porsche", "Audi", "Lexus"};
        System.out.println("\n\nTask 5:\nString array:");
        stringArray(myArray2);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static long volume(long x) {
        return x * x * x;
    }

    public static void middleChar(String str) {
        int middleStringChar = str.length() / 2;
        System.out.print("The middle character of \"" + str + "\" is: " + str.charAt(middleStringChar));
    }

    public static void randArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }

    public static void stringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("arr[" + i + "] = " + array[i]);
        }
    }
}
