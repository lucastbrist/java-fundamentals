package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class Exercise_04 {

    public static void main(String[] args) {

        ArrayList<MyNewObject> myNewObjects = new ArrayList<>();
        String filePath = "src/labs_examples/input_output/examples/csv_parser/POJOToRead.csv";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            System.out.println("Starting try...");

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println("In while...");
                String[] values = line.split(",");
                myNewObjects.add(mapValuesToObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (MyNewObject myObject : myNewObjects) {
            System.out.println("Starting for...");
            System.out.println(myObject.toString());
        }

        String outputPath = "src/labs_examples/input_output/examples/csv_parser/POJOWrite.csv";


    }

    private static MyNewObject mapValuesToObject(String[] values) {

        MyNewObject myObject = new MyNewObject();

        myObject.setName(values[0]);
        myObject.setNumber(Integer.parseInt(values[1]));

        return myObject;

    }

}

class MyNewObject {

    String name;
    int number;

    public MyNewObject() {
    }

    public MyNewObject(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "myObject{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}