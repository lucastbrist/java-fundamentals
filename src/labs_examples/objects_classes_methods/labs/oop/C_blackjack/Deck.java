package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck() {
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

    public void populateDeck(Deck deck) {

        Card aceOfSpades = new Card(new char[]{'♠'}, 1);
        Card twoOfSpades = new Card(new char[]{'♠'}, 2);
        Card threeOfSpades = new Card(new char[]{'♠'}, 3);
        Card fourOfSpades = new Card(new char[]{'♠'}, 4);
        Card fiveOfSpades = new Card(new char[]{'♠'}, 5);
        Card sixOfSpades = new Card(new char[]{'♠'}, 6);
        Card sevenOfSpades = new Card(new char[]{'♠'}, 7);
        Card eightOfSpades = new Card(new char[]{'♠'}, 8);
        Card nineOfSpades = new Card(new char[]{'♠'}, 9);
        Card tenOfSpades = new Card(new char[]{'♠'}, 10);
        Card jackOfSpades = new Card(new char[]{'♠'}, 10);
        Card kingOfSpades = new Card(new char[]{'♠'}, 10);
        Card queenOfSpades = new Card(new char[]{'♠'}, 10);

        Card aceOfDiamonds = new Card(new char[]{'♦'}, 1);
        Card twoOfDiamonds = new Card(new char[]{'♦'}, 2);
        Card threeOfDiamonds = new Card(new char[]{'♦'}, 3);
        Card fourOfDiamonds = new Card(new char[]{'♦'}, 4);
        Card fiveOfDiamonds = new Card(new char[]{'♦'}, 5);
        Card sixOfDiamonds = new Card(new char[]{'♦'}, 6);
        Card sevenOfDiamonds = new Card(new char[]{'♦'}, 7);
        Card eightOfDiamonds = new Card(new char[]{'♦'}, 8);
        Card nineOfDiamonds = new Card(new char[]{'♦'}, 9);
        Card tenOfDiamonds = new Card(new char[]{'♦'}, 10);
        Card jackOfDiamonds = new Card(new char[]{'♦'}, 10);
        Card kingOfDiamonds = new Card(new char[]{'♦'}, 10);
        Card queenOfDiamonds = new Card(new char[]{'♦'}, 10);

        Card aceOfHearts = new Card(new char[]{'♥'}, 1);
        Card twoOfHearts = new Card(new char[]{'♥'}, 2);
        Card threeOfHearts = new Card(new char[]{'♥'}, 3);
        Card fourOfHearts = new Card(new char[]{'♥'}, 4);
        Card fiveOfHearts = new Card(new char[]{'♥'}, 5);
        Card sixOfHearts = new Card(new char[]{'♥'}, 6);
        Card sevenOfHearts = new Card(new char[]{'♥'}, 7);
        Card eightOfHearts = new Card(new char[]{'♥'}, 8);
        Card nineOfHearts = new Card(new char[]{'♥'}, 9);
        Card tenOfHearts = new Card(new char[]{'♥'}, 10);
        Card jackOfHearts = new Card(new char[]{'♥'}, 10);
        Card kingOfHearts = new Card(new char[]{'♥'}, 10);
        Card queenOfHearts = new Card(new char[]{'♥'}, 10);

        Card aceOfClubs = new Card(new char[]{'♣'}, 1);
        Card twoOfClubs = new Card(new char[]{'♣'}, 2);
        Card threeOfClubs = new Card(new char[]{'♣'}, 3);
        Card fourOfClubs = new Card(new char[]{'♣'}, 4);
        Card fiveOfClubs = new Card(new char[]{'♣'}, 5);
        Card sixOfClubs = new Card(new char[]{'♣'}, 6);
        Card sevenOfClubs = new Card(new char[]{'♣'}, 7);
        Card eightOfClubs = new Card(new char[]{'♣'}, 8);
        Card nineOfClubs = new Card(new char[]{'♣'}, 9);
        Card tenOfClubs = new Card(new char[]{'♣'}, 10);
        Card jackOfClubs = new Card(new char[]{'♣'}, 10);
        Card kingOfClubs = new Card(new char[]{'♣'}, 10);
        Card queenOfClubs = new Card(new char[]{'♣'}, 10);


        deck.cards = new Card[]{aceOfSpades, aceOfDiamonds, aceOfHearts, aceOfClubs,
                                twoOfSpades, twoOfDiamonds, twoOfHearts, twoOfClubs,
                                threeOfSpades, threeOfDiamonds, threeOfHearts, threeOfClubs,
                                fourOfSpades, fourOfDiamonds, fourOfHearts, fourOfClubs,
                                fiveOfSpades, fiveOfDiamonds, fiveOfHearts, fiveOfClubs,
                                sixOfSpades, sixOfDiamonds, sixOfHearts, sixOfClubs,
                                sevenOfSpades, sevenOfDiamonds, sevenOfHearts, sevenOfClubs,
                                eightOfSpades, eightOfDiamonds, eightOfHearts, eightOfClubs,
                                nineOfSpades, nineOfDiamonds, nineOfHearts, nineOfClubs,
                                tenOfSpades, tenOfDiamonds, tenOfHearts, tenOfClubs,
                                jackOfSpades, jackOfDiamonds, jackOfHearts, jackOfClubs,
                                kingOfSpades, kingOfDiamonds, kingOfHearts, kingOfClubs,
                                queenOfSpades, queenOfDiamonds, queenOfHearts, queenOfClubs};
    }

}
