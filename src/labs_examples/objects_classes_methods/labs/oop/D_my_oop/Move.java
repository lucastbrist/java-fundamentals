package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Move {

    String name;
    String description;
    int damageModifier;

    public Move() {
    }

    public Move(String name) {
        this.name = name;
    }

    public Move(String name, String description, int damageModifier) {
        this.name = name;
        this.description = description;
        this.damageModifier = damageModifier;
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

    public int getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    @Override
    public String toString() {
        return "Move{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", damageModifier=" + damageModifier +
                '}';
    }

    public static class Spell extends Move {

        boolean isSpell;

        public Spell() {
        }

        public Spell(String name, boolean isSpell) {
            super(name);
            this.isSpell = isSpell;
        }

        public Spell(String name, String description, int damageModifier, boolean isSpell) {
            super(name, description, damageModifier);
            this.isSpell = isSpell;
        }

        public Spell(boolean isSpell) {
            this.isSpell = isSpell;
        }

        public boolean isSpell() {
            return isSpell;
        }

        public void setSpell(boolean spell) {
            isSpell = spell;
        }

        @Override
        public String toString() {
            return "Spell{" +
                    "isSpell=" + isSpell +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", damageModifier=" + damageModifier +
                    '}';
        }
    }

}
