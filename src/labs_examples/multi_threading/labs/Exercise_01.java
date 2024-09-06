package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


class Exercise_01 {

    public static void main(String[] args) {

        Thread firstThread = new Thread(new myNewThread("name"));
        firstThread.setPriority(Thread.MAX_PRIORITY);

        myNewThread secondThread = new myNewThread("name2");
        secondThread.thread.setPriority(Thread.MIN_PRIORITY);

    }

}

class myNewThread implements Runnable {

    Thread thread;

    public myNewThread(String str) {
        this.thread = new Thread(this, str);
        this.thread.start();
    }

    @Override
    public void run(){
        System.out.println("Running " + this.thread.getName());
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("Count of " + this.thread.getName() + " is " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception occurred");
        }
        System.out.println("Ending " + this.thread.getName());
    }

}

