package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class Room {

    String name;
    String description;
    String theme;
    ArrayList<Monster> monsters;

    public Room() {
    }

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Room(String name, String description, String theme) {
        this.name = name;
        this.description = description;
        this.theme = theme;
    }

    public Room(String name, String description, String theme, ArrayList<Monster> monsters) {
        this.name = name;
        this.description = description;
        this.theme = theme;
        this.monsters = monsters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", theme='" + theme + '\'' +
                ", monsters=" + monsters +
                '}';
    }

    public void generateTheme() {

        String skeletons = "Skeletons";
        String spiders = "Spiders";
        String oozes = "Oozes";
        String zombies = "Zombies";
        String bandits = "Bandits";
        String automatons = "Automatons";
        String goblins = "Goblins";
        String voidCreatures = "Void";
        String vampires = "Vampires";
        String beasts = "Beasts";
        String wildMen = "Wild-Men";
        String golems = "Golems";
        String demons = "Demons";
        String mages = "Mages";



    }

}
