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

        
        char sim1 = 'a';
        char sim2 = 'b';
        char sim3 =  'c';
        if(sim1>sim2){
            if(sim1>sim3){
                System.out.println(sim1);
            } else {
                System.out.println(sim3);
            }
        } else if (sim2 < sim3) {
            System.out.println(sim3);
        } else {
            System.out.println(sim2);
        }

        boolean redhisHitFromBehind = true;
        boolean blackisHitFromBehind = false;


        if (redhisHitFromBehind && !blackisHitFromBehind){
            System.out.println("black");
        } else if (!redhisHitFromBehind && blackisHitFromBehind){
            System.out.println("red");
    }
        else{
            System.out.println("Invalid state");
        }
}
}


