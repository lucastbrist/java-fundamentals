package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_02 {

    public static void main(String[] args) {

        // 1)

        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return (int)o * (int)o2;
            }
        };

        System.out.println(biFunction.apply(20, 5));

        // 2)

        Predicate<Integer> predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        System.out.println("Is 5 equal to 4?" + "\n Answer: " + predicate.test(5));

        // 3)

        Function<Integer, Integer> function = new Function() {
            @Override
            public Object apply(Object o) {
                return (int)o + 2;
            }
        };

        System.out.println(function.apply(2));

        // 4)

        Supplier<Integer> supplier = new Supplier() {
            @Override
            public Object get() {
                System.out.println("Hello!");
                return null;
            }
        };

        System.out.println("Watch, the computer's about to say hi to me: " + "\n" + supplier.get());

        // 5)

        IntUnaryOperator intUnaryOperator = new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand + 2;
            }
        };

        System.out.println(intUnaryOperator.applyAsInt(2));

        // 6)

        

    }

}