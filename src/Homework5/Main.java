package Homework5;

import java.util.Arrays;

public class Main {
    public static void main(String[] names) {
        int[] numbers = {12, 5, 8, 9, 3, 4, 6, 9};
        InsertionSort insertionsort = new InsertionSort();
        insertionsort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
