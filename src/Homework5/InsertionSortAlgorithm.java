package Homework5;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);

        }
        for(int elem: arr){
            System.out.println(elem);
        }

    }
}
