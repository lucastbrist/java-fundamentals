package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 */

class exercise_02 {

    public static void main(String[] args) {

        Chain chain = new Chain();
        chain.addLink(5);
        chain.addLink(4);
        chain.addLink(3);
        chain.addLink(2);
        chain.addLink(1);
        System.out.println(chain.checkFirst());
        System.out.println(chain.check(3));
        System.out.println(chain.checkPrev(3));
        System.out.println(chain.checkLast());

        System.out.println("Let's remove the first thing.");
        chain.removeFirst();
        System.out.println(chain.checkFirst());

        System.out.println("Let's remove the last thing, too.");
        System.out.println(chain.checkLast());
        chain.removeLast();
        System.out.println(chain.checkLast());

        System.out.println("Let's add a new thing to the end.");
        chain.addLast(6);
        System.out.println(chain.checkLast());

        // don't do this
        //System.out.println(chain.checkLoop());
        //chain.loopChain();
        //System.out.println(chain.checkLoop());

    }

}

