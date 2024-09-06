package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Exercise_06 {

    public static void main(String[] args) {

        Count100 count = new Count100();

        for (int i = 0; i <= 100; i++) {
            Thread thread1 = new Thread(new CountTo100Thread("Thread " + i, count));
            thread1.start();
        }

    }

}

class Count100 {

    private int count;

    public synchronized void incrementCount() {
        count++;
        System.out.println(count);
    }

}

class CountTo100Thread implements Runnable {

    Thread thread;
    Count100 count;

    public CountTo100Thread(String str, Count100 count) {
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