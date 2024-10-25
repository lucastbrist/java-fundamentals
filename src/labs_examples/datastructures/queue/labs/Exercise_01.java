package labs_examples.datastructures.queue.labs;

import java.util.ArrayDeque;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class exercise_01 {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(10);

        System.out.println("Let's populate this deque.");
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.add(5);

        System.out.println("Let's get rid of the firs thing in the deque.");
        arrayDeque.remove(1);

        System.out.println("This will tell us the first thing in the deque!");
        System.out.println(arrayDeque.element());

        System.out.println("Let's take the first thing out of the deque, but also know what it is!");
        System.out.println(arrayDeque.poll());

        System.out.println("So let's check again. Now that 2's out of there, what else is in there?");
        System.out.println(arrayDeque.peek());

        System.out.println("Let's add something in here again.");
        arrayDeque.offer(6);

        System.out.println("Let's print out everything in there now, one at a time.");
        arrayDeque.forEach(System.out::println);

    }

}
