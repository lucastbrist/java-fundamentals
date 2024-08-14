package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Exercise_01 {
    public static void main(String[] args) {

        String readPath = "src/labs_examples/input_output/files/byte_data";
        String writePath = "src/labs_examples/input_output/files/byte_data_out";

        try (BufferedInputStream fin = new BufferedInputStream(new FileInputStream(readPath));
             BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream(writePath))) {

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = fin.read(buffer)) != -1) {
                fout.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}