package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04 {

    public static void main(String[] args) {

        Count count = new Count();

        for (int i = 0; i <= 100; i++) {
            Thread thread = new Thread(new CounterThread("Thread " + i, count));
            thread.start();
        }

        for (int i = 101; i < 300; i++) {
            Thread thread2 = new Thread(new CounterThread2("Thread " + i, count));
            thread2.start();
        }

    }

}

class Count {

    private int count;
    private Object lock = new Object();

    public synchronized void incrementCount() {
        count++;
        System.out.println(count);
    }

    public void incrementCount2() {
        synchronized(lock) {
            count++;
            System.out.println(count);
        }
    }

}

class CounterThread implements Runnable {

    Thread thread;
    Count count;

    public CounterThread(String str, Count count) {
        this.thread = new Thread(this, str);
        this.count = count;

    }

    @Override
    public void run(){
        try {
            System.out.println(this.thread.getName());
            this.count.incrementCount();
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }

}

class CounterThread2 implements Runnable {

    Thread thread;
    Count count;

    public CounterThread2(String str, Count count) {
        this.thread = new Thread(this, str);
        this.count = count;

    }

    @Override
    public void run(){
        try {
            System.out.println(this.thread.getName());
            this.count.incrementCount2();
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }

}