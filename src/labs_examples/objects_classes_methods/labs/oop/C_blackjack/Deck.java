package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck() {
        this.cards = new Card[52];
        this.usedCards = new ArrayList<>();
    }

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public Deck(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }

    public void populateDeck() {

        char[] suits = new char[]{'♠', '♦', '♥', '♣'};
        int count = 0;
        for (char c : suits) {
            for (int i = 1; i <= 13; i++) {
                this.cards[count++] = new Card(c, i);
            }

        }

    }

    public void deal(Player player) {

        //Do not call this method before first calling populateDeck()!

        int cardNum;
        boolean found = false;
        while (!found) {
        cardNum = (int)(Math.random()*52)+1;
        if (this.usedCards.contains(cardNum)) {
            continue;
            } else {
            this.usedCards.add(cardNum);
            player.hand.cards.add(cards[cardNum]);
            found = true;
            }
        }

    }

}
