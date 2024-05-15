package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);
        byte b = -128;
        System.out.println("byte b is: " + b);
        short s = -32768;
        System.out.println("short s is: " + s);
        long l = -9223372036854775808L;
        System.out.println("long l is " + l);
        float f = 1.234567f;
        System.out.println("float f is " + f);
        double d = 1.2345678910111213f;
        System.out.println("double d is " + d);
        boolean success = true;
        System.out.println("boolean success is " + success);
        char c = 'z';
        System.out.println("char c is " + c);
    }

}
