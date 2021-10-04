package homework8;

public class Homework8 {
    public static void main(String[] args) {
        int i = 100;
        System.out.println("The sum of the first 100 numbers is: " + calculateNumbers(i));
        System.out.println("The sum of the first 100 odd numbers is: " + calculateOddNumbers(i));

        int j = 20;
        System.out.println("The product of the first 20 numbers is: " + calculateProduct(j));
        System.out.println("The sum of all numbers from 0-100 that are devisable by 3 is: " + devByThree(i));


    }


    public static int calculateNumbers(int number) {
        if (number == 1) return 1;
        int sum = calculateNumbers(number - 1) + number;
        return sum;
    }


    public static int calculateOddNumbers(int number) {
        if (number == 1) return 1;
        int sum = calculateOddNumbers(number - 1);
        if (number % 2 != 0 ) sum += number;
        return sum;
    }


    public static long calculateProduct(int number) {
        long prod;
        if (number == 1) return 1;
        prod = calculateProduct(number - 1) * number;
        return prod;
    }


    public static int devByThree(int number) {
        if (number == 1) return 1;
        int dev = devByThree(number - 1);
        if (number % 3 == 0) dev += number;
        return dev;
    }
    }

