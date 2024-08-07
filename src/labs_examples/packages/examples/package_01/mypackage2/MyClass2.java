package labs_examples.packages.examples.package_01.mypackage2;

// importing this doesn't work because protected:
// import static labs_examples.packages.examples.package_01.mypackage1.MyClass1.protectedSayHello;

// But importing this does:
import static labs_examples.packages.examples.package_01.mypackage1.MyClass1.sayHello;

public class MyClass2 {

    public static void main(String[] args) {

        // this works:
        sayHello();
        // this can't run:
        // protectedSayHello();

        // This also works:
        System.out.println(addThings(2, 2));
        System.out.println(multiplyThings(2, 2));

    }

    public static int addThings(int a, int b) {

        return(a + b);

    }

    protected static double multiplyThings(int a, int b) {

        return (a * b);

    }

}
