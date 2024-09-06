package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05 {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        ;

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("In producer for...");
                sharedResource.produce(i);
            }
        });
        producer.start();

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("In consumer for...");
                sharedResource.consume();
            }
        });
        consumer.start();

    }

}

class SharedResource {

    private int resource;
    private boolean hasResource = false;

    public synchronized void produce(int newResource) {

        while (hasResource) {
            try {
                System.out.println("Waiting...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        resource = newResource;
        hasResource = true;
        System.out.println("Produced: " + resource);
        notify();
        System.out.println("Notified...");

    }


    public synchronized void consume() {

        while (!hasResource) {
            try {
                System.out.println("Waiting...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Consumed: " + resource);
        hasResource = false;
        notify();
        System.out.println("Notified...");

    }
}