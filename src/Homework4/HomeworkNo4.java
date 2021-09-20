package Homework4;

import java.util.Scanner;

public class HomeworkNo4 {
    public static void main(String[] args){

        Scanner inputscanner = new Scanner(System.in);
        System.out.println("Write number");
        int Scan = inputscanner.nextInt();

        int a = 0;
        int b = 0, c = 0;


        while (a <= Scan){ if(a % 2==0){

            b += a;
            c++;



        }
        a++;

        }
        System.out.println("Arithmetic Average is : " + (b/c));


//        System.out.println("You write number");
        for (int i= 1; i<17; i+=3){
            System.out.println(i);
        }

        int five;
        int p = 1;
        int summary = 0;
        System.out.println("Enter 5 integers");
        do{
           five = inputscanner.nextInt();
           summary += five;
           p++;
        }
        while (p <= 5);{
            System.out.println("Summary" + summary);
        }

        System.out.println("Enter your number");
        int scanner = inputscanner.nextInt();
        for (int z = 1; z <= scanner; z++){
            System.out.println("Cube of" + z + "is" +(z*z*z));
        }

    }
}
