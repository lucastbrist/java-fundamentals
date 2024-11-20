package labs_examples.datastructures.hashmap.labs;

import java.util.*;
import java.util.LinkedList;

/**
 *      HashMaps Exercise_03
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

class exercise_03 {

    public static void main(String[] args) {

        Long totalStartTime = System.currentTimeMillis();

        //LinkedList
        Long linkedListStartTime = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();

        //add
        Long currentTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        Long linkedListAddTime = System.currentTimeMillis() - currentTime;
        System.out.println("Linked List took " + linkedListAddTime + " milliseconds to add.");

        //update
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.set(i, i + 1);
        }
        Long linkedListUpdateTime = System.currentTimeMillis() - currentTime;
        System.out.println("Linked list took " + linkedListUpdateTime + " milliseconds to update.");

        //search
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.contains(i);
        }
        Long linkedListSearchTime = System.currentTimeMillis() - currentTime;
        System.out.println("Linked list took " + linkedListSearchTime + " milliseconds to search.");

        //delete
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        Long linkedListRemoveTime = System.currentTimeMillis() - currentTime;
        System.out.println("Linked list took " + linkedListRemoveTime + " milliseconds to remove.");

        Long linkedListTotalTime = System.currentTimeMillis() - linkedListStartTime;
        System.out.println("Linked list took " + linkedListTotalTime + " milliseconds to complete.");

        //
        ///
        //

        //Stack
        Long stackStartTime = System.currentTimeMillis();
        Stack<Integer> stack = new Stack<>();

        //add
        currentTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            stack.add(i);
        }

        Long stackAddTime = System.currentTimeMillis() - currentTime;
        System.out.println("Stack took " + stackAddTime + " milliseconds to add.");

        //update
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stack.set(i, i + 1);
        }
        Long stackUpdateTime = System.currentTimeMillis() - currentTime;
        System.out.println("Stack took " + stackUpdateTime + " milliseconds to update.");

        //search
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stack.contains(i);
        }
        Long stackSearchTime = System.currentTimeMillis() - currentTime;
        System.out.println("Stack took " + stackSearchTime + " milliseconds to search.");

        //delete
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stack.remove(0);
        }
        Long stackRemoveTime = System.currentTimeMillis() - currentTime;
        System.out.println("Stack took " + linkedListRemoveTime + " milliseconds to remove.");

        Long stackTotalTime = System.currentTimeMillis() - stackStartTime;
        System.out.println("Stack took " + stackTotalTime + " milliseconds to complete.");

        //
        ///
        //

        //Queue
        Long queueStartTime = System.currentTimeMillis();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        //add
        currentTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            queue.add(i);
        }

        Long queueAddTime = System.currentTimeMillis() - currentTime;
        System.out.println("Queue took " + queueAddTime + " milliseconds to add.");

        //update
        currentTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            queue.contains(i);
            count++;
        }
        Long queueUpdateTime = System.currentTimeMillis() - currentTime;
        System.out.println("Queue took " + queueUpdateTime + " milliseconds to update.");

        //search
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            queue.contains(i);
        }
        Long queueSearchTime = System.currentTimeMillis() - currentTime;
        System.out.println("Queue took " + queueSearchTime + " milliseconds to search.");

        //delete
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            queue.remove(i);
        }
        Long queueRemoveTime = System.currentTimeMillis() - currentTime;
        System.out.println("Queue took " + queueRemoveTime + " milliseconds to remove.");

        Long queueTotalTime = System.currentTimeMillis() - queueStartTime;
        System.out.println("Queue took " + queueTotalTime + " milliseconds to complete.");

        //
        ///
        //

        //Hashmap
        Long hashStartTime = System.currentTimeMillis();
        HashMap<Integer, Integer> hash = new HashMap<>();

        //add
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hash.put(i, i);
        }
        Long hashAddTime = System.currentTimeMillis() - currentTime;
        System.out.println("HashMap took " + hashAddTime + " milliseconds to add.");

        //Update
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hash.put(i, i + 1);
        }
        Long hashUpdateTime = System.currentTimeMillis() - currentTime;
        System.out.println("HashMap took " + hashUpdateTime + " milliseconds to update.");

        //search
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hash.containsKey(i);
        }
        Long hashSearchTime = System.currentTimeMillis() - currentTime;
        System.out.println("HashMap took " + hashSearchTime + " milliseconds to search.");

        //delete
        currentTime = System.currentTimeMillis();
        hash.clear();
        Long hashRemoveTime = System.currentTimeMillis() - currentTime;
        System.out.println("HashMap took " + hashRemoveTime + " milliseconds to remove.");

        Long hashTotalTime = System.currentTimeMillis() - hashStartTime;
        System.out.println("HashMap took " + hashTotalTime + " milliseconds to complete.");

        Long totalTime = System.currentTimeMillis() - totalStartTime;
        System.out.println("Program took " + totalTime + " milliseconds to complete.");

    }

}
