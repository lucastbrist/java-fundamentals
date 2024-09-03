package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Monster {

    String name;
    String description;
    String monsterType;
    String moveType;
    int tier;
    int health;
    int damage;
    int armor;

    public Monster() {
    }

    public Monster(String name) {
        this.name = name;
    }

    public Monster(String name, String description, String monsterType, String moveType, int tier, int health, int damage, int armor) {
        this.name = name;
        this.description = description;
        this.monsterType = monsterType;
        this.moveType = moveType;
        this.tier = tier;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
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

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void generateMonster(PlayerCharacter pc, Room room) {

        this.setTier((int) (Math.random() * 10) + 1);
        // if to assign names and tiers and themes >>>
        // if (room.getTheme() == "Skeletons") {
        // } if (this.getTier() == 1) {
        //

        this.setHealth((((int)(Math.random()*10) * pc.getLevel()) * (this.getTier() / 2) + 1));
        this.setDamage((((int)(Math.random()*10) * pc.getLevel()) * (this.getTier() / 2) + 1));
        this.setArmor((((int)(Math.random()*10) * pc.getLevel()) * (this.getTier() / 2)+ 1));

        String skel_T1_MEL_Name = "Skeleton Shambler";
        String skel_T2_ARC_Name = "Skeleton Archer";
        String skel_T2_MEL_Name = "Skeleton Warrior";
        String skel_T3_MAG_Name = "Skeleton Mage";
        String skel_T4_MEL_Name = "Skeleton Knight";
        String skel_T5_MEL_Name = "Skeleton Commander";
        String skel_T6_MEL_Name = "Skeleton King";
        String skel_T6_MAG_Name = "Lich";
        String skel_BOSS_MAG_Name = "The Lich King";
        String skel_BOSS_MEL_Name = "The King of the Dead";
        String skel_BOSS_MEL_Name_02 = "The Reaper";

        String spid_T1_ARC_Name = "Giant Spiderling Spitter";
        String spid_T1_MEL_Name = "Giant Spiderling";
        String spid_T2_ARC_Name = "Giant Spider Spitter";
        String spid_T2_MEL_Name = "Giant Spider";
        String spid_T3_MEL_Name = "Giant Spider Warrio";
        String spid_T4_MAG_Name = "Giant Spider Brood Mother";
        String spid_BOSS_MAG_Name = "Her";

        String ooze_T1_MEL_Name = "Ooze Lumpling";
        String ooze_T2_MEL_Name = "Ooze Warrior";
        String ooze_T3_MAG_Name = "Ooze Mother";
        String ooze_BOSS_MAG_Name = "The Sludge of Suffering";

        String zomb_T1_MEL_Name = "Zombie Crawler";
        String zomb_T2_MEL_Name = "Zombie Shuffler";
        String zomb_T3_MEL_Name = "Zombie Walker";
        String zomb_T4_MEL_Name = "Zombie Abomination";
        String zomb_BOSS_MAG_Name = "The Lumbering Host";

        String band_T1_ARC_Name = "Bandit Wastrel";
        String band_T1_MEL_Name = "Bandit Ruffian";
        String band_T2_ARC_Name = "Bandit Archer";
        String band_T2_MEL_Name = "Bandit Thug";
        String band_T2_MEL_Name_02 = "Bandit Hound";
        String band_T3_MEL_Name = "Bandit Warrior";
        String band_T4_MEL_Name = "Bandit Barbarian";
        String band_T4_MAG_Name = "Bandit Mage";
        String band_T5_MEL_Name = "Bandit Warlord";
        String band_BOSS_MEL_Name = "The Bloody Baron";

        String auto_T1_MEL_Name = "Automaton Worker";
        String auto_T2_ARC_Name = "Automaton Watcher";
        String auto_T2_MEL_Name = "Automaton Warrior";
        String auto_T3_ARC_Name = "Automaton Sentry";
        String auto_T3_MEL_Name = "Automaton Guardian";
        String auto_T4_ARC_Name = "Automaton Sentinel";
        String auto_T4_MEL_Name = "Automaton Centurion";
        String auto_T5_ARC_Name = "Automaton Grenadier";
        String auto_T5_MEL_Name = "Automaton Hulk";
        String auto_T5_MAG_Name = "Automaton Spell-Constructor";
        String auto_BOSS_MEL_Name = "Churning In The Deep";

        String gob_T1_MEL_Name = "Goblin Peon";
        String gob_T2_ARC_Name = "Goblin Slinger";
        String gob_T2_MEL_Name = "Goblin Warrior";
        String gob_T3_ARC_Name = "Goblin Archer";
        String gob_T3_MEL_Name = "Goblin Berserker";
        String gob_T4_ARC_Name = "Goblin Bomber";
        String gob_T4_MAG_Name = "Goblin Shaman";
        String gob_T4_MEL_Name = "Goblin Chief";
        String gob_BOSS_MAG_Name = "The High Priestess of Void's Light";

        String void_T4_MAG_Name = "Void Spawn";
        String void_T5_MAG_Name = "Void Horror";
        String void_T6_MAG_Name = "Void Terror";
        String void_T7_MAG_Name = "Void Harbinger";
        String void_BOSS_MAG_Name = "The Hunger";

        String vamp_T1_MEL_Name = "Vampire Thrall";
        String vamp_T2_MAG_Name = "Vampire Apprentice";
        String vamp_T2_MEL_Name = "Vampire Hound";
        String vamp_T3_MAG_Name = "Vampire Adept";
        String vamp_T4_MEL_Name = "Vampire Duelist";
        String vamp_T5_MAG_Name = "Vampire Master";
        String vamp_T6_MAG_Name = "Vampire Warlock";
        String vamp_T7_MAG_Name = "Vampire Lord";
        String vamp_T8_MAG_Name = "Vampire King";
        String vamp_T9_MEL_Name = "Vampire Demon-King";
        String vamp_BOSS_MAG_Name = "The Red Lady";

        String beast_T1_MEL_Name = "Wild Mange-Beast";
        String beast_T2_MEL_Name = "Wild Beast";
        String beast_T3_MEL_Name = "Wild Beast Alpha";
        String beast_T4_MEL_Name = "Wild Beast Pack Mother";
        String beast_BOSS_MEL_Name = "No-Mane";

        String wild_T1_MEL_Name = "Wild-Man Brawler";
        String wild_T1_ARC_Name = "Wild-Man Slinger";
        String wild_T2_ARC_Name = "Wild-Man Ax-Thrower";
        String wild_T3_MEL_Name = "Wild-Man Raider";
        String wild_T4_MEL_Name = "Wild-Man Madcap";
        String wild_T5_MEL_Name = "Wild-Man Barbarian";
        String wild_T6_MEL_Name = "Wild-Man Raidleader";
        String wild_BOSS_MEL_Name = "The Horn of Hell";

        String golem_T1_MEL_Name = "Mud Golem";
        String golem_T1_MAG_Name = "Mud Golem Spellslinger";
        String golem_T2_MEL_Name = "Rock Golem";
        String golem_T2_MAG_Name = "Rock Golem Spellslinger";
        String golem_T3_MEL_Name = "Ice Golem";
        String golem_T3_MAG_Name = "Ice Golem Spellslinger";
        String golem_T3_MEL_Name_02 = "Storm Golem";
        String golem_T3_MAG_Name_02 = "Storm Golem Spellslinger";
        String golem_T3_MEL_Name_03 = "Fire Golem";
        String golem_T3_MAG_Name_03 = "Fire Golem Spellslinger";
        String golem_T4_MAG_Name = "Void Golem";
        String golem_BOSS_MAG_Name = "Void Incarnate";
        String golem_BOSS_MAG_Name_02 = "Stone Incarnate";
        String golem_BOSS_MAG_Name_03 = "Ice Incarnate";
        String golem_BOSS_MAG_Name_04 = "Storm Incarnate";
        String golem_BOSS_MAG_Name_05 = "Fire Incarnate";

        String demon_T1_MEL_Name = "Demon Imp";
        String demon_T2_ARC_Name = "Demon Arbalest";
        String demon_T2_MEL_Name = "Demon Fighter";
        String demon_T2_MAG_Name = "Demon Conjurer";
        //more

        String mage_T1_MAG_Name = "Novice Ice Mage";
        String mage_T1_MAG_Name_02 = "Novice Storm Mage";
        String mage_T1_MAG_Name_03 = "Novice Fire Mage";
        String mage_T2_MAG_Name = "Apprentice Ice Mage";
        String mage_T2_MAG_Name_02 = "Apprentice Storm Mage";
        String mage_T2_MAG_Name_03 = "Apprentice Fire Mage";
        String mage_T3_MAG_Name = "Adept Ice Mage";
        String mage_T3_MAG_Name_02 = "Adept Storm Mage";
        String mage_T3_MAG_Name_03 = "Adept Fire Mage";
        String mage_T4_MAG_Name = "Master Ice Mage";
        String mage_T4_MAG_Name_02 = "Master Storm Mage";
        String mage_T4_MAG_Name_03 = "Master Fire Mage";
        String mage_T5_MAG_Name = "Conjurer";

    }

    public void monsterSlain(PlayerCharacter pc) {

        System.out.println("You have slain " + this.getName() + "!");
        pc.rollLoot();

    }

}
