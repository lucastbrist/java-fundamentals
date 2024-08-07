package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class DungeonCrawlController {

    public static void main(String[] args) {

        Player player = new Player();
        PlayerCharacter pc = new PlayerCharacter();

        System.out.println("Welcome to Dungeon Crawler.");

        System.out.println("Please enter your username:");
        Scanner scanner = new Scanner(System.in);
        player.setUsername(scanner.nextLine());

        System.out.println("Hi, " + player.getUsername() + ".");

        pc.characterCreation();
        player.setCharacter(pc);

        pc.levelUp();

    }

}
