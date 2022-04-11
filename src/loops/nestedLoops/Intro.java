package loops.nestedLoops;

public class Intro {
    public static void main(String[] args) {
        /*
        Print 5 groups of 3:
        1
            1
            2
            3
        .
        .
        .
        5
            1
            2
            3
         */

        for(int i = 1; i <= 5; i++){
            System.out.println(i);

            for(int j = 1; j <= 3; j++){
                System.out.println("\t" + j);
            }
        }
    }
}
