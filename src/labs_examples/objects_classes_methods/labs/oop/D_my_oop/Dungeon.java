package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class Dungeon {

    String name;
    ArrayList<Room> rooms;
    int clearedRooms;
    Player player;

    public Dungeon() {
    }

    public Dungeon(String name) {
        this.name = name;
    }

    public Dungeon(String name, ArrayList<Room> rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public Dungeon(String name, ArrayList<Room> rooms, int clearedRooms) {
        this.name = name;
        this.rooms = rooms;
        this.clearedRooms = clearedRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getClearedRooms() {
        return clearedRooms;
    }

    public void setClearedRooms(int clearedRooms) {
        this.clearedRooms = clearedRooms;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void calculateScore() {

        this.getPlayer().setScore(this.getPlayer().getCharacter().getGold()
                + this.getPlayer().getCharacter().weapon.getValue()
                + this.getPlayer().getCharacter().armor.getValue()
                + this.getPlayer().getCharacter().trinket.getValue()
                + this.getPlayer().getCharacter().getLevel()
                + (this.getPlayer().getCharacter().getPotions() * 2)
                + (this.getClearedRooms() * 10));

        if (!this.getPlayer().getCharacter().isDeathTokenUsed()) {
            this.getPlayer().setScore((this.getPlayer().getScore() + 100));
        }

    }

}
