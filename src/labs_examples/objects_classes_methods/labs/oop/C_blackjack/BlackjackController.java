package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        playBlackjack();

    }

    public static void playBlackjack() {

        Player player = new Player();
        Player computer = new Player();

        Deck deck = new Deck();
        deck.populateDeck();

        System.out.println("Hello, Player! Please enter your username:");
        Scanner scanner = new Scanner(System.in);
        player.setName(scanner.next());
        System.out.println("Okay! Your username is " + player.name);

        boolean playerTurn = true;
        String answer;
        player.setPotValue(100);
        computer.setPotValue(100);

        while (player.getPotValue() > 0 & computer.getPotValue() > 0) {

            deck.deal(player);
            deck.deal(player);

            deck.deal(computer);
            deck.deal(computer);

            player.hand.getHandScore();
            computer.hand.getHandScore();

            System.out.println(player.potValue);
            System.out.println("How much would you like to bet?");
            int bet = scanner.nextInt();
            System.out.println("Okay! You have bet " + bet + " dollars.");

            while (playerTurn) {
                System.out.println("It is now the player's turn");
                player.hand.getHandScore();

                System.out.println(player.hand);
                System.out.println(player.potValue);

                if (player.hand.handValue <= 20) {
                    System.out.println("Would you like to draw another card?");
                    scanner.reset();
                    answer = scanner.next().toLowerCase();
                    if (answer.equals("yes") || answer.equals("ye") || answer.equals("y") || answer.equals("yes!")) {
                        deck.deal(player);
                    } else if (answer.equals("no") || answer.equals("n") || answer.equals("no!")) {
                        playerTurn = false;
                    } else {
                        System.out.println("Sorry, I didn't understand. Please try again.");
                    }
                } else {
                    playerTurn = false;
                }

            }

            while (!playerTurn) {
                System.out.println("It is now the computer's turn.");
                computer.hand.getHandScore();
                if (player.computerAI(computer)) {
                    deck.deal(computer);
                }
                playerTurn = true;
            }

            player.hand.getHandScore();
            computer.hand.getHandScore();

            System.out.println("Checking for winners...");

            //Checking if both player and computer has more than 21
            if (player.hand.handValue > 21 & computer.hand.handValue > 21) {
                System.out.println("Game over!");
                System.out.println("This is your score:");
                System.out.println(player.hand.toString());
                System.out.println("This was your opponent's score:");
                System.out.println(computer.hand.toString());
                System.out.println("You both lose! Better luck next time!");
            }
            //Checking if player has more than 21
            else if (player.hand.handValue > 21) {
                System.out.println("Game over!");
                System.out.println("This is your score:");
                System.out.println(player.hand.toString());
                System.out.println("This was your opponent's score:");
                System.out.println(computer.hand.toString());
                player.setPotValue(player.potValue - bet);
                computer.setPotValue(computer.potValue + bet);
                System.out.println("You lost! Better luck next time!");
            }
            //Checking if computer has more than 21
            else if (computer.hand.handValue > 21) {
                System.out.println("Game over!");
                System.out.println("This is your score:");
                System.out.println(player.hand.toString());
                System.out.println("This was your opponent's score:");
                System.out.println(computer.hand.toString());
                player.setPotValue(player.potValue + bet);
                computer.setPotValue(computer.potValue - bet);
                System.out.println("You won! Hope to see you again sometime!");
            }
            //Checking who wins if both have less than 21
            else {
                System.out.println("Game over!");
                System.out.println("This is your score:");
                System.out.println(player.hand.toString());
                System.out.println("This was your opponent's score:");
                System.out.println(computer.hand.toString());
                if (player.hand.handValue > computer.hand.handValue) {
                    player.setPotValue(player.potValue + bet);
                    computer.setPotValue(computer.potValue - bet);
                    System.out.println("You won! Hope to see you again sometime!");
                } else if (computer.hand.handValue > player.hand.handValue) {
                    player.setPotValue(player.potValue - bet);
                    computer.setPotValue(computer.potValue + bet);
                    System.out.println("You lost! Better luck next time.");
                } else {
                    System.out.println("You tied!");
                }
            }
            player.clearHand();
            computer.clearHand();
            System.out.println("Starting next round...");
        }
    }
}