package labs_examples.objects_classes_methods.labs.objects;

public class OverloadedConstructorsLab {

    public static void main(String[] args) {

        ExampleObject pojo1 = new ExampleObject();
        ExampleObject pojo2 = new ExampleObject(1);
        ExampleObject pojo3 = new ExampleObject(2, "examples!");
        ExampleObject pojo4 = new ExampleObject(3, "examples again!", false);

    }

}

class ExampleObject {

    int exampleInt;
    String exampleString;
    boolean exampleBoolean;

    public ExampleObject() {
    }

    public ExampleObject(int exampleInt) {
        this.exampleInt = exampleInt;
    }

    public ExampleObject(int exampleInt, String exampleString) {
        this.exampleInt = exampleInt;
        this.exampleString = exampleString;
    }

    public ExampleObject(int exampleInt, String exampleString, boolean exampleBoolean) {
        this.exampleInt = exampleInt;
        this.exampleString = exampleString;
        this.exampleBoolean = exampleBoolean;
    }
}
