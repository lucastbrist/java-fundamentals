package labs_examples.packages.examples.package_01.mypackage1;

// This can be imported:
import static labs_examples.packages.examples.package_01.mypackage2.MyClass2.addThings;

// This can't be because it's protected:
//import static labs_examples.packages.examples.package_01.mypackage2.MyClass2.multiplyThings;

public class MyClass1 {

    public static void main(String[] args) {

        // This works:
        sayHello();
        // This works too:
        protectedSayHello();

        // This works:
        System.out.println(addThings(2, 2));

        // This doesn't--it's protected
        // System.out.println(multiplyThings(2, 2));

    }

    public static void sayHello() {

        System.out.println("Hello!");

    }

    protected static void protectedSayHello() {

        System.out.println("Hello! I'm protected!");

    }

}
