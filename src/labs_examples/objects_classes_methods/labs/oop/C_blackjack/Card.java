package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {

    char suit;
    int cardValue;

    public Card() {
        char suit;
        int cardValue;
    }

    public Card(char suit) {
        this.suit = suit;
    }

    public Card(int cardValue) {
        this.cardValue = cardValue;
    }

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + (suit) +
                ", cardValue=" + cardValue +
                '}';
    }

}
