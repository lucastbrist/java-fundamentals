package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to its constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

class Exercise_01 {

    public static void main(String[] args) {

        System.out.println("The number associated with my right thumb is " + FingersOnHands.RIGHT_THUMB.getNumber());

    }

}

enum FingersOnHands {

    LEFT_THUMB(1),
    LEFT_INDEX(2),
    LEFT_MIDDLE(3),
    LEFT_RING(4),
    LEFT_PINKY(5),

    RIGHT_THUMB(6),
    RIGHT_INDEX(7),
    RIGHT_MIDDLE(8),
    RIGHT_RING(9),
    RIGHT_PINKY(10);

    FingersOnHands(int number) {
        this.number = number;
    }

    private final int number;

    public int getNumber() {
        return number;
    }

}