package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03 {

    public static void main(String[] args) {

        System.out.println(sumOfTwo(44.4, 88.8));

        String string = "A man, a plan, a canal, Panama!";
        System.out.println(isPalindrome(string));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A man, a plan, a canal, Panama!");
        arrayList.add("Madam, I'm Adam!");
        arrayList.add("Racecar!");
        arrayList.add("Hello!");

        System.out.println(getPalindromes(arrayList));

        ArrayList<Integer> intsList = new ArrayList<>();
        intsList.add(1);
        intsList.add(2);
        intsList.add(3);
        intsList.add(4);
        intsList.add(5);
        intsList.add(6);
        intsList.add(7);
        intsList.add(8);
        intsList.add(9);
        intsList.add(10);

        getLargest(intsList);

        Integer[] newIntsList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        exchangeElements(newIntsList, 0, 9);

        for (int i : newIntsList) {
            System.out.println(i);
        }

    }

    public static <N extends Number> double sumOfTwo(N number1, N number2) {

        return number1.doubleValue() + number2.doubleValue();

    }

    public static <T extends Collection<String>> int getPalindromes(T collection) {

        int count = 0;

        for (String s : collection) {
            if (isPalindrome(s)) {
                count++;
            }
        }

        return count;

    }

    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        int front = 0;
        int back = (string.length() - 1);

        while (front < back) {
            while (!Character.isLetter(string.charAt(front))) {
                front++;
            }
            while (!Character.isLetter(string.charAt(back))) {
                back--;
            }
            if (string.charAt(front) != string.charAt(back)) {
                return false;
            } else {
                front++;
                back--;
            }
        }

        return true;

    }

    public static <T extends Comparable<T>> void getLargest(List<T> list) {

        T largest = list.get(0);

        for (T item : list) {
            if (item.compareTo(largest) > 0) {
                largest = item;
            }
        }

        System.out.println("The largest item in this list is " + largest);

    }

    public static <T> void exchangeElements(T[] array, int x, int y) {

        T temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }

}
