package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

class exercise_01 {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0, 1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,3);

        linkedList.addAll(0, arrayList);

        linkedList.addFirst(0);

        linkedList.addLast(6);

        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.getLast());

        System.out.println("Let's see, is this element at the third index the number four?");
        System.out.println(linkedList.get(3));

        System.out.println("Let's fix that!");
        linkedList.set(3, 4);

        linkedList.push(-1);

        System.out.println("Computer, what's the first item in this list? Answer: " + linkedList.pop());

        System.out.println("Let's get that -1 out of there!");
        linkedList.remove();

        System.out.println("Does this list contain the number '-1'?" + " The answer is: " + linkedList.contains(-1));

        int count = 0;
        ListIterator<Integer> intIterator = linkedList.listIterator();
        while (intIterator.hasNext()) {
            count++;
            intIterator.next();
        }
        System.out.println(count);

        System.out.println(linkedList);

        System.out.println("You know what? I don't want my list anymore.");

        linkedList.clear();

        System.out.println("Now what's in it?");
        System.out.println(linkedList);
        System.out.println("Ah. Much better.");

    }

}