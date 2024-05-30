package labs_examples;

public class SwitchStatementFun {
    public static void main(String[] args) {
        // write your code below this line
        int floor = 5;
        switch(floor){
            case 1:
                System.out.println("You have arrived at Floor 1.");
                break;
            case 2:
                System.out.println("You have arrived at Floor 2.");
                break;
            case 3:
                System.out.println("You have arrived at Floor 3.");
                break;
            case 4:
                System.out.println("You have arrived at Floor 4.");
                break;
            default:
                System.out.println("There is no floor. You are lost. May God help you.");
                break;
        }

        // keep your code above this line
    }
}