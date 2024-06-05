package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {
        System.out.println("Hi, I'm at the top of this loop!");
        boolean loop = true;
        while (loop){
            System.out.println("Hi, you're in the middle of the loop!");
            System.out.println("Break!");
            break;
        }
    }

}
