package Homework6;

public class HomeworkNo6 {
    public static void main(String[] args) {
        int[][] array_1;
        int[][] array_2;

        array_1 = new int[4][5];
        array_2 = new int[4][5];

        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++){
                array_1[i][j] = (int) (Math.random()*100);
            }

        }

        System.out.println("Elements for array 1 : ");
        for (int i = 0; i < array_1.length; i++){
        System.out.println("Line: " + i + " ");
        System.out.println("Values: ");
        for (int j = 0; j < array_1[i].length; j++){
            System.out.println(" " + array_1[i][j] + " ");
        }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < array_2.length; i++) {
            for (int j = 0; j < array_2[i].length; j++){
                array_2[i][j] = (int) (Math.random() * 100);
            }

        }
        System.out.println("Elements of array 2 : ");
        for (int i = 0; i < array_2.length; i++) {
            System.out.println("Line: " + i + " ");
            System.out.println("Values: ");
            for (int j = 0; j < array_2[i].length; j++){
                System.out.println(" " + array_2[i][j] + "");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;

        int count = 0;
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_2[i].length; j++) {
                count = array_1[i][j];
            }
        }
        System.out.println("Elements and value of array3");
        for (int i = 0; i < array_1.length; i++){
            for (int j = 0; j < array_2[i].length;j++){


                int[] array3 = new int[count];
                array3[sum] = array_1[i][j] + array_2[i][j];
                System.out.println("array3["+ sum + "] = " + (array3[sum]));
                sum++;
            }
        }
    }
}

