package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        System.out.println("Before you, in this ethereal codescape of Strings and method calls, is a cylinder.");
        System.out.println("For reasons beyond your mortal comprehension, the great Nomads demand you calculate its volume and surface area before you may be deemed worthy of the next challenge.");
        int h = 5;
        System.out.println("The height of the cylinder is " + h);
        double r = 3.14;
        System.out.println("The radius of the cylinder is " + r);
        System.out.println("Begin.");
        System.out.println("The volume of the cylinder is " + Math.PI * (Math.pow(r, 2) * h));
        double larea = 2 * (Math.PI * (r * h));
        System.out.println("The lateral surface area of the cylinder is " + larea);
        double top;
        double bottom = top = Math.PI * (Math.pow(r, 2));
        System.out.println("The top and bottom surface area of the cylinder is " + bottom);
        System.out.println("The total surface area of the cylinder is " + (top + bottom + larea) + (2 * Math.PI * Math.pow(r, 2)) + (2 * Math.PI * (r * h)));
        System.out.println("Congratulations. That sucked, right?");

    }
}