package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate its
 *          dynamic usage.
 */

class Exercise_01 {

    public static void main(String[] args) {

        GenericClass obj = new GenericClass('L', 4);
        System.out.println(obj.getName() + "" + obj.getAssociatedObj());

        obj.setName("42");
        obj.setAssociatedObj('L');
        System.out.println(obj.getName() + "" + obj.getAssociatedObj());

        GenericClass obj2 = new GenericClass(64.88, new GenericClass<>("24.2", 44D));
        System.out.println(obj2.getName() + "" + obj2.getAssociatedObj());

    }

}

class GenericClass<X> {

    X name;
    X associatedObj;

    public GenericClass() {
    }

    public GenericClass(X name) {
        this.name = name;
    }

    public GenericClass(X name, X associatedObj) {
        this.name = name;
        this.associatedObj = associatedObj;
    }

    public X getName() {
        return name;
    }

    public void setName(X name) {
        this.name = name;
    }

    public X getAssociatedObj() {
        return associatedObj;
    }

    public void setAssociatedObj(X associatedObj) {
        this.associatedObj = associatedObj;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "name=" + name +
                ", associatedObj=" + associatedObj +
                '}';
    }
}
