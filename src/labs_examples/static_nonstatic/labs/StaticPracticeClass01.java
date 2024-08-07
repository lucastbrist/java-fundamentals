package labs_examples.static_nonstatic.labs;

import static labs_examples.static_nonstatic.labs.StaticPracticeClass02.sayTwoThings;

public class StaticPracticeClass01 {

    public static int addition(int a, int b) {

        printWorking();
        return (a + b);

    }

    public static void printWorking() {

        System.out.println("Working...");

    }

    public String sayThis(String string) {

        return (string);

    }

// Doesn't work--static methods can't call non-static methods
//    public static void sayThisAndThis(String string, String string2) {
//
//        System.out.println(string);
//        sayThis(string2);
//
//    }

    public static void sayThreeThings(String str, String str2, String str3) {

        System.out.println(str);
        sayTwoThings(str2, str3);

    }

    public static void staticMethod() {

        System.out.println("I am static!");

        // nonstatic from a static context; doesn't work
        // nonstaticMethod();

    }



}
