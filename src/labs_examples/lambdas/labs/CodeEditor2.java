package labs_examples.lambdas.labs;

import java.util.function.Predicate;

public class CodeEditor2 {

    public static void main(String[] args) {

        // Step 1) modify the Predicate below to use a
        // method reference rather than a Lambda expression
        // Predicate<Integer> p1 = n -> NumberUtil.isEven(n);
        Predicate<Integer> p1 = NumberUtil::isEven;

        boolean result = p1.test(4);
        boolean result2 = p1.test(5);
        System.out.println(result + " & " + result2);
    }
}

class NumberUtil {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}