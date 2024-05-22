package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int a = 10;
        int b = 15;
        int sum1 = (a + b);
        System.out.println("int a is " +a);
        System.out.println("int b is " +b);
        System.out.println("a plus b is " +sum1);

        int c = 2;
        int d = 1;
        int sum2 = (c - d);
        System.out.println("int c is " +c);
        System.out.println("int d is " +d);
        System.out.println("d minus e is " + sum2);

        int e = 4;
        double f = 1.5;
        System.out.println("int e is " +e);
        System.out.println("double f is " +f);
        System.out.println("e times f is " +(e * f));

        int g = 7;
        double h = 3.5;
        System.out.println("int g is " +g);
        System.out.println("double h is " +h);
        System.out.println("g divided by h is " +(g / h));

        int i = 10;
        int j = 5;
        System.out.println("int i is " +i);
        System.out.println("int j is " +j);
        System.out.println("i % j is " +(i % j));

    }

}
