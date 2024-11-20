package labs_examples.datastructures.stack.labs;

public class Cupboard<E> {

    private E[] array = (E[]) new Object[100];
    private int count;

    public int getCount() {

        return this.count;

    }

    public void setCount(int i) {

        this.count = i;

    }

    public void stack(E element) {

            for (int i = 0; i < (this.array.length - 1); i++) {
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
        } else if (getCount() <= (this.array.length - 1) / 4) {
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

    public int stacked() {

        int count = 0;

        for (int i = 0; i < this.array.length - 1; i++) {
            count++;
        }

        return count;

    }

    public void printAll() {

        for (int i = (this.array.length - 1); i >= 0; i--) {
            if (this.array[i] != null) {
                System.out.println(this.array[i].toString());
            }
        }
    }

    public E peekFirst() {

        E returnItem = null;

        for (int i = 0; i < (this.array.length - 1); i++) {
            if (this.array[i + 1] == null) {
                returnItem = this.array[i];
                break;
            }
        }

        return returnItem;

    }

    public E peekLast() {

        return this.array[0];

    }

    public void unstack() {

        if (this.array[0] == null) {
            System.out.println("You cannot unstack from an empty stack!");
        } else {
            for (int i = 0; i < (this.array.length - 1); i++) {
                if (this.array[i + 1] == null) {
                    this.array[i] = null;
                    break;
                }
            }
        }

        this.setCount(count - 1);

    }

    public E pop() throws StackException {

        if (this.array.length == 0) {
            throw new StackException();
        }

        E returnItem = null;

        for (int i = 0; i < (this.array.length - 1); i++) {
            if (this.array[i + 1] == null) {
                returnItem = this.array[i];
                this.array[i] = null;
                break;
            }
        }

        return returnItem;

    }

}

class StackException extends NullPointerException {

    public void getErrorMessage() {
        String getMessage = "You just tried to pop from an empty stack!";
    }

}
