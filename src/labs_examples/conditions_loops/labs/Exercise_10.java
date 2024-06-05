package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {
        boolean loop = true;
        boolean loop2 = false;
        while (loop) {
            System.out.println("We're in a loop!");
            if(loop){
                continue;
            }
            System.out.println("I won't print!");
        }

    }

}
