package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * More labs_examples.arrays
 * <p>
 * Using the array below, take in a number from 1-10 from the user and print out the index of that
 * element.
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        System.out.println("There is an array of numbers from 1 to 10.");

        System.out.println("Please enter a number from 1-10, and I'll tell you what index of the array it corresponds to.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("The index is " + i);
                break;
            }
        }

    }
}