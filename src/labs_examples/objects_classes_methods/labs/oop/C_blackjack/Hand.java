package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards = new ArrayList<>();
    int handValue;

    public Hand() {
    }

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        this.getHandScore();
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }

    public boolean isGreaterThan21() {

        this.getHandScore();
        return (this.handValue >= 21);
    }

    public int getHandScore() {

        int count = 0;
        for (Card c : this.cards) {
            if (c.getCardValue() >= 10) {
                count += 10;
            } else {
                count += c.getCardValue();
            }
        }
        this.handValue = count;
        return count;
    }
}

