package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        System.out.println("We've got ourselves a list! But there's nothing in it. :(" +
                           "\nTime to add some stuff to it!");
        System.out.println();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Okay, I've added some stuff to it. Let's print it out!");

        System.out.println();
        System.out.println("The list contains these elements:");
        for (Integer i : list) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("You know, I've decided I don't like one of the elements in our list. " +
                           "\nI'm going to remove it!");
        list.remove(3);

        System.out.println();
        System.out.println("Now that I've removed it, I'm going to print the list again," +
                           " so we know what we're working with.");

        System.out.println();
        System.out.println("The list contains these elements:");
        for (Integer i : list) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("""
                You know, I always forget how to count places in these silly\

                lists because they have the bad habit of starting their count at 0! \

                Let ask the computer which element in the list is at the third spot.""");

        System.out.println();
        System.out.println("The computer says the element in the third spot is " + list.get(3) + "!");
        System.out.println("That's because something at the index of '3' is actually in the *4th* place!");

        System.out.println();
        System.out.println("Sometimes I can't see the list, and I don't know if it's empty or not!" +
                           "\nLet me ask the computer. Computer! The list is empty, right?");
        System.out.println("The computer says that's " + list.isEmpty() + " actually!");
        System.out.println("Good to know!");

        System.out.println();
        System.out.println("You know what, though? I think I'm all done with this list. Time to empty it out!");
        list.removeAll(list);

        System.out.println();
        System.out.println("Now that I've done that, let's just make sure it's all empty. Computer!" +
                           "\nThe list is empty, right?");
        System.out.println("The computer says that's " + list.isEmpty() + "!");

        System.out.println();
        System.out.println("Welp, looks like I'm all done here! Thanks for keeping me company!");
    }
}
