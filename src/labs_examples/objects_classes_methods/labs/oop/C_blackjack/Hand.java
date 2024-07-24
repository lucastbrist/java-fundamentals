package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;
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

    public boolean isGreaterThan21(Hand hand) {

        boolean answer = false;
        int handValue = hand.getHandValue();
        if (handValue >= 21) {
            answer = true;
        }
        return answer;
    }

    public int getHandScore(Hand hand) {

        int count = 0;
        for (Card c : hand.getCards()) {
            count += c.getCardValue();
        }
        
        return count;
    }
}

