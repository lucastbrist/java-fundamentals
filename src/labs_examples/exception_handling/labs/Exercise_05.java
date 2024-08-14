package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        try {
            int x = mathDivide(2, 0);
        } catch (ArithmeticException exc) {
            System.out.println("You can't divide by zero, dummy!");
        } finally {
            System.out.println("Done!");
        }
    }

    public static int mathDivide(int a, int b) throws ArithmeticException {

        return (a / b);

    }

}