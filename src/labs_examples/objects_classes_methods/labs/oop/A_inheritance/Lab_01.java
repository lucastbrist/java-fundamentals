package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Lab_01 {

    public static void main(String[] args) {

        System.out.println("Let's look at a little model of our solar system with just the earth, moon, and sun:");

        CelestialBody sun = new CelestialBody("Sol", "star", 1, 1);
        CelestialInhabitedBody earth = new CelestialInhabitedBody("Terra", "planet", 1, 1, sun,
                "elliptical", 804531149, true);
        CelestialOrbitingBody moon = new CelestialOrbitingBody("Luna", "moon", 0.0123, 0.1654,
                earth, "elliptical");
        SolarSystem solarsystem = new SolarSystem(sun, earth, moon);

        System.out.println(solarsystem);

        System.out.println("Uh oh, there's a rogue black hole! See?:");

        BlackHole blackhole = new BlackHole("Destroyer of Worlds", "black hole", 55.5, 55.5, true);
        System.out.println(blackhole.toString());

        System.out.println("How will this affect our little solar system?!");
        solarsystem.setNewObject(blackhole);

        System.out.println(solarsystem);

        System.out.println("What if the black hole swallowed the Moon?");

        moon.destroyBody();
        System.out.println(solarsystem);

    }

}

class CelestialBody {

    String name;
    String type;
    double mass;
    double gravity;

    public CelestialBody() {
    }

    public CelestialBody(String name) {
        this.name = name;
    }

    public CelestialBody(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public CelestialBody(String name, String type, double mass) {
        this.name = name;
        this.type = type;
        this.mass = mass;
    }

    public CelestialBody(String name, String type, double mass, double gravity) {
        this.name = name;
        this.type = type;
        this.mass = mass;
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    @Override
    public String toString() {
        return "celestialBody{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", mass=" + mass +
                ", gravity=" + gravity +
                '}';
    }

    public void destroyBody() {

        this.setType("Destroyed");
        this.setMass(0);
        this.setGravity(0);
        System.out.println(this);

    }
}

class CelestialOrbitingBody extends CelestialBody {

    CelestialBody orbits;
    String orbitType;

    public CelestialOrbitingBody() {
    }

    public CelestialOrbitingBody(CelestialBody orbits) {
        this.orbits = orbits;
    }

    public CelestialOrbitingBody(CelestialBody orbits, String orbitType) {
        this.orbits = orbits;
        this.orbitType = orbitType;
    }

    public CelestialOrbitingBody(String name, CelestialBody orbits) {
        super(name);
        this.orbits = orbits;
    }

    public CelestialOrbitingBody(String name, CelestialBody orbits, String orbitType) {
        super(name);
        this.orbits = orbits;
        this.orbitType = orbitType;
    }

    public CelestialOrbitingBody(String name, String type, CelestialBody orbits) {
        super(name, type);
        this.orbits = orbits;
    }

    public CelestialOrbitingBody(String name, String type, CelestialBody orbits, String orbitType) {
        super(name, type);
        this.orbits = orbits;
        this.orbitType = orbitType;
    }

    public CelestialOrbitingBody(String name, String type, double mass, CelestialBody orbits) {
        super(name, type, mass);
        this.orbits = orbits;
    }

    public CelestialOrbitingBody(String name, String type, double mass, CelestialBody orbits, String orbitType) {
        super(name, type, mass);
        this.orbits = orbits;
        this.orbitType = orbitType;
    }

    public CelestialOrbitingBody(String name, String type, double mass, double gravity, CelestialBody orbits) {
        super(name, type, mass, gravity);
        this.orbits = orbits;
    }

    public CelestialOrbitingBody(String name, String type, double mass, double gravity, CelestialBody orbits, String orbitType) {
        super(name, type, mass, gravity);
        this.orbits = orbits;
        this.orbitType = orbitType;
    }

    public CelestialBody getOrbits() {
        return orbits;
    }

    public void setOrbits(CelestialBody orbits) {
        this.orbits = orbits;
    }

    public String getOrbitType() {
        return orbitType;
    }

    public void setOrbitType(String orbitType) {
        this.orbitType = orbitType;
    }

    @Override
    public String toString() {
        return "celestialOrbitingBody{" +
                "orbits=" + orbits +
                ", orbitType='" + orbitType + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", mass=" + mass +
                ", gravity=" + gravity +
                '}';
    }

    @Override
    public void destroyBody() {

        this.setType("Destroyed");
        this.setMass(0);
        this.setGravity(0);
        this.setOrbits(new CelestialBody("null"));
        this.setOrbitType("null");
        System.out.println(this);

    }

}

class CelestialInhabitedBody extends CelestialOrbitingBody {

    long population;
    boolean sapience;

    public CelestialInhabitedBody() {
    }

    public CelestialInhabitedBody(long population) {
        this.population = population;
    }

    public CelestialInhabitedBody(long population, boolean sapience) {
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(CelestialBody orbits, long population, boolean sapience) {
        super(orbits);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(CelestialBody orbits, String orbitType, long population, boolean sapience) {
        super(orbits, orbitType);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(String name, CelestialBody orbits, long population, boolean sapience) {
        super(name, orbits);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(String name, CelestialBody orbits, String orbitType, long population, boolean sapience) {
        super(name, orbits, orbitType);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(String name, String type, CelestialBody orbits, long population, boolean sapience) {
        super(name, type, orbits);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(String name, String type, CelestialBody orbits, String orbitType, long population, boolean sapience) {
        super(name, type, orbits, orbitType);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(String name, String type, double mass, CelestialBody orbits, long population, boolean sapience) {
        super(name, type, mass, orbits);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(String name, String type, double mass, CelestialBody orbits, String orbitType, long population, boolean sapience) {
        super(name, type, mass, orbits, orbitType);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(String name, String type, double mass, double gravity, CelestialBody orbits, long population, boolean sapience) {
        super(name, type, mass, gravity, orbits);
        this.population = population;
        this.sapience = sapience;
    }

    public CelestialInhabitedBody(String name, String type, double mass, double gravity, CelestialBody orbits, String orbitType, long population, boolean sapience) {
        super(name, type, mass, gravity, orbits, orbitType);
        this.population = population;
        this.sapience = sapience;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public boolean isSapience() {
        return sapience;
    }

    public void setSapience(boolean sapience) {
        this.sapience = sapience;
    }

    @Override
    public String toString() {
        return "celestialInhabitedBody{" +
                "population=" + population +
                ", sapience=" + sapience +
                ", orbits=" + orbits +
                ", orbitType='" + orbitType + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", mass=" + mass +
                ", gravity=" + gravity +
                '}';
    }
}

class SolarSystem {

    CelestialBody star;
    CelestialOrbitingBody planet1;
    CelestialOrbitingBody planet2;
    CelestialOrbitingBody planet3;
    CelestialOrbitingBody planet4;
    CelestialOrbitingBody planet5;
    CelestialOrbitingBody planet6;
    CelestialOrbitingBody planet7;
    CelestialOrbitingBody planet8;
    CelestialOrbitingBody planet9;
    CelestialOrbitingBody planet1moon1;
    CelestialOrbitingBody planet1moon2;
    CelestialOrbitingBody planet1moon3;
    CelestialOrbitingBody planet2moon1;
    CelestialOrbitingBody planet2moon2;
    CelestialOrbitingBody planet2moon3;
    CelestialOrbitingBody planet3moon1;
    CelestialOrbitingBody planet3moon2;
    CelestialOrbitingBody planet3moon3;
    CelestialOrbitingBody planet4moon1;
    CelestialOrbitingBody planet4moon2;
    CelestialOrbitingBody planet4moon3;
    CelestialOrbitingBody planet5moon1;
    CelestialOrbitingBody planet5moon2;
    CelestialOrbitingBody planet5moon3;
    CelestialOrbitingBody planet6moon1;
    CelestialOrbitingBody planet6moon2;
    CelestialOrbitingBody planet6moon3;
    CelestialOrbitingBody planet7moon1;
    CelestialOrbitingBody planet7moon2;
    CelestialOrbitingBody planet7moon3;
    CelestialOrbitingBody planet8moon1;
    CelestialOrbitingBody planet8moon2;
    CelestialOrbitingBody planet8moon3;
    CelestialOrbitingBody planet9moon1;
    CelestialOrbitingBody planet9moon2;
    CelestialOrbitingBody planet9moon3;
    CelestialBody newObject;

    public SolarSystem() {
    }

    public SolarSystem(CelestialBody star, CelestialOrbitingBody planet1, CelestialOrbitingBody planet1moon1) {
        this.star = star;
        this.planet1 = planet1;
        this.planet1moon1 = planet1moon1;
    }

    public SolarSystem(CelestialBody star, CelestialOrbitingBody planet1, CelestialOrbitingBody planet2,
                       CelestialOrbitingBody planet3, CelestialOrbitingBody planet4, CelestialOrbitingBody planet5,
                       CelestialOrbitingBody planet6, CelestialOrbitingBody planet7, CelestialOrbitingBody planet8,
                       CelestialOrbitingBody planet9, CelestialOrbitingBody planet1moon1, CelestialOrbitingBody
                               planet1moon2, CelestialOrbitingBody planet1moon3, CelestialOrbitingBody planet2moon1,
                       CelestialOrbitingBody planet2moon2, CelestialOrbitingBody planet2moon3, CelestialOrbitingBody
                               planet3moon1, CelestialOrbitingBody planet3moon2, CelestialOrbitingBody planet3moon3,
                       CelestialOrbitingBody planet4moon1, CelestialOrbitingBody planet4moon2, CelestialOrbitingBody
                               planet4moon3, CelestialOrbitingBody planet5moon1, CelestialOrbitingBody planet5moon2,
                       CelestialOrbitingBody planet5moon3, CelestialOrbitingBody planet6moon1, CelestialOrbitingBody
                               planet6moon2, CelestialOrbitingBody planet6moon3, CelestialOrbitingBody planet7moon1,
                       CelestialOrbitingBody planet7moon2, CelestialOrbitingBody planet7moon3, CelestialOrbitingBody
                               planet8moon1, CelestialOrbitingBody planet8moon2, CelestialOrbitingBody planet8moon3,
                       CelestialOrbitingBody planet9moon1, CelestialOrbitingBody planet9moon2, CelestialOrbitingBody
                               planet9moon3, CelestialBody newObject) {
        this.star = star;
        this.planet1 = planet1;
        this.planet2 = planet2;
        this.planet3 = planet3;
        this.planet4 = planet4;
        this.planet5 = planet5;
        this.planet6 = planet6;
        this.planet7 = planet7;
        this.planet8 = planet8;
        this.planet9 = planet9;
        this.planet1moon1 = planet1moon1;
        this.planet1moon2 = planet1moon2;
        this.planet1moon3 = planet1moon3;
        this.planet2moon1 = planet2moon1;
        this.planet2moon2 = planet2moon2;
        this.planet2moon3 = planet2moon3;
        this.planet3moon1 = planet3moon1;
        this.planet3moon2 = planet3moon2;
        this.planet3moon3 = planet3moon3;
        this.planet4moon1 = planet4moon1;
        this.planet4moon2 = planet4moon2;
        this.planet4moon3 = planet4moon3;
        this.planet5moon1 = planet5moon1;
        this.planet5moon2 = planet5moon2;
        this.planet5moon3 = planet5moon3;
        this.planet6moon1 = planet6moon1;
        this.planet6moon2 = planet6moon2;
        this.planet6moon3 = planet6moon3;
        this.planet7moon1 = planet7moon1;
        this.planet7moon2 = planet7moon2;
        this.planet7moon3 = planet7moon3;
        this.planet8moon1 = planet8moon1;
        this.planet8moon2 = planet8moon2;
        this.planet8moon3 = planet8moon3;
        this.planet9moon1 = planet9moon1;
        this.planet9moon2 = planet9moon2;
        this.planet9moon3 = planet9moon3;
        this.newObject = newObject;
    }

    public CelestialBody getStar() {
        return star;
    }

    public void setStar(CelestialBody star) {
        this.star = star;
    }

    public CelestialOrbitingBody getPlanet1() {
        return planet1;
    }

    public void setPlanet1(CelestialOrbitingBody planet1) {
        this.planet1 = planet1;
    }

    public CelestialOrbitingBody getPlanet1moon1() {
        return planet1moon1;
    }

    public void setPlanet1moon1(CelestialOrbitingBody planet1moon1) {
        this.planet1moon1 = planet1moon1;
    }

    public CelestialBody getNewObject() {
        return newObject;
    }

    public void setNewObject(CelestialBody newObject) {
        this.newObject = newObject;
    }

    @Override
    public String toString() {
        return "solarSystem{" +
                "star=" + star +
                ", planet1=" + planet1 +
                ", planet2=" + planet2 +
                ", planet3=" + planet3 +
                ", planet4=" + planet4 +
                ", planet5=" + planet5 +
                ", planet6=" + planet6 +
                ", planet7=" + planet7 +
                ", planet8=" + planet8 +
                ", planet9=" + planet9 +
                ", planet1moon1=" + planet1moon1 +
                ", planet1moon2=" + planet1moon2 +
                ", planet1moon3=" + planet1moon3 +
                ", planet2moon1=" + planet2moon1 +
                ", planet2moon2=" + planet2moon2 +
                ", planet2moon3=" + planet2moon3 +
                ", planet3moon1=" + planet3moon1 +
                ", planet3moon2=" + planet3moon2 +
                ", planet3moon3=" + planet3moon3 +
                ", planet4moon1=" + planet4moon1 +
                ", planet4moon2=" + planet4moon2 +
                ", planet4moon3=" + planet4moon3 +
                ", planet5moon1=" + planet5moon1 +
                ", planet5moon2=" + planet5moon2 +
                ", planet5moon3=" + planet5moon3 +
                ", planet6moon1=" + planet6moon1 +
                ", planet6moon2=" + planet6moon2 +
                ", planet6moon3=" + planet6moon3 +
                ", planet7moon1=" + planet7moon1 +
                ", planet7moon2=" + planet7moon2 +
                ", planet7moon3=" + planet7moon3 +
                ", planet8moon1=" + planet8moon1 +
                ", planet8moon2=" + planet8moon2 +
                ", planet8moon3=" + planet8moon3 +
                ", planet9moon1=" + planet9moon1 +
                ", planet9moon2=" + planet9moon2 +
                ", planet9moon3=" + planet9moon3 +
                ", newObject=" + newObject +
                '}';
    }
}

class BlackHole extends CelestialBody {

    boolean isRogue;

    public BlackHole() {
    }

    public BlackHole(boolean isRogue) {
        this.isRogue = isRogue;
    }

    public BlackHole(String name, boolean isRogue) {
        super(name);
        this.isRogue = isRogue;
    }

    public BlackHole(String name, String type, boolean isRogue) {
        super(name, type);
        this.isRogue = isRogue;
    }

    public BlackHole(String name, String type, double mass, boolean isRogue) {
        super(name, type, mass);
        this.isRogue = isRogue;
    }

    public BlackHole(String name, String type, double mass, double gravity, boolean isRogue) {
        super(name, type, mass, gravity);
        this.isRogue = isRogue;
    }

    public boolean isRogue() {
        return isRogue;
    }

    public void setRogue(boolean rogue) {
        isRogue = rogue;
    }

    @Override
    public String toString() {
        return "blackHole{" +
                "isRogue=" + isRogue +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", mass=" + mass +
                ", gravity=" + gravity +
                '}';
    }
}

