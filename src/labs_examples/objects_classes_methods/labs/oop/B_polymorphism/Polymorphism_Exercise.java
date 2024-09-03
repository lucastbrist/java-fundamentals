package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Polymorphism_Exercise {

    public int subtractStuff(int a, int b) {

        return a - b;

    }

    public int subtractStuff(int a, int b, int c) {

        return a - b - c;

    }

    public interface Videogame {

        String name();
        String platform();
        String genre();
        int ageRangeLower();
        int ageRangeUpper();

    }

    class Halo implements Videogame {


        @Override
        public String name() {
            return "Halo: Combat Evolved";
        }

        @Override
        public String platform() {
            return "Xbox";
        }

        @Override
        public String genre() {
            return "First Person Shooter";
        }

        @Override
        public int ageRangeLower() {
            return 18;
        }

        @Override
        public int ageRangeUpper() {
            return 99;
        }

    }

}