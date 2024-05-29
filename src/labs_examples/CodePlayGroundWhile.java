package labs_examples;

public class CodePlayGroundWhile{
    //From Code Playground: While & Do-While Loops:
        public static void main(String[] args) {
            // declare a counter variable to use in our while loop
            // (don't forget to increment it as you loop!)
            int count = 1;
            // please use a while loop to print out every 3rd
            // number between 0 and 100 below
            do{
                System.out.println("Count is " + count);
                count = count + 2;
            } while(count <= 100);
            // do some experimenting of your own below
            int countb = 1;
            do{
                System.out.println("Count B is " + countb);
                countb = countb + 3;
            } while(countb <= 100);
            // please keep your code above this line
        }
    }
