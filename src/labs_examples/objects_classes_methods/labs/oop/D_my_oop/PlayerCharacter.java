package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Objects;
import java.util.Scanner;

public class PlayerCharacter {

    String name;
    String race;
    String characterClass;
    int level = 1;
    static int baseStrength = 10;
    int strength;
    static int baseSmarts = 10;
    int smarts;
    static int baseStealth = 10;
    int stealth;
    static int baseHealth = 100;
    int health;
    static int baseDamage = 10;
    int damage;
    Weapon weapon;
    Armor armor;
    Trinket trinket;
    static int baseSpellDamage = 10;
    int spellDamage;
    int armorRating;
    int gold;
    int potions;
    boolean deathTokenUsed;

    public PlayerCharacter() {
    }

    public PlayerCharacter(String name) {
        this.name = name;
    }

    public PlayerCharacter(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public PlayerCharacter(String name, String race, String characterClass) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
    }

    public PlayerCharacter(String name, String race, String characterClass, int level, int strength, int smarts, int stealth, int health, int damage, Weapon weapon, Armor armor, Trinket trinket, int spellDamage, int armorRating, int gold, int potions, boolean deathTokenUsed) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.level = level;
        this.strength = strength;
        this.smarts = smarts;
        this.stealth = stealth;
        this.health = health;
        this.damage = damage;
        this.weapon = weapon;
        this.armor = armor;
        this.trinket = trinket;
        this.spellDamage = spellDamage;
        this.armorRating = armorRating;
        this.gold = gold;
        this.potions = potions;
        this.deathTokenUsed = deathTokenUsed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static int getBaseStrength() {
        return baseStrength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public static int getBaseSmarts() {
        return baseSmarts;
    }

    public int getSmarts() {
        return smarts;
    }

    public void setSmarts(int smarts) {
        this.smarts = smarts;
    }

    public static int getBaseStealth() {
        return baseStealth;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public static int getBaseHealth() {
        return baseHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int getBaseDamage() {
        return baseDamage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Trinket getTrinket() {
        return trinket;
    }

    public void setTrinket(Trinket trinket) {
        this.trinket = trinket;
    }

    public static int getBaseSpellDamage() {
        return baseSpellDamage;
    }

    public int getSpellDamage() {
        return spellDamage;
    }

    public void setSpellDamage(int spellDamage) {
        this.spellDamage = spellDamage;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPotions() {
        return potions;
    }

    public void setPotions(int potions) {
        this.potions = potions;
    }

    public boolean isDeathTokenUsed() {
        return deathTokenUsed;
    }

    public void setDeathTokenUsed(boolean deathTokenUsed) {
        this.deathTokenUsed = deathTokenUsed;
    }


    public void levelUp() {

        recalculateAttributes();

        this.setLevel(this.getLevel() + 1);
        int pointsToAllot = this.getLevel() + (this.getSmarts() / 2);
        boolean allotting = true;
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("You've leveled up!");
        System.out.println("You are now Level " + level);

        while (pointsToAllot > 0) {
            while (allotting) {

                System.out.println(stats());
                System.out.println("You have " + pointsToAllot + " points to allot to your stats!");
                System.out.println("How many points would you like to allot to your Strength");

                int answer = scanner.nextInt();
                scanner.nextLine();
                if (answer > pointsToAllot) {
                    System.out.println("You don't have that many points! Please try again.");
                }
                this.setStrength(strength + answer);
                pointsToAllot -= answer;
                allotting = false;
            }
            allotting = true;
            while (allotting) {
                System.out.println(stats());
                System.out.println("You have " + pointsToAllot + " points to allot to your stats!");
                System.out.println("How many points would you like to allot to your Smarts?");
                int answer = scanner.nextInt();
                scanner.nextLine();
                if (answer > pointsToAllot) {
                    System.out.println("You don't have that many points! Please try again.");
                }
                this.setSmarts(smarts + answer);
                pointsToAllot -= answer;
                allotting = false;
            }
            allotting = true;
            while (allotting) {
                System.out.println(stats());
                System.out.println("You have " + pointsToAllot + " points to allot to your stats!");
                System.out.println("How many points would you like to allot to your Stealth?");
                int answer = scanner.nextInt();
                scanner.nextLine();
                if (answer > pointsToAllot) {
                    System.out.println("You don't have that many points! Please try again.");
                }
                this.setStealth(stealth + answer);
                pointsToAllot -= answer;
                allotting = false;
            }
        }

        recalculateAttributes();
        System.out.println("Congratulations! You have finished leveling up.");
        System.out.println(stats());

    }

    public String stats() {

        return "You are a Level " + this.getLevel() + " " + this.getRace() + " " + this.getCharacterClass() +
                " named " + this.getName() + ". You " + "currently have " + (this.getStrength() + this.weapon.getStrengthModifier() + this.armor.getStrengthModifier() + this.trinket.getStrengthModifier()) + " Strength, " +
                (this.getSmarts() + this.armor.getSmartsModifier() + this.trinket.getSmartsModifier()) + " Smarts, and " + (this.getStealth() + this.armor.getStealthModifier() + this.trinket.getStealthModifier()) + " Stealth. Your Health is "
                + this.getHealth() + ", your weapon damage is " + this.getDamage() + ", your spell damage is " +
                this.getSpellDamage() + ", and your armor rating is " + this.getArmorRating() + ". Your weapon is a " + this.weapon.getName() + " and your armor is " + this.armor.getName() + "."
                + " You also have a trinket, " + this.trinket.getName() + ".";

    }

    public void recalculateAttributes() {

        //Big Three
        if (Objects.equals(this.getRace(), "Human")) {
            this.setStrength(getBaseStrength() + 1);
            this.setSmarts(getBaseSmarts() + 1);
            this.setStealth(getBaseStealth() + 1);
        } else if (Objects.equals(this.getRace(), "Elf")) {
            this.setStrength(getBaseStrength() - 1);
            this.setSmarts(getBaseSmarts() + 2);
            this.setStealth(getBaseStealth() + 2);
        } else if (Objects.equals(this.getRace(), "Dwarf")) {
            this.setStrength(getBaseStrength() + 3);
            this.setSmarts(getBaseSmarts() - 2);
            this.setStealth(getBaseStealth());
        } else if (Objects.equals(this.getRace(), "Halfling")) {
            this.setStrength(getBaseStrength() - 2);
            this.setSmarts(getBaseSmarts());
            this.setStealth(getBaseStealth() + 3);
        } else if (Objects.equals(this.getRace(), "Gnome")) {
            this.setStrength(getBaseStrength() - 3);
            this.setSmarts(getBaseSmarts() + 3);
            this.setStealth(getBaseStealth() + 1);
        } else if (Objects.equals(this.getRace(), "Shamble")) {
            this.setStrength(getBaseStrength() - 1);
            this.setSmarts(getBaseSmarts() - 1);
            this.setStealth(getBaseStealth() - 1);
        }

        //Adding item modifiers
        this.setStrength((this.getStrength() + this.weapon.getStrengthModifier() + this.armor.getStrengthModifier() + this.trinket.getStrengthModifier()));
        this.setSmarts((this.getSmarts() + this.armor.getSmartsModifier() + this.trinket.getSmartsModifier()));
        this.setStealth((this.getStealth() + this.armor.getStealthModifier() + this.trinket.getStealthModifier()));

        //Health
        if (Objects.equals(this.getCharacterClass(), "Warrior")) {
            this.setHealth(((this.getStrength() + this.armor.getStrengthModifier() + this.trinket.getStrengthModifier() + this.weapon.getStrengthModifier()) / 2) + getBaseHealth() + this.armor.getHealthModifier() + this.trinket.getHealthModifier() + 10);
        } else {
            this.setHealth(((this.getStrength() + this.armor.getStrengthModifier() + this.trinket.getStrengthModifier() + this.weapon.getStrengthModifier()) / 2) + getBaseHealth() + this.armor.getHealthModifier() + this.trinket.getHealthModifier());
        }

        //Damage
        if (Objects.equals(this.getCharacterClass(), "Warrior")) {
            this.setDamage(this.getStrength() + this.armor.getStrengthModifier() + this.trinket.getStrengthModifier() + this.trinket.getDamageModifier() + getBaseDamage() + this.weapon.getDamageRating() + 3);
        } else {
            this.setDamage(this.getStrength() + this.armor.getStrengthModifier() + this.trinket.getStrengthModifier() + this.trinket.getDamageModifier() + getBaseDamage() + this.weapon.getDamageRating());
        }

        //Spell Damage
        if (Objects.equals(this.getCharacterClass(), "Sorcerer")) {
            this.setSpellDamage(getBaseSpellDamage() + this.getSmarts() + this.armor.getSmartsModifier() + this.armor.getSpellDamageModifier() + this.trinket.getSmartsModifier() + this.trinket.getSpellDamageModifier() + 5);
        } else {
            this.setSpellDamage(getBaseSpellDamage() + this.getSmarts() + this.armor.getSmartsModifier() + this.armor.getSpellDamageModifier() + this.trinket.getSmartsModifier() + this.trinket.getSpellDamageModifier());
        }

        //Armor Rating
        this.setArmorRating((this.armor.getArmorRating() + this.trinket.getArmorRatingModifier()));

    }

    public void characterCreation() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your character's name:");
        this.setName(scanner.nextLine());
        System.out.println("Your character's name is now " + this.getName() + ".");

        System.out.println("Choose your character's race:");
        System.out.println();
        System.out.println("Human: Hailing from the Heartlands, humans are simple and many-vocationed folk." +
                           " Humans receive a +1 to Strength, Smarts, and Stealth.");
        System.out.println();
        System.out.println("Elf: Celestial beings from sidereal forests," +
                           " Elves receive a +2 to Smarts and Stealth but a -1 to Strength.");
        System.out.println();
        System.out.println("Dwarf: Hearty and proud, the deep of the earth are where Dwarves call home." +
                           " Dwarves receive a +3 to Strength but a -2 to Smarts.");
        System.out.println();
        System.out.println("Halfling: A kindhearted and peaceful people, Halflings are known to stay out of trouble." +
                           " Halflings receive a +3 to Stealth but a -2 to Strength.");
        System.out.println();
        System.out.println("Gnome: Gnomes are known the realm over for their diminutive and inventive nature." +
                           " Gnomes receive a +3 to Smarts, a +1 to Stealth, but a -3 to Strength.");
        System.out.println();
        System.out.println("Shamble: Broken and accursed souls, half-wraith and half-ghoul, skeletal and lost, bound to this world for some vengeance or duty." +
                           " Shambles receive a -1 to all stats, but can return from death once.");
        System.out.println();

        System.out.println("You will begin with 10 Strength, Smarts, and Stealth, and 100 Health, after which, " +
                           "racial bonuses and maluses are applied. Health is calculated as Strength / 2 + 100." +
                           "Points to allot at level up is calculated as Smarts / 2 + Level.");
        System.out.println();
        System.out.println("Your Strength score will be added to the damage you do, which is 10 + your weapon's damage modifier.");
        System.out.println("Your Smarts score will be added to your spell damage, which is 10 + the spell's damage modifier.");
        System.out.println("Your Stealth score will affect your ability to remain unseen by monsters.");
        System.out.println();
        System.out.println("Some of these stats will be further modified by your Class.");
        System.out.println();

        System.out.println("Please type  1 for Human, 2 for Elf, 3 for Dwarf, 4 for Halfling, 5 for Gnome, or 6 for Shamble.");

        int choice = scanner.nextInt();

        boolean chosen = false;
        while (!chosen) {
            if (choice == 1) {
                this.setRace("Human");
                chosen = true;
            } else if (choice == 2) {
                this.setRace("Elf");
                chosen = true;
            } else if (choice == 3) {
                this.setRace("Dwarf");
                chosen = true;
            } else if (choice == 4) {
                this.setRace("Halfling");
                chosen = true;
            } else if (choice == 5) {
                this.setRace("Gnome");
                chosen = true;
            } else if (choice == 6) {
                this.setRace("Shamble");
                chosen = true;
            } else {
                System.out.println("You have typed an invalid number. Please try again.");
            }
        }

        System.out.println();
        System.out.println("You are now a " + this.getRace() + ".");
        System.out.println();

        //

        Weapon startingWeaponWarrior = new Weapon();
        startingWeaponWarrior.setName("Rusty Iron Axe");
        startingWeaponWarrior.setDescription("A simple, worn great-axe, eaten through with rust");
        startingWeaponWarrior.setDamageRating(3);
        startingWeaponWarrior.setValue(11);

        Weapon startingWeaponSorcerer = new Weapon();
        startingWeaponSorcerer.setName("Rotting Quarterstaff");
        startingWeaponSorcerer.setDescription("A simple, worn quarterstaff, gangrenous with rot");
        startingWeaponSorcerer.setDamageRating(1);
        startingWeaponSorcerer.setValue(2);

        Weapon startingWeaponThief = new Weapon();
        startingWeaponThief.setName("Rusty Iron Dagger");
        startingWeaponThief.setDescription("A simple, worn dagger, more rust than not");
        startingWeaponThief.setDamageRating(2);
        startingWeaponThief.setValue(5);

        //

        Armor startingArmorWarrior = new Armor();
        startingArmorWarrior.setName("Crude Platemail");
        startingArmorWarrior.setDescription("A simple suit of worn platemail, more a liability than a valuable piece of protection");
        startingArmorWarrior.setArmorRating(3);
        startingArmorWarrior.setValue(91);

        Armor startingArmorSorcerer = new Armor();
        startingArmorSorcerer.setName("Moth-Eaten Robes");
        startingArmorSorcerer.setDescription("A simple robe of worn cloth, frayed and riddled with moth-holes");
        startingArmorSorcerer.setArmorRating(1);
        startingArmorSorcerer.setValue(9);

        Armor startingArmorThief = new Armor();
        startingArmorThief.setName("Padded Clothing");
        startingArmorThief.setDescription("A simple outfit of layered plain clothing, travel-worn and muddied");
        startingArmorThief.setArmorRating(2);
        startingArmorThief.setValue(43);

        //

        Move.Spell startingSpell01 = new Move.Spell();
        startingSpell01.setName("Flamestrike");
        startingSpell01.setDescription("A simple incantation, it strikes a foe with a modest bolt of magical fire");
        startingSpell01.setDamageModifier(3);
        startingSpell01.setSpell(true);

        Move.Spell startingSpell02 = new Move.Spell();
        startingSpell02.setName("Thunderbolt");
        startingSpell02.setDescription("Quick and simple, it strikes a foe with a modest bolt of magical lightning");
        startingSpell02.setDamageModifier(3);
        startingSpell02.setSpell(true);

        Move.Spell startingSpell03 = new Move.Spell();
        startingSpell03.setName("Icicle");
        startingSpell03.setDescription("With a snap, it strikes a foe with a modest bolt of magical ice");
        startingSpell03.setDamageModifier(3);
        startingSpell03.setSpell(true);

        //

        System.out.println("Please choose a class:");
        System.out.println();
        System.out.println("Warrior: Warriors receive a +10 to Health and a +3 to Damage.");
        System.out.println("Sorcerer: Sorcerers receive a +5 to Spell Damage.");
        System.out.println("Thief: Thieves receive a +1 to Stealth and find twice as much gold in loot.");
        System.out.println();
        System.out.println("Please type 1 for Warrior, 2 for Sorcerer, and 3 for Thief.");

        chosen = false;
        choice = scanner.nextInt();

        while (!chosen) {
            if (choice == 1) {
                this.setCharacterClass("Warrior");
                this.setArmor(startingArmorWarrior);
                this.setWeapon(startingWeaponWarrior);
                chosen = true;
            } else if (choice == 2) {
                this.setCharacterClass("Sorcerer");
                this.setArmor(startingArmorSorcerer);
                this.setWeapon(startingWeaponSorcerer);
                chosen = true;
            } else if (choice == 3) {
                this.setCharacterClass("Thief");
                this.setArmor(startingArmorThief);
                this.setWeapon(startingWeaponThief);
                chosen = true;
            } else {
                System.out.println("You have typed an invalid number. Please try again.");
            }
        }

        System.out.println();
        System.out.println("You are now a " + this.getCharacterClass() + ".");
        System.out.println();

        //

        Trinket startingHumanTrinket01 = new Trinket();
            startingHumanTrinket01.setName("Pendant of the Human Spirit");
            startingHumanTrinket01.setDescription("This amulet, a gift from a loved one, bolsters the resiliency inherent to mankind within you");
            startingHumanTrinket01.setArmorRatingModifier(1);
            startingHumanTrinket01.setValue(100);

        Trinket startingHumanTrinket02 = new Trinket();
            startingHumanTrinket02.setName("Belt of Surefire");
            startingHumanTrinket02.setDescription("A flame-varnished leather belt that strengthens the weakness of the human spirit");
            startingHumanTrinket02.setSpellDamageModifier(3);
            startingHumanTrinket02.setValue(100);

        Trinket startingElfTrinket01 = new Trinket();
            startingElfTrinket01.setName("Circlet of Elfdom");
            startingElfTrinket01.setDescription("A delicate tiara imbued with the long-lived majesty of Elf-kind");
            startingElfTrinket01.setSmartsModifier(1);
            startingElfTrinket01.setValue(100);

        Trinket startingElfTrinket02 = new Trinket();
            startingElfTrinket02.setName("Mantle of Other-Kind");
            startingElfTrinket02.setDescription("A silken half-cape blessed with the strength of other races");
            startingElfTrinket02.setHealthModifier(5);
            startingElfTrinket02.setValue(100);

        Trinket startingDwarfTrinket01 = new Trinket();
            startingDwarfTrinket01.setName("Torque of the Under-Mountain Realm");
            startingDwarfTrinket01.setDescription("An iron-forged, bronze-plated collar of rent metal from the genius of Dwarves");
            startingDwarfTrinket01.setArmorRatingModifier(1);
            startingDwarfTrinket01.setValue(100);

        Trinket startingDwarfTrinket02 = new Trinket();
            startingDwarfTrinket02.setName("Buckle of Dwarven Resolve");
            startingDwarfTrinket02.setDescription("A polished belt buckle engraved with the triumphs of Dwarves");
            startingDwarfTrinket02.setSmartsModifier(1);
            startingDwarfTrinket02.setValue(100);

        Trinket startingHalflingTrinket01 = new Trinket();
            startingHalflingTrinket01.setName("Hat of Halfling Wit");
            startingHalflingTrinket01.setDescription("A fashionable field hat from the tanners of Half-folk heartlands");
            startingHalflingTrinket01.setSmartsModifier(1);
            startingHalflingTrinket01.setValue(100);

        Trinket startingHalflingTrinket02 = new Trinket();
            startingHalflingTrinket02.setName("Bangle of Might");
            startingHalflingTrinket02.setDescription("A colorful accessory commemorating the overlooked strength of littler peoples");
            startingHalflingTrinket02.setStrengthModifier(1);
            startingHalflingTrinket02.setValue(100);

        Trinket startingGnomeTrinket01 = new Trinket();
            startingGnomeTrinket01.setName("Spectacles of Invention");
            startingGnomeTrinket01.setDescription("Many-lensed bifocals to aid in all things mechanical, magical, and scientific");
            startingGnomeTrinket01.setSmartsModifier(1);
            startingGnomeTrinket01.setValue(100);

        Trinket startingGnomeTrinket02 = new Trinket();
            startingGnomeTrinket02.setName("Ring of Gnomish Will");
            startingGnomeTrinket02.setDescription("A broad and riveted ring of crude make, but hardy with Gnome strength");
            startingGnomeTrinket02.setDamageModifier(1);
            startingGnomeTrinket02.setValue(100);

        Trinket startingShambleTrinket01 = new Trinket();
            startingShambleTrinket01.setName("Crown of the Lost");
            startingShambleTrinket01.setDescription("A cracked crown of black glass, haunted with sorrow");
            startingShambleTrinket01.setHealthModifier(20);
            startingShambleTrinket01.setValue(100);

        Trinket startingShambleTrinket02 = new Trinket();
            startingShambleTrinket02.setName("Cloak of the Forgotten");
            startingShambleTrinket02.setDescription("A tattered cloak the color of night, moving unlike fabric and more like shadows cast");
            startingShambleTrinket02.setStealthModifier(2);
            startingShambleTrinket02.setValue(100);

        if (Objects.equals(this.getCharacterClass(), "Warrior")) {
            this.setWeapon(startingWeaponWarrior);
        }
        else if (Objects.equals(this.getCharacterClass(), "Sorcerer")) {
            this.setWeapon(startingWeaponSorcerer);
        }
        else if (Objects.equals(this.getCharacterClass(), "Thief")) {
            this.setWeapon(startingWeaponThief);
        }

        boolean trinketPicked = false;
        int pick;
        while (!trinketPicked) {

            System.out.println("You brought a trinket from home to aid you on your venture.");
            System.out.println("Which did you choose?");
            System.out.println();

            if (Objects.equals(this.getRace(), "Human")) {
                System.out.println("Did you pick the " + startingHumanTrinket01.getName() + "? "
                        + startingHumanTrinket01.getDescription() + ", it gives you +"
                        + startingHumanTrinket01.getArmorRatingModifier() + " Armor Rating.");
                System.out.println("Or did you pick the + " + startingHumanTrinket02.getName() + "? "
                        + startingHumanTrinket02.getDescription() + ", it gives you +"
                        + startingHumanTrinket02.getSpellDamageModifier() + " Spell Damage.");
                System.out.println();
                System.out.println("Type 1 for the " + startingHumanTrinket01.getName()
                        + ", or type 2 for the " + startingHumanTrinket02.getName() + ".");
                pick = scanner.nextInt();
                if (pick == 1) {
                    this.setTrinket(startingHumanTrinket01);
                    trinketPicked = true;
                } else if (pick == 2) {
                    this.setTrinket(startingHumanTrinket02);
                    trinketPicked = true;
                } else {
                    System.out.println("You have typed an invalid number. Please try again.");
                }
            } else if (Objects.equals(this.getRace(), "Elf")) {
                System.out.println("Did you pick the " + startingElfTrinket01.getName() + "? "
                        + startingElfTrinket01.getDescription() + ", it gives you +"
                        + startingElfTrinket01.getSmartsModifier() + " Smarts.");
                System.out.println("Or did you pick the " + startingElfTrinket02.getName() + "? "
                        + startingElfTrinket02.getDescription() + ", it gives you +"
                        + startingElfTrinket02.getHealthModifier() + " Health.");
                System.out.println();
                System.out.println("Type 1 for the " + startingElfTrinket01.getName()
                        + ", or type 2 for the " + startingElfTrinket02.getName() + ".");
                pick = scanner.nextInt();
                if (pick == 1) {
                    this.setTrinket(startingElfTrinket01);
                    trinketPicked = true;
                } else if (pick == 2) {
                    this.setTrinket(startingElfTrinket02);
                    trinketPicked = true;
                } else {
                    System.out.println("You have typed an invalid number. Please try again.");
                }
            } else if (Objects.equals(this.getRace(), "Dwarf")) {
                System.out.println("Did you pick the " + startingDwarfTrinket01.getName() + "? "
                        + startingDwarfTrinket01.getDescription() + ", it gives you +"
                        + startingDwarfTrinket01.getArmorRatingModifier() + " Armor Rating.");
                System.out.println("Or did you pick the " + startingDwarfTrinket02.getName() + "? "
                        + startingDwarfTrinket02.getDescription() + ", it gives you +"
                        + startingDwarfTrinket02.getSmartsModifier() + " Smarts.");
                System.out.println();
                System.out.println("Type 1 for the " + startingDwarfTrinket01.getName()
                        + ", or type 2 for the " + startingDwarfTrinket02.getName() + ".");
                pick = scanner.nextInt();
                if (pick == 1) {
                    this.setTrinket(startingDwarfTrinket01);
                    trinketPicked = true;
                } else if (pick == 2) {
                    this.setTrinket(startingDwarfTrinket02);
                    trinketPicked = true;
                } else {
                    System.out.println("You have typed an invalid number. Please try again.");
                }
            } else if (Objects.equals(this.getRace(), "Halfling")) {
                System.out.println("Did you pick the " + startingHalflingTrinket01.getName() + "? "
                        + startingHalflingTrinket01.getDescription() + ", it gives you +"
                        + startingHalflingTrinket01.getSmartsModifier() + " Smarts.");
                System.out.println("Or did you pick the " + startingHalflingTrinket02.getName() + "? "
                        + startingHalflingTrinket02.getDescription() + ", it gives you +"
                        + startingHalflingTrinket02.getStrengthModifier() + " Strength.");
                System.out.println();
                System.out.println("Type 1 for the " + startingHalflingTrinket01.getName()
                        + ", or type 2 for the " + startingHalflingTrinket02.getName() + ".");
                pick = scanner.nextInt();
                if (pick == 1) {
                    this.setTrinket(startingHalflingTrinket01);
                    trinketPicked = true;
                } else if (pick == 2) {
                    this.setTrinket(startingHalflingTrinket02);
                    trinketPicked = true;
                } else {
                    System.out.println("You have typed an invalid number. Please try again.");
                }
            } else if (Objects.equals(this.getRace(), "Gnome")) {
                System.out.println("Did you pick the " + startingGnomeTrinket01.getName() + "? "
                        + startingGnomeTrinket01.getDescription() + ", it gives you +"
                        + startingGnomeTrinket01.getSmartsModifier() + " Smarts.");
                System.out.println("Or did you pick the " + startingGnomeTrinket02.getName() + "? "
                        + startingGnomeTrinket02.getDescription() + ", it gives you +"
                        + startingGnomeTrinket02.getDamageModifier() + " Damage.");
                System.out.println();
                System.out.println("Type 1 for the " + startingGnomeTrinket01.getName()
                        + ", or type 2 for the " + startingGnomeTrinket02.getName() + ".");
                pick = scanner.nextInt();
                if (pick == 1) {
                    this.setTrinket(startingGnomeTrinket01);
                    trinketPicked = true;
                } else if (pick == 2) {
                    this.setTrinket(startingGnomeTrinket02);
                    trinketPicked = true;
                } else {
                    System.out.println("You have typed an invalid number. Please try again.");
                }
            } else if (Objects.equals(this.getRace(), "Shamble")) {
                System.out.println("Did you pick the " + startingShambleTrinket01.getName() + "? "
                        + startingShambleTrinket01.getDescription() + ", it gives you +"
                        + startingShambleTrinket01.getHealthModifier() + " Health.");
                System.out.println("Or did you pick the " + startingShambleTrinket02.getName() + "? "
                        + startingShambleTrinket02.getDescription() + ", it gives you +"
                        + startingShambleTrinket02.getStealthModifier() + " Stealth.");
                System.out.println();
                System.out.println("Type 1 for the " + startingShambleTrinket01.getName()
                        + ", or type 2 for the " + startingShambleTrinket02.getName() + ".");
                pick = scanner.nextInt();
                if (pick == 1) {
                    this.setTrinket(startingShambleTrinket01);
                    trinketPicked = true;
                } else if (pick == 2) {
                    this.setTrinket(startingShambleTrinket02);
                    trinketPicked = true;
                } else {
                    System.out.println("You have typed an invalid number. Please try again.");
                }
            }
        }

        this.recalculateAttributes();

        System.out.println();
        System.out.println(this.stats());

    }

}


