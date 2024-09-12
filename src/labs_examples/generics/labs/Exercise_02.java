package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();
        arrayList.add(44);
        arrayList.add(123.123);
        arrayList.add(9867.556);

        ListSummer n = new ListSummer();
        n.sumList(arrayList);

    }

}

class ListSummer<N extends Number> {

    double sum;

    public ListSummer() {
    }

    public double getSum() {
        return sum;
    }

    public void setSum(N sum) {
        this.sum = (double) sum;
    }

    public <N extends Number> void sumList(ArrayList<N> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + (arrayList.get(i).doubleValue());
        }

        System.out.println(sum);

    }

}