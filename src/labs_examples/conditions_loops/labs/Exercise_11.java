package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 11: Nested for loop
 *
 *      Use a nested for loop to generate a multiplication table for numbers 1-10.
 *      The output should look something like this: (you don't need to worry about perfect alignment)
 *
 *      Hint: use "System.out.print()" rather than "System.out.println()" to print multiple numbers to the same line.
 *
 *      1 |2 |3 |4 |5 |6 |7 |8 |9 |10 |
 *      2 |4 |6 |8 |10|12|14|16|18|20 |
 *      3 |6 |9 |12|15|18|21|24|27|30 |
 *      4 |8 |12|16|20|24|28|32|36|40 |
 *      5 |10|15|20|25|30|35|40|45|50 |
 *      6 |12|18|24|30|36|42|48|54|60 |
 *      7 |14|21|28|35|42|49|56|63|70 |
 *      8 |16|24|32|40|48|56|64|72|80 |
 *      9 |18|27|36|45|54|63|72|81|90 |
 *      10|20|30|40|50|60|70|80|90|100|
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int sum = +i;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i2 = 2; i2 <= 20; i2 = i2 + 2) {
            int sum = +i2;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i3 = 3; i3 <= 30; i3 = i3 + 3) {
            int sum = +i3;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i4 = 4; i4 <= 40; i4 = i4 + 4) {
            int sum = +i4;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i5 = 5; i5 <= 50; i5 = i5 + 5) {
            int sum = +i5;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i6 = 6; i6 <= 60; i6 = i6 + 6) {
            int sum = +i6;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i7 = 7; i7 <= 70; i7 = i7 + 7) {
            int sum = +i7;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i8 = 8; i8 <= 80; i8 = i8 + 8) {
            int sum = +i8;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i9 = 9; i9 <= 90; i9 = i9 + 9) {
            int sum = +i9;
            System.out.print(sum + "|");
        }
        System.out.println();
        for (int i10 = 10; i10 <= 100; i10 = i10 + 10) {
            int sum = +i10;
            System.out.print(sum + "|");
        }
    }
}
