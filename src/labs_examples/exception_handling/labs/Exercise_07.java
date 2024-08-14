package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 * <p>
 * 1) Create a custom exception.
 * 2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {

    public static void main(String[] args) {

        int level = 100;
        try {
            levelUp(100);
        } catch (MaxLevelException exc) {
            System.out.println(exc.toString());
        }
    }

    public static void levelUp(int level) throws MaxLevelException {

        level++;

        if (level >= 100) {
            throw new MaxLevelException();
        }

    }

}