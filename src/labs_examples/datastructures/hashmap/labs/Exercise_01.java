package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate your mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

class Exercise_01 {

    public static void main(String[] args) {

        System.out.println("Let's make a hashmap.");
        HashMap peopleAgeHashmap = new HashMap<>();

        System.out.println("Let's put my own name and age in this thing.");
        peopleAgeHashmap.put("Lucas", 23);

        System.out.println("Let's get my age back.");
        System.out.println(peopleAgeHashmap.get("Lucas"));

        HashMap peopleAgeHashmapTwo = new HashMap<>();
        peopleAgeHashmapTwo.put("Brucas", 32);
        peopleAgeHashmap.putAll(peopleAgeHashmapTwo);

        System.out.println("How big is the hashmap?");
        System.out.println(peopleAgeHashmap.size());

        System.out.println("Does it contain the name Lucas?");
        System.out.println(peopleAgeHashmap.containsKey("Lucas"));
        System.out.println("Does it contain the number 32?");
        System.out.println(peopleAgeHashmap.containsValue(32));

        System.out.println("Let's print the keys--the two names.");
        System.out.println(peopleAgeHashmap.keySet());

        System.out.println("Let's print both the keys and their associated values (their ages).");
        System.out.println(peopleAgeHashmap.entrySet());

        System.out.println("Let's add myself yet again.");
        peopleAgeHashmap.putIfAbsent("Lucas", 23);

        System.out.println("And print elements again!");
        System.out.println(peopleAgeHashmap.entrySet());
        System.out.println("It didn't work! Cause I'm already there!");

        System.out.println("Let's get rid of this \"Brucas\" guy.");
        peopleAgeHashmap.remove("Brucas");

        System.out.println("Let's change my age.");
        peopleAgeHashmap.replace("Lucas", 23, 18);
        System.out.println(peopleAgeHashmap.get("Lucas"));
        System.out.println("I'm young again!");

        System.out.println("Let's add Brucas back and a couple others, then print!");
        peopleAgeHashmap.put("Brucas", 32);
        peopleAgeHashmap.put("Mark Hamill", 73);
        peopleAgeHashmap.put("Luke Skywalker", 20);

        System.out.println("Now let's print them all!");
        peopleAgeHashmap.forEach((K, V) -> System.out.println("Key = " + K + "Value = " + V));

        System.out.println("Alright, I'm all done with this one. Time to clear it!");
        peopleAgeHashmap.clear();

    }

}
