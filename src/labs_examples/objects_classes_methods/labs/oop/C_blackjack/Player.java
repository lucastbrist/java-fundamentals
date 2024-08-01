package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    String name;
    Hand hand;
    int potValue;

    public Player() {
        this.name = "";
        this.hand = new Hand();
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(Hand hand) {
        this.hand = hand;
    }

    public Player(int potValue) {
        this.potValue = potValue;
    }

    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public Player(Hand hand, int potValue) {
        this.hand = hand;
        this.potValue = potValue;
    }

    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
    }

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }

    public boolean computerAI(Player computer) {

        return (computer.hand.getHandValue() < 16 + (int)(Math.random()*2)+1);

    }

    public void clearHand() {

        this.hand.cards.clear();

    }

}

