package labs_examples.objects_classes_methods.labs.objects;

public class AssociationControllerLab {

    public static void main(String[] args) {

        rocketship rocket = new rocketship("The Enterprise" , 4, 200000, "Mars");
        pilot rocketpilot = new pilot("Captain", "James T. Kirk", 42);
        System.out.println(rocketpilot.name + " is flying " + rocket.rocketname + " to " + rocket.destination + " with" +
                " a crew of " + rocket.passengers + " and a fuel capacity of " + rocket.fuel + ". It is a 5 year trek." +
                " A Star Trek.");


    }
}

class rocketship {

    String rocketname;
    int passengers;
    double fuel;
    String destination;

    public rocketship() {
    }

    public rocketship(String rocketname, int passengers, double fuel, String destination) {
        this.rocketname = rocketname;
        this.passengers = passengers;
        this.fuel = fuel;
        this.destination = destination;
    }

    public String getRocketname() {
        return rocketname;
    }

    public void setRocketname(String rocketname) {
        this.rocketname = rocketname;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "rocketship{" +
                "rocketname='" + rocketname + '\'' +
                ", passengers=" + passengers +
                ", fuel=" + fuel +
                ", destination='" + destination + '\'' +
                '}';
    }
}

class pilot {

    String rank;
    String name;
    int age;

    public pilot() {
    }

    public pilot(String rank, String name, int age) {
        this.rank = rank;
        this.name = name;
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "pilot{" +
                "rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
