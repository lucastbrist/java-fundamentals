package labs_examples.conditions_loops.labs;

import java.util.Scanner;
import java.lang.String;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {

    public static void main(String[] args) {
        boolean found = false;
        String vowel = "aeiouAEIOU";
        System.out.println("Please type in a word!");
        while (!found) {
            Scanner scanner = new Scanner(System.in);
            String word = scanner.next();
            int count = 0;
            while (!found && (count < word.length())) {
                if (vowel.indexOf(word.charAt(count)) == -1) {
                    count++;
                } else {
                    found = true;
                    System.out.println("Your word was: " + word);
                    System.out.println("The first vowel in this word is " + word.charAt(count));
                }
            }
            if (!found) {
                System.out.println("Type in a word with a vowel, silly.");
            }
        }
    }
}
