package Homework3;

public class HomeworkNo3_2 {
    public static void main(String   []args){
        int floor = Integer.parseInt(args[1]);

        if (args.length > 0){

        switch (floor) {

            case 1:
                System.out.println("Going to floor 1");
                break;
            case 2:
                for (int i = 1; i <= 2; i++) {
                    System.out.println("Going to floor :" + i);
                }
                break;
            case 3:
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Going to floor :" + i);
                }
                break;
            case 4:
                for (int i = 1; i <= 4; i++) {
                    System.out.println("Going to floor :" + i);
                }
                break;
            case 5:
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Going to floor :" + i);
                }
                break;
            default:
                System.out.println("Invalid floor");
        }
        }
    }
}
