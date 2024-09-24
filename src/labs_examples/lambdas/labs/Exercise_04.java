package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demonstrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Example {

    public static void main(String[] args) {

        // 1)
        System.out.println("Task 1");
        IntStream
                .range(1, 16)
                .forEach(System.out::println);

        // 2)
        System.out.println("Task 2");
        System.out.println(IntStream
                .range(1, 16)
                .sum());

        // 3)
        System.out.println("Task 3");
        int sum3 = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(x -> ++x)
                .sum();
        System.out.println(sum3);

        // 4)
        System.out.println("Task 4");
        OptionalDouble sum =
                IntStream
                        .range(1, 100)
                        .filter(x -> x < 10)
                        .average();
        System.out.println(sum);

        // 5)
        System.out.println("Task 5");
          int sum2 = Stream.of(1, 2, 3, 4, 5)
                  .reduce(0, Integer::sum);
        System.out.println(sum2);

        // 6)
        System.out.println("Task 6");
        String filePath = "src/labs_examples/lambdas/examples/stream_api/example_files/bands.txt";
        Stream<String> stringStream = null;
        try {
            stringStream = Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stringStream
                .forEach(System.out::println);
        stringStream.close();

        // 7)
        System.out.println("Task 7");
        String filePath2 = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        Stream<String> stringStream2 = null;
        try {
            stringStream2 = Files.lines(Paths.get(filePath2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stringStream2
                .map(x -> x.split(","))
                .forEach(x -> System.out.print(x[1]));
        stringStream2.close();

        // 8)
        System.out.println("Task 8");
        Stream<String> stringStream3 = null;
        try {
            stringStream3 = Files.lines(Paths.get(filePath2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n" + stringStream3
                .map(x -> x.split(","))
                .mapToDouble(x -> Double.parseDouble(x[2]))
                .sum());
        stringStream3.close();

        // 9)
        System.out.println("Task 9");
        if (Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x -> x < 3)) {
            System.out.println("I did it!");
        }

        // 10)
        System.out.println("Task 10");
        if (Stream.of(1, 2, 3, 4, 5)
                .allMatch(x -> x < 10)) {
            System.out.println("I did it!");
        }

        // 11)
        System.out.println("Task 11");
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());
        System.out.println(list);

    }

}
