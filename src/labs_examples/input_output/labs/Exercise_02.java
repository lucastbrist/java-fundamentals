package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_02 {
    public static void main(String[] args) {

        String readPath = "src/labs_examples/input_output/files/char_data.txt";
        String writePath = "src/labs_examples/input_output/files/char_data_out.txt";

        try (BufferedReader fin = new BufferedReader(new FileReader(readPath));
             BufferedWriter fout = new BufferedWriter(new FileWriter(writePath))) {

            int ch;

            while ((ch = fin.read()) != -1) {
                if (ch == 'a') {
                    ch = '-';
                } else if (ch == 'e') {
                    ch = '/';
                }
                fout.write(ch);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader fin = new BufferedReader(new FileReader(writePath))) {

            int ch;

            while ((ch = fin.read()) != -1) {
                if (ch == '-') {
                    ch = 'a';
                } else if (ch == '/') {
                    ch = 'e';
                }
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
