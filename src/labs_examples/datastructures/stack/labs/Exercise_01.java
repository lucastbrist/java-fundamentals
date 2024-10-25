package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

class exercise_01 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Let's see. I've got a stack. Is it empty?");
        System.out.println("Answer: " + stack.isEmpty());

        System.out.println("Got it. Let's put stuff in it!");
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println("Let's find out what's at the top.");
        System.out.println("Answer: " + stack.peek());

        System.out.println("Hmm. Let's get that out of there.");
        stack.pop();

        System.out.println("Now what's at the top?");
        System.out.println("Answer: " + stack.peek());

        System.out.println("I think I want something else up there.");
        stack.push(1);

        System.out.println("Did that work?");
        System.out.println("Item at the top of the stack: " + stack.peek());
        System.out.println("It did!");

        System.out.println("Hmm... now where did I put my number 3?");
        System.out.println("The number 3 is at stack index: " + stack.search(3));

        System.out.println("Ah! Duh!");

    }

}