package Homework3;

import java.util.Scanner;

public class HomeworkNo3 {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("введите что-нибудь");
        int q = inputScanner.nextInt();
        System.out.println("You entered " + q);
        int w = inputScanner.nextInt();
        System.out.println("You entered " + w);

        Scanner inputScann = new Scanner(System.in);
        System.out.println("введите что-нибудь");
        int a = inputScann.nextInt();
        System.out.println("add " + a);
        int s = inputScann.nextInt();
        System.out.println("subtract " + s);
        int m = inputScann.nextInt();
        System.out.println("multiply " + m);
        int d = inputScann.nextInt();
        System.out.println("divide " + d);

        Scanner InputScan = new Scanner(System.in);
        System.out.println("number 1: ");
        int c = InputScan.nextInt();

        System.out.println("number 2: ");
        int b = InputScan.nextInt();

        System.out.println("Enter operator (+,-,*,/)");
        String operator = InputScan.next();

        int result;
        switch (operator) {
            case "+":
                result = c + b;
                System.out.println("Addition is : " + result);
                break;
            case "-":
                result = c - b;
                System.out.println("Subtraction is : " + result);
                break;
            case "*":
                result = c * b;
                System.out.println("Multiplication is : " + result);
                break;
            case "/":
                result = c / b;
                System.out.println("Division is : " + result);
                break;
            default:
                System.out.println("incorrect data");


        }

    }
}
