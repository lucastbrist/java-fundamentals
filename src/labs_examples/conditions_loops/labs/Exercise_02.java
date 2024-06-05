package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        boolean within7 = false;
        boolean greater1 = false;
        boolean less7 = false;
        System.out.print("Enter a number and I'll tell you what day of the week it corresponds to, since you apparently can't count.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 1) {
            greater1 = true;
        }

        if (number <= 7) {
            less7 = true;
        }

        if (greater1 && less7) {
            within7 = true;
        }

        if (within7) {
            System.out.println("That number corresponds to:");
            } if (number == 1) {
                System.out.println("Sunday! Or Monday, depending on what you consider the start of the week.");
            } else if (number == 2) {
                System.out.println("Tuesday, probably!");
            } else if (number == 3) {
                System.out.println("Wednesday, probably!");
            } else if (number == 4) {
                System.out.println("Thursday, probably!");
            } else if (number == 5) {
                System.out.println("Friday, probably!");
            } else if (number == 6) {
                System.out.println("Saturday, probably!");
            } else if (number == 7) {
                System.out.println("Sunday, probably!");

        } else if (!within7){
            System.out.println("Sorry, that isn't a number of the week, dummy.");
        }
    }
}
