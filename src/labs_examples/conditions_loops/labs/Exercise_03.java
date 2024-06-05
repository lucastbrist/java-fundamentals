package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

        public static void main(String[] args) {

            System.out.println("Give me a number, and I'll tell you what month of the year it corresponds to because I'm smart like that.");
            Scanner scanner = new Scanner(System.in);
            int month = scanner.nextInt();
            switch(month){
                case 1:
                    System.out.println("That'd be January. Hate that month.");
                    break;
                case 2:
                    System.out.println("That'd be February. Not spelled like it sounds. Or visa versa.");
                    break;
                case 3:
                    System.out.println("This one March(es) on.");
                    break;
                case 4:
                    System.out.println("April. My birthday month!");
                    break;
                case 5:
                    System.out.println("May flowers, brought to you by April showers.");
                    break;
                case 6:
                    System.out.println("June, AKA the beginning of insufferable heat.");
                    break;
                case 7:
                    System.out.println("July, home of the worst day for pet anxiety in the year.");
                    break;
                case 8:
                    System.out.println("August. I don't have a joke for this one.");
                    break;
                case 9:
                    System.out.println("September. Welcome to bug season.");
                    break;
                case 10:
                    System.out.println("October, AKA 31 days of Halloween.");
                    break;
                case 11:
                    System.out.println("November. Don't play Christmas music until after Thanksgiving, you degenerate.");
                    break;
                case 12:
                    System.out.println("December. The only month where a kid will get up willingly at the crack of dawn--because of Christmas.");
                    break;
                default:
                    System.out.println("That's not a month on Earth, you silly goose.");
                    break;
            }
        }
}
