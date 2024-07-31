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

        deck.deal(player);
        deck.deal(player);

        deck.deal(computer);
        deck.deal(computer);

        boolean running = true;
        boolean playerTurn;
        boolean computerTurn;
        while (running) {

            player.hand.getHandScore();
            computer.hand.getHandScore();

            playerTurn = true;
            while (playerTurn) {

                player.hand.getHandScore();
                System.out.println(player.hand.toString());
                System.out.println("Would you like to draw another card?");

                String answer = scanner.next().toLowerCase();
                if (answer.equals("yes") || answer.equals("ye") || answer.equals("y") || answer.equals("yes!")) {
                    deck.deal(player);
                } else if (answer.equals("no") || answer.equals("n") || answer.equals("no!")) {
                    playerTurn = false;
                } else {
                    System.out.println("Sorry, I didn't understand. Please try again.");
                }
            }

            computerTurn = true;
            while (computerTurn) {
                computer.hand.getHandScore();
                if (player.computerAI(computer)) {
                    deck.deal(computer);
                }
                computerTurn = false;
            }

            player.hand.getHandScore();
            computer.hand.getHandScore();

            if (player.hand.handValue >= 21 || computer.hand.handValue >= 21) {
                running = false;
            }

            if (player.hand.handValue > 21 & computer.hand.handValue > 21) {
                System.out.println("Game over!");
                System.out.println("This is your score:");
                System.out.println(player.hand.toString());
                System.out.println("This was your opponent's score:");
                System.out.println(computer.hand.toString());
                System.out.println("You both lose! Better luck next time!");
            }
            if (player.hand.handValue > 21 & computer.hand.handValue <= 21) {
                System.out.println("Game over!");
                System.out.println("This is your score:");
                System.out.println(player.hand.toString());
                System.out.println("This was your opponent's score:");
                System.out.println(computer.hand.toString());
                System.out.println("You lost! Better luck next time!");
            }
            if (player.hand.handValue <= 21 & computer.hand.handValue > 21) {
                System.out.println("Game over!");
                System.out.println("This is your score:");
                System.out.println(player.hand.toString());
                System.out.println("This was your opponent's score:");
                System.out.println(computer.hand.toString());
                System.out.println("You won! Hope to see you again sometime!");
            }
        }
    }
}