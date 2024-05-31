package labs_examples.conditions_loops;

public class GuessGameCorrection {
public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'R';
        boolean answered = false;

        while (!answered){

        System.out.println("I'm thinking of a letter between A and Z. \nCan you guess it?");

        ch = (char) System.in.read();
        char newline = (char) System.in.read();

        if(ch != answer) {
            System.out.println("Wrong! You should be ashamed of yourself and your family :)");
            while (!answered){
                System.out.println("Try again!");
                ch = (char) System.in.read();
                newline = (char) System.in.read();
            if (ch == answer){
                    answered = true;
                    System.out.println("That's right! Come get your head pats.");
                }
            }
        }
            else {
            answered = true;
            System.out.println("That's right! Come get your head pats.");
            }
        }
    }
}