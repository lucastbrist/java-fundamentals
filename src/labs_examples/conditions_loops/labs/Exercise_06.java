package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop to find the sum of numbers from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 100) {
            sum += x;
            System.out.println("The sum is : " + sum);
            x++;
        }
    }
}

