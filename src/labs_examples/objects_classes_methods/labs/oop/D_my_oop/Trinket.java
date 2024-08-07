package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Trinket {

    String name;
    String description;
    String nameModifier;
    int strengthModifier;
    int smartsModifier;
    int stealthModifier;
    int healthModifier;
    int damageModifier;
    int spellDamageModifier;
    int armorRatingModifier;
    int value;

    public Trinket() {
    }

    public Trinket(String name) {
        this.name = name;
    }

    public Trinket(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Trinket(String name, String description, int armorRatingModifier, int value) {
        this.name = name;
        this.description = description;
        this.armorRatingModifier = armorRatingModifier;
        this.value = value;
    }

    public Trinket(String name, String description, String nameModifier, int strengthModifier, int smartsModifier, int stealthModifier, int healthModifier, int damageModifier, int spellDamageModifier, int armorRatingModifier, int value) {
        this.name = name;
        this.description = description;
        this.nameModifier = nameModifier;
        this.strengthModifier = strengthModifier;
        this.smartsModifier = smartsModifier;
        this.stealthModifier = stealthModifier;
        this.healthModifier = healthModifier;
        this.damageModifier = damageModifier;
        this.spellDamageModifier = spellDamageModifier;
        this.armorRatingModifier = armorRatingModifier;
        this.value = value;
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

    public String getNameModifier() {
        return nameModifier;
    }

    public void setNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
    }

    public int getStrengthModifier() {
        return strengthModifier;
    }

    public void setStrengthModifier(int strengthModifier) {
        this.strengthModifier = strengthModifier;
    }

    public int getSmartsModifier() {
        return smartsModifier;
    }

    public void setSmartsModifier(int smartsModifier) {
        this.smartsModifier = smartsModifier;
    }

    public int getStealthModifier() {
        return stealthModifier;
    }

    public void setStealthModifier(int stealthModifier) {
        this.stealthModifier = stealthModifier;
    }

    public int getHealthModifier() {
        return healthModifier;
    }

    public void setHealthModifier(int healthModifier) {
        this.healthModifier = healthModifier;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    public int getSpellDamageModifier() {
        return spellDamageModifier;
    }

    public void setSpellDamageModifier(int spellDamageModifier) {
        this.spellDamageModifier = spellDamageModifier;
    }

    public int getArmorRatingModifier() {
        return armorRatingModifier;
    }

    public void setArmorRatingModifier(int armorRatingModifier) {
        this.armorRatingModifier = armorRatingModifier;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Trinket{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", nameModifier='" + nameModifier + '\'' +
                ", strengthModifier=" + strengthModifier +
                ", smartsModifier=" + smartsModifier +
                ", stealthModifier=" + stealthModifier +
                ", healthModifier=" + healthModifier +
                ", damageModifier=" + damageModifier +
                ", spellDamageModifier=" + spellDamageModifier +
                ", armorRatingModifier=" + armorRatingModifier +
                ", value=" + value +
                '}';
    }

}