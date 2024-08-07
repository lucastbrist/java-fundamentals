package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Armor {

    String name;
    String description;
    int armorRating;
    int strengthModifier;
    int smartsModifier;
    int stealthModifier;
    int healthModifier;
    int spellDamageModifier;
    int value;

    public Armor() {
    }

    public Armor(String name) {
        this.name = name;
    }

    public Armor(String name, String description, int armorRating, int value) {
        this.name = name;
        this.description = description;
        this.armorRating = armorRating;
        this.value = value;
    }

    public Armor(String name, String description, int armorRating, int strengthModifier, int value) {
        this.name = name;
        this.description = description;
        this.armorRating = armorRating;
        this.strengthModifier = strengthModifier;
        this.value = value;
    }

    public Armor(String name, String description, int armorRating, int strengthModifier, int smartsModifier, int value) {
        this.name = name;
        this.description = description;
        this.armorRating = armorRating;
        this.strengthModifier = strengthModifier;
        this.smartsModifier = smartsModifier;
        this.value = value;
    }

    public Armor(String name, String description, int armorRating, int strengthModifier, int smartsModifier, int stealthModifier, int value) {
        this.name = name;
        this.description = description;
        this.armorRating = armorRating;
        this.strengthModifier = strengthModifier;
        this.smartsModifier = smartsModifier;
        this.stealthModifier = stealthModifier;
        this.value = value;
    }

    public Armor(String name, String description, int armorRating, int strengthModifier, int smartsModifier, int stealthModifier, int healthModifier, int value) {
        this.name = name;
        this.description = description;
        this.armorRating = armorRating;
        this.strengthModifier = strengthModifier;
        this.smartsModifier = smartsModifier;
        this.stealthModifier = stealthModifier;
        this.healthModifier = healthModifier;
        this.value = value;
    }

    public Armor(String name, String description, int armorRating, int strengthModifier, int smartsModifier, int stealthModifier, int healthModifier, int spellDamageModifier, int value) {
        this.name = name;
        this.description = description;
        this.armorRating = armorRating;
        this.strengthModifier = strengthModifier;
        this.smartsModifier = smartsModifier;
        this.stealthModifier = stealthModifier;
        this.healthModifier = healthModifier;
        this.spellDamageModifier = spellDamageModifier;
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

    public int getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
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

    public int getSpellDamageModifier() {
        return spellDamageModifier;
    }

    public void setSpellDamageModifier(int spellDamageModifier) {
        this.spellDamageModifier = spellDamageModifier;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", armorRating=" + armorRating +
                ", strengthModifier=" + strengthModifier +
                ", smartsModifier=" + smartsModifier +
                ", stealthModifier=" + stealthModifier +
                ", healthModifier=" + healthModifier +
                ", spellDamageModifier=" + spellDamageModifier +
                ", value=" + value +
                '}';
    }
}