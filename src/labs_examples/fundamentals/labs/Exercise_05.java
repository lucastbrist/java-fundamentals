package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int var1 = str.length();
        System.out.println("Int var1 is " + str.length());

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean var2 = false;
        boolean equals = str.equals(str2);
        System.out.println("var2 is " + var2);

        // please concatenate str & str2 and set the result to a new String variable below
        System.out.println("var3 is " + str + str2);
        String var3 = str + str2;

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        

    }


}