package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String args[]) {

        System.out.println("Hi! Please type a number. :)");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        System.out.println("Hi again! Please type another number, this one higher than the first.");
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();
        int sum = 0;
        float average = ((float) (num1 + num2) / 2);

        for(int i = 1; i <= num2; i++){
            sum += i;
            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + average);
        }
    }
}
