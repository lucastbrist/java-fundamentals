package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Player {

    String username;
    PlayerCharacter character;
    int score;

    public Player() {
    }

    public Player(String username) {
        this.username = username;
    }

    public Player(PlayerCharacter character) {
        this.character = character;
    }

    public Player(String username, PlayerCharacter character) {
        this.username = username;
        this.character = character;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PlayerCharacter getCharacter() {
        return character;
    }

    public void setCharacter(PlayerCharacter character) {
        this.character = character;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
