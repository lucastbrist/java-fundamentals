package labs_examples;

class Main {
    public static void main(String[] args) {
        // please use a for loop below to print out every number
        // between 0 & 100 (inclusive)
        for(int count = 0; count <= 100; count = count + 1){
            System.out.println("Count is " + count);
        }
        // please use another for loop below to print out every
        // odd number between 100 and 0 in descending order
        for(int count = 99; count >= 0; count = count - 2){
            System.out.println("Count B is " + count);
        }
        // pleasure demonstrate "nesting" two for loops below
        for(int count = 0; count <= 10; count = count + 1){
            System.out.println("Count is " + count);
            for(int x = 0; x <=10; x = x + 2){
                System.out.println("Count X is " + x);
            }
        }

        // keep your code above this line
    }
}