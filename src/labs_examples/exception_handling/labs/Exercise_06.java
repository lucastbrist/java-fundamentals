package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        try {

            divideMethod(2, 0);

        } catch (ArithmeticException exc) {
            System.out.println("You can't divide by zero, you silly goose!");
        }

    }

    public static int divideMethod(int a, int b) throws ArithmeticException {

        try {
            return (a / b);
        } catch (ArithmeticException exc) {
            throw exc;
        }
    }

}

