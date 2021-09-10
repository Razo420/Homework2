public class HomeworkNo2 {

    public static void main(String[] args) {
        int a = 15;
        int b = 12;
        int c = b;

        if (a > b) {
            System.out.println("Right a");
        } else if (a < b){
            System.out.println("Right b");
        } else if (a == b){
            System.out.println("Right c");
        } else {
            System.out.println("Life is beautiful");
        }




        int weekend = 3;
        switch (weekend){
            case 1 :
                System.out.println("Friday");
            case 2:
                System.out.println("Saturday");
            case 3:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Don't Worry");
        }

        int redhisHitFromBehind = 1;
        int blackisHitFromBehind = 1;


        if (redhisHitFromBehind > blackisHitFromBehind){
            System.out.println(redhisHitFromBehind);
        } else if (redhisHitFromBehind < blackisHitFromBehind){

    }
        else if (redhisHitFromBehind == blackisHitFromBehind){
            System.out.println("Invalid state");
        }
}
}


