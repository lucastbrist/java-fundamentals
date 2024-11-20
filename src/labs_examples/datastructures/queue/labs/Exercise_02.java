package labs_examples.datastructures.queue.labs;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

class exercise_02 {

    public static void main(String[] args) {

        System.out.println("Let's make a queue and put stuff in it!");
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Alright, how big is the queue?");
        System.out.println(queue.size());

        System.out.println("Alright, what's in it?");
        queue.printAll();

        System.out.println("What's the first item?");
        System.out.println(queue.peekFirst());
        System.out.println("What's the last item?");
        System.out.println(queue.peekLast());

        System.out.println("Get that 1 out of here!");
        queue.dequeue();

        System.out.println("Print all again to make sure!");
        queue.printAll();

        System.out.println("I want that 2, but I also want to remove it. " +
                "Let's print it out and get rid of it at the same time!");

        try {
            System.out.println(queue.pop());
        } catch (QueueException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Let's be sure it's gone. Print all again!");
        queue.printAll();

        System.out.println("Let's see what happens if I try that same trick, but when there's nothing there!");
        Queue q2 = new Queue();

        try {
            q2.pop();
        } catch (QueueException e) {
            throw new RuntimeException(e);
        }

    }

}
