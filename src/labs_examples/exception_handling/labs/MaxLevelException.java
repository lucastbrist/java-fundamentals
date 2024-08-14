package labs_examples.exception_handling.labs;

public class MaxLevelException extends Exception {

    @Override
    public String toString() {
        return "You have reached max level!";
    }

}
