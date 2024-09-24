package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

class Exercise_01 {

    public static void main(String[] args) {

        // 1 and 2)
        Function function = () -> {
            System.out.println("This is a function!");
        };

        function.apply();

        Function function1 = new Function() {
            @Override
            public void apply() {
                System.out.println("This is still a function!");
            }
        };

        function1.apply();

        // 3 and 4)
        paramFunction<Integer> paramFunction = (Integer x) -> {
            return x * 2;
        };

        System.out.println(paramFunction.apply(5));

        paramFunction paramFunction1 = new paramFunction() {
            @Override
            public Integer apply(Object o) {
                return (int)o * 4;
            }
        };

        System.out.println(paramFunction1.apply(5));

        // 5 and 6)
        twoParamFunc<Integer, Integer, Integer> twoParamFunction = (Integer x, Integer y) -> {
            return x * y * 2;
        };

        System.out.println(paramFunction.apply(5));

        twoParamFunc twoParamFunction1 = new twoParamFunc() {
            @Override
            public Integer apply(Object o, Object ob) {
                return (int)ob * (int)ob;
            }
        };

        System.out.println(paramFunction1.apply(5));

        // 7)
        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return (int)o * (int)o2;
            }
        };

        System.out.println(biFunction.apply(20, 5));

        Predicate<Integer> predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        System.out.println("Is 5 equal to 4?" + "\n Answer: " + predicate.test(5));

    }

    @FunctionalInterface
    public interface Function {

        void apply();

    }

    @FunctionalInterface
    public interface paramFunction<N> {

        N apply(N n);

    }

    @FunctionalInterface
    public interface twoParamFunc<X, Y, V> {

        V apply(X x, Y y);

    }

}