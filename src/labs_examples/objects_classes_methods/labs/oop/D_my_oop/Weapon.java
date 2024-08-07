package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Weapon {

    String name;
    String description;
    int damageRating;
    int strengthModifier;
    int value;

    public Weapon() {
    }

    public Weapon(String name) {
        this.name = name;
    }

    public Weapon(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Weapon(String name, String description, int damageRating, int strengthModifier, int value) {
        this.name = name;
        this.description = description;
        this.damageRating = damageRating;
        this.strengthModifier = strengthModifier;
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

    public int getDamageRating() {
        return damageRating;
    }

    public void setDamageRating(int damageRating) {
        this.damageRating = damageRating;
    }

    public int getStrengthModifier() {
        return strengthModifier;
    }

    public void setStrengthModifier(int strengthModifier) {
        this.strengthModifier = strengthModifier;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", damageRating=" + damageRating +
                ", strengthModifier=" + strengthModifier +
                ", value=" + value +
                '}';
    }
}
