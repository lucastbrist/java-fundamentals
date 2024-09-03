package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02 {

    public static void main(String[] args) {

        Thread thread = new Thread();
        thread.start();
        thread.setPriority(Thread.MIN_PRIORITY);

    }

}