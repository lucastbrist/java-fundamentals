package labs_examples.objects_classes_methods.labs.methods;

import videos_source_code.classes.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    // Main
    public static void main(String[] args) {
        // Method Overloading demonstration:
        System.out.println("What's 1 + 2? " + addition(1, 2));
        System.out.println("Okay, and 1 + 2 + 3? " + addition(1, 2, 3));
        System.out.println("And 1 + 2 + 3 + 4? " + addition(1, 2, 3, 4));
        //---

        // Pass By Value
        int a = 1;
        System.out.println("Now I'm going to demonstrate passing by value. Before calling this method, int a = " + a);
        System.out.println("Now I'll call a method that changes a to " + PassByValue(a));
        System.out.println("But now that I'm back in the main method, if I call int a again, it will once again = " + a);
        //---

        //Pass By Reference
        Person myPerson = new Person(23, 69, "Lucas");
        System.out.println("Objects in Java, though, are a bit more complex than primitive data types like integers." +
                           " For example; here we have a Person object modeled after me: " + myPerson.toString());
        System.out.println("I'm going to call a method that changes my name, and then print out that information again.");
        ChangePersonName(myPerson, "Lucas Brist");
        System.out.println("I should now have a last name! Let's see: " + myPerson.toString());
        System.out.println("Even though I'm not in the method where I changed the name anymore, " +
                           "it is an Object, and the info gets saved. This is called Passing By Reference.");
        //---

        // Largest of 4 Numbers demonstration:
        System.out.println("Which number between 1, 2, 3, and 4 is the largest?" + LargestOf(1, 2, 3, 4));
        //---

        // Count All Consonants
        System.out.println("The amount of consonants in the phrase 'All roads lead to Rome' is "
                           + CountConsonants("All roads lead to Rome"));
        //---

        // Determine if a Number Is Prime
        System.out.println("Is 33 a prime number? " + IsPrime(33));
        System.out.println("Interesting. Well, is 29 a prime number, at least? " + IsPrime(5));

        // Return Highest And Lowest Numbers of An Array
        int[] array = new int[]{4, 10, 99, 1, 36};
        System.out.println("So I've got this array, but I don't know the highest and lowest numbers that are in it!");
        System.out.println("Let's figure it out. First, the array: " + Arrays.toString(array));
        System.out.println("Now, the method! Tell us, Java, what are the highest and lowest numbers " +
                " in that array? " + Arrays.toString(GetHighestLowest(array)));
        System.out.println("Thanks, Java!");
        //---

        // Array Less Than Max, Divisible By Two Numbers, Then Print demonstration:
        System.out.println("Computer, please print all the numbers between " +
                           "0 and 100 that are divisible by both 2 and 3. " + DivisibleMaxLength(100, 2, 3));
        System.out.println("Thank you! Now, how many numbers is that? "
                           + DivisibleMaxLength(100, 2, 3).size());
        //---

        // Reverse an Array In Place demonstration:
        System.out.println("Computer, please reverse '1, 2, 3.' " + Arrays.toString(ReverseArray(new int[]{1, 2, 3})));
        //---

    }
    //---


    // Method Overloading:
    static int addition(int a, int b){
        return a + b;
    }
    static int addition(int a, int b, int c){
        return a + b + c;
    }
    static int addition(int a, int b, int c, int d){
        return a + b + c + d;
    }
    //---


    // Pass by Value
    static int PassByValue(int a){
        a = 10;
        return a;
    }
    //---


    // Pass by Reference
    static void ChangePersonName(Person a, String newname){
        a.name = newname;
    }
    //---


    // Largest of 4 Numbers
    static String LargestOf(int a, int b, int c, int d){
        String notfound = "Two or more of these numbers are the same.";
        if (a > b && a > c && a > d) {
            return a + " is the largest number.";
        }
        if (b > a && b > c && b > d) {
            return b + " is the largest number.";
        }
        if (c > a && c > b && c > d) {
            return c + " is the largest number.";
        }
        if (d > a && d > b && d > c) {
            return d + " is the largest number.";
        }
        else {
            return notfound;
        }
    }
    //---


    // Count All Consonants
    static int CountConsonants(String input){
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            String index = String.valueOf(input.charAt(i));
            if (consonants.contains(index)) {
                count++;
            }
        }
        return count;
    }
    //---


    // Determine if a Number is a Prime
    static boolean IsPrime(int a){
        for (int i = 2; i <= a / 2; i++){
            if (a%i == 0) {
                return false;
            }
        }
        return true;
    }
    //---


    // Return Highest And Lowest Numbers of An Array
    static int[] GetHighestLowest(int[] array){
        int lowest = array[0];
        int highest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest)
                lowest = array[i];
            if (array[i] > highest)
                highest = array[i];
        }
        int[] highestlowest = {lowest, highest};
        return highestlowest;
    }
    //---


    // Array Less Than Max, Divisible By Two Numbers, Then Print
    static ArrayList<Integer> DivisibleMaxLength(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= maxNum; i++){
            if(i%divisor1 == 0 && i%divisor2 == 0) {
                result.add(i);
            }
        }
        return result;
    }
    //---


    //Reverse An Array In Place
    static int[] ReverseArray(int[] intArray){
        int temp;
        for (int i = 0; i <= intArray.length / 2; i++){
            temp = intArray[i];
            intArray[i] = intArray[(intArray.length - 1) - i];
            intArray[(intArray.length - 1) - i] = temp;
        }
        return intArray;
    }
    //---


    //end
}
