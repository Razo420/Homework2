package Lesson3;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your number 1.");
        int a = inputScanner.nextInt();
        System.out.println("You entered " + a);
        int b = inputScanner.nextInt();
        System.out.println("You entered " + b);
        int c = inputScanner.nextInt();
        System.out.println("You entered " + c);
        int sum = a + b + c;
        System.out.println("The sum is " +(a+b+c));
        System.out.println("Enter your string value ");
        String inputStr1 = inputScanner.next();
        String inputStr2 = inputScanner.next();
        System.out.println("You entered : " + inputStr1 + " : " + inputStr2);
        if (args.length > 0){
            System.out.println("First arg is: " + args[0]);
        } else {
            System.out.println("No arguments");
        }
    }
}
