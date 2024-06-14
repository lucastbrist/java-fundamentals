package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        //Let's get our numbers! This will take a bit.
        System.out.println("Please input 10 numbers.");
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Number " + i + ":");
            nums[i] = scanner.nextInt();
        }

        //Purely for user experience:
        System.out.println("Thank you!");
        System.out.println("I will now calculate the sum and average of these numbers for you. :)");
        System.out.println("Calculating...");

        int sum = 0;
        double avg = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int x : nums) {
            avg = (double) sum / nums.length;
        }
        System.out.println("The sum of those numbers is: " + sum);
        System.out.println("The average of those numbers is " + avg);
    }
}