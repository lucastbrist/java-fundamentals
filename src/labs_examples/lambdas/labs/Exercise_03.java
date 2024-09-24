package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class Exercise_03 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // 1)
        nums.forEach(ClassName::methodName);

        // 2)
        nums.forEach(System.out::println);

        // 3)
        nums.forEach(ClassName::new);

    }

}

    class ClassName {

        public ClassName(int a) {
            System.out.println(a * 2);
        }

        static void methodName(int a) {
            System.out.println(a + 1);
        }
    }