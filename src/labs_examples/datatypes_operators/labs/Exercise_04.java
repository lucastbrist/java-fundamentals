package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below

        // less than
        if (a < b)
            System.out.println("a is less than b");

        // less than or equal to
        if (a <= b)
            System.out.println("a is less than or equal to b");

        // greater than
        if (a > b)
            System.out.println("a is greater than b");

        // greater than or equal to
        if (a >= b)
            System.out.println("a is greater than or equal b");

        // equal to
        if (a == b)
            System.out.println("a is equal to b");
    }

}

