package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        System.out.println("Please input the number of the index of the array you would like to access.");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("You have tried accessing an index that is out of bounds.");
        }
        System.out.println("Program complete.");
    }

}

