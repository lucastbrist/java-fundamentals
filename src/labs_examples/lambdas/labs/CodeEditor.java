package labs_examples.lambdas.labs;

public class CodeEditor {

    public static void main(String[] args) {

                // Step 1) Create a lambda expression using the interface below
                LambdaExample lambda = (a, b) -> {
                    return a + b;
                };
                // Step 2) call the apply() method on the lambda object
                System.out.println(lambda.apply(5, 10));
                // Step 3) redefine the lambda
                lambda = (a, b) -> {
                    return a * b;
                };
                // Step 4) call the apply() method again
                System.out.println(lambda.apply(5, 10));
            }

        interface LambdaExample {
            public int apply(int a, int b);

        }

}
