package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class myObject implements Serializable {

    String name;
    int number;

    public myObject(String name, int number) {
        this.name = name;
        this.number = number;
    }
}

class Exercise_03 {
    public static void main(String[] args) {

        byte[] byteArray = new byte[]{1, 8, 2, 8, 3, 8, 4, 8, 5};

        try (ByteArrayInputStream bin = new ByteArrayInputStream(byteArray);
             ByteArrayOutputStream bout = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bin.read(buffer)) != -1) {
                bout.write(buffer, 0, bytesRead);
            }
            for (byte b : bout.toByteArray()) {
                System.out.println(b);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        MyNewObject newObject = new MyNewObject("Object", 99);

        String outputPath = "src/labs_examples/input_output/files/object_out";

        try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(outputPath))) {

            oout.writeObject(newObject);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(outputPath))) {

            MyNewObject inputObject = (MyNewObject) oin.readObject();
            System.out.println(inputObject.name + inputObject.number);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        char[] charArray = new char[]{'a', 'b', 'c', 'd', 'e'};

        try (CharArrayReader chin = new CharArrayReader(charArray);
             CharArrayWriter chout = new CharArrayWriter()) {

            int charsRead = 0;

            while ((charsRead = chin.read()) != -1) {
                chout.write(charsRead);
            }
            for (char c : chout.toCharArray()) {
                System.out.println(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        MyNewObject myData = new MyNewObject("Object", 99);

        outputPath = "src/labs_examples/input_output/files/data_out";

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream(outputPath))) {

            dout.writeUTF(myData.name);
            dout.writeInt(myData.number);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream(outputPath))) {

            String name = din.readUTF();
            int number = din.readInt();
            System.out.println(name + number);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}