package labs_examples.datastructures.queue.labs;

public class Queue<E> {

    private E[] array = (E[]) new Object[100];
    private int count;

    public int getCount(){

        return this.count;

    }

    public void setCount(int i){

        this.count = i;

    }

    public void enqueue(E element) {

        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i] == null) {
                this.array[i] = element;
                break;
            }
        }

        this.setCount(count + 1);
        this.resize();

    }

    public void resize() {

        if (getCount() >= (((this.array.length - 1) / 4)) * 3) {
            E[] newArray = (E[]) new Object[this.array.length * 2];
            for (int i = 0; i < (this.array.length - 1); i++) {
                if (array[i] != null) {
                    newArray[i] = array[i];
                }
            }
            array = newArray;
        }
        else if (getCount() <= (this.array.length - 1) / 4) {
            E[] newArray = (E[]) new Object[this.array.length / 2];
            for (int i = 0; i < (this.array.length - 1); i++) {
                if (array[i] != null) {
                    newArray[i] = array[i];
                }
            }
            array = newArray;
        }
    }

    public int size() {

        return this.array.length;

    }

    public int queued() {

        int count = 0;

        for (int i = 0; i < this.array.length - 1; i++) {
            count++;
        }

        return count;

    }

    public void printAll() {

        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i] != null) {
                System.out.println(this.array[i].toString());
            }
        }
    }

    public E peekFirst() {

        return this.array[0];

    }

    public E peekLast() {

        E returnStatement = null;

        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i + 1] == null) {
                returnStatement = this.array[i];
                break;
            }
        }

        return returnStatement;

    }

    public void dequeue() {

        this.array[0] = null;

        for (int i = 0; i < (this.array.length - 1); i++) {
            this.array[i] = this.array[i + 1];
            if (this.array[i] == null) {
                break;
            }
        }

        this.setCount(count - 1);

    }

    public E pop() throws QueueException {

        if (this.array.length == 0) {
            throw new QueueException();
        }

        E returnItem = this.array[0];

        this.array[0] = null;

        for (int i = 0; i < (this.array.length - 1); i++) {
            this.array[i] = this.array[i + 1];
            if (this.array[i] == null) {
                break;
            }
        }

        return returnItem;

    }

}

class QueueException extends Exception {

    public void getErrorMessage() {
        String getMessage = "You just tried to pop an empty queue!";
    }

}
