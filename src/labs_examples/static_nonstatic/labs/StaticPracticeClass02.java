package labs_examples.static_nonstatic.labs;

import static labs_examples.static_nonstatic.labs.StaticPracticeClass01.sayThreeThings;

public class StaticPracticeClass02 {

    public static void sayTwoThings(String str, String str2) {

        System.out.println(str);
        System.out.println(str2);

    }

    public void nonstaticMethod(){

        System.out.println("I am not static!");

    }

    public void nonstaticTwo() {

        nonstaticMethod();
        System.out.println("I am also not static!");

    }

    public void callAnotherNonstatic() {

        // Why doesn't this work?
        // sayThis("Hello, I am not static!");

    }

    public void callingStatic() {

        sayTwoThings("Hello,","I am nonstatic, but the method saying me is static!");

    }

    public void callingStaticInAnotherClass() {

        sayThreeThings("Hello","I am","static!");

    }

}
