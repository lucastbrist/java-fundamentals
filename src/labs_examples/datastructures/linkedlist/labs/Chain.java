package labs_examples.datastructures.linkedlist.labs;

public class Chain<E> {

    class Link<E> {

        public E element;
        public Link<E> prev;
        public Link<E> next;

        public Link(E element) {
            this.element = element;
        }

        public Link(Link<E> next) {
            this.next = next;
        }

        public Link(E element, Link<E> next) {
            this.element = element;
            this.next = null;

        }
    }

    private Link first;
    private Link last;
    private boolean isLoop;

    public <E> void addLink(E element) {

        Link newLink = new Link(element);
        newLink.next = this.first;
        this.first = newLink;
        if (this.first.next != null) {
            this.first.next.prev = this.first;
        }

    }

    public void removeFirst() {

        if (this.first != null) {
            this.first = this.first.next;
        }

    }

    public <E> E checkFirst() {

        return (E)this.first.element;

    }

    public <E> E check(int i) {

        Link current = this.first;
        int count = 0;

        try {
            while (current.element != null && count != i) {
                current = current.next;
                count++;
            }

        } catch (NullPointerException nullPointerException) {
            return (E)nullPointerException;
        }

        return (E) current.element;

    }

    public <E> E checkPrev(int i) {

        Link current = this.first;
        int count = 0;

        try {
            while (current.element != null && count != i - 1) {
                current = current.next;
                count++;
            }

        } catch (NullPointerException nullPointerException) {
            return (E)nullPointerException;
        }

        return (E) current.element;

    }

    public <E> E checkLast() {

        Link current = this.first;
        while (current.next != null && current.next.element != null) {
            current = current.next;
        }

        this.last = current;
        return (E)this.last.element;

    }

    public void removeLast() {

        if (this.first != null) {

            if (this.last != null) {

                this.last = this.last.prev;
                this.last.next = null;

            }

        }

    }

    public <E> void addLast(E element) {

        this.checkLast();
        Link newLast = new Link(element);
        newLast.prev = this.last;
        newLast.next = null;
        this.last.next = newLast;
        this.last = newLast;

    }

    public void loopChain() {

        this.checkLast();
        this.first.prev = last;
        this.last.next = this.first;
        this.isLoop = true;

    }

    public <E> E checkLoop() {

        String error = "The chain is not a loop yet. Run loopChain() first and try again.";

        if (isLoop) {
            System.out.println(last.prev.element);
            System.out.println(last.next.element);

            return (E)last.element;
        }

        else return (E)error;

    }

}
