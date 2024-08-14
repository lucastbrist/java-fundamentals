package labs_examples.exception_handling.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        System.out.println("Please input the number of the index of the array you would like to access.");
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            index = scanner.nextInt();
        } catch (InputMismatchException exc2) {
                System.out.println("You have entered an invalid input.");
            }

        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("You have tried accessing an index that is out of bounds.");
        } catch (Exception exc2) {
            System.out.println("Man, you've done something wrong, idk.");
        }
        System.out.println("Program complete.");
    }

}


