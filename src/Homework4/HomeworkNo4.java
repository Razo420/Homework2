package Homework4;

import java.util.Scanner;

public class HomeworkNo4 {
    public static void main(String[] args){

        Scanner inputscanner = new Scanner(System.in);
        System.out.println("Write number");
        int Scan = inputscanner.nextInt();
        int a = 0;
        int b = 0; int c = 0;


        while (a <= Scan){ if(a % 2==0){
            b +=a;
            c++;

        }
        a++;
            System.out.println("Arithmetic Average is : " + (b/c));
        }
        System.out.println("You write number");
        for (int i= 1; i<17; i+=3){
            System.out.println(i);
        }

        Scanner inputscann = new Scanner(System.in);
        System.out.println("number");
        int j = inputscann.nextInt();
//          int j = 2;
        while (j !=12){
            System.out.println(j);
            j += 2;
        }

    }
}
