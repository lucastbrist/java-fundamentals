package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneLab {
    public static void main(String[] args) {

        engine myEngine = new engine(1, 5700);
        fuselage myFuselage = new fuselage(11.5, 60);
        PASystem myPASystem = new PASystem(false, false);
        seats mySeats = new seats("pleather", false);

    Airplane myAirplane = new Airplane(myEngine, myFuselage, myPASystem, mySeats, "Titanic of the Air",
                                 "Airgate", 60, 40, 12000,2300);

        System.out.println("I am currently flying a " + myAirplane.airline + " plane named '" + myAirplane.name +
                           "' with a wingspan of " + myAirplane.wingspan + " feet and " + myAirplane.passengers +
                           " passengers and a fuselage length of " + myAirplane.fuselage.length +
                           " feet and a turbine count of " + myAirplane.engine.turbineCount + ". It's not going good up here." +
                           " Of the " + myAirplane.fuelCapacity + " gallons of fuel, there is " + myAirplane.currentFuelLevel +
                           " remaining. We are going to crash. Send help.");

    }

}

class engine {

    int turbineCount;
    int thrust;

    public engine() {
    }

    public engine(int turbineCount, int thrust) {
        this.turbineCount = turbineCount;
        this.thrust = thrust;
    }

    public int getTurbineCount() {
        return turbineCount;
    }

    public void setTurbineCount(int turbineCount) {
        this.turbineCount = turbineCount;
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }

    @Override
    public String toString() {
        return "engine{" +
                "turbineCount=" + turbineCount +
                ", thrust=" + thrust +
                '}';
    }
}

class fuselage {

    double cabinPressure;
    double length;

    public fuselage() {
    }

    public fuselage(double cabinPressure, double length) {
        this.cabinPressure = cabinPressure;
        this.length = length;
    }

    public double getCabinPressure() {
        return cabinPressure;
    }

    public void setCabinPressure(double cabinPressure) {
        this.cabinPressure = cabinPressure;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "fuselage{" +
                "cabinPressure=" + cabinPressure +
                ", length=" + length +
                '}';
    }
}

class PASystem {
    boolean isPilotFunny;
    boolean isLegible;

    public PASystem() {
    }

    public PASystem(boolean isPilotFunny, boolean isLegible) {
        this.isPilotFunny = isPilotFunny;
        this.isLegible = isLegible;
    }

    public boolean isPilotFunny() {
        return isPilotFunny;
    }

    public void setPilotFunny(boolean pilotFunny) {
        isPilotFunny = pilotFunny;
    }

    public boolean isLegible() {
        return isLegible;
    }

    public void setLegible(boolean legible) {
        isLegible = legible;
    }

    @Override
    public String toString() {
        return "PASystem{" +
                "isPilotFunny=" + isPilotFunny +
                ", isLegible=" + isLegible +
                '}';
    }
}

class seats {
    String seatMaterial;
    boolean isComfortable;

    public seats() {
    }

    public seats(String seatMaterial, boolean isComfortable) {
        this.seatMaterial = seatMaterial;
        this.isComfortable = isComfortable;
    }

    public String getSeatMaterial() {
        return seatMaterial;
    }

    public void setSeatMaterial(String seatMaterial) {
        this.seatMaterial = seatMaterial;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    @Override
    public String toString() {
        return "seats{" +
                "seatMaterial='" + seatMaterial + '\'' +
                ", isComfortable=" + isComfortable +
                '}';
    }
}

class Airplane {

    engine engine;
    fuselage fuselage;
    PASystem PASystem;
    seats seats;

    String name;
    String airline;
    int wingspan;
    int passengers;
    double fuelCapacity;
    double currentFuelLevel;

    public Airplane() {
    }

    public Airplane(engine engine, fuselage fuselage, PASystem PASystem, seats seats,
                    String name, String airline, int wingspan, int passengers,
                    double fuelCapacity, double currentFuelLevel) {
        this.engine = engine;
        this.fuselage = fuselage;
        this.PASystem = PASystem;
        this.seats = seats;
        this.name = name;
        this.airline = airline;
        this.wingspan = wingspan;
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public engine getEngine() {
        return engine;
    }

    public void setEngine(engine engine) {
        this.engine = engine;
    }

    public fuselage getFuselage() {
        return fuselage;
    }

    public void setFuselage(fuselage fuselage) {
        this.fuselage = fuselage;
    }

    public PASystem getPASystem() {
        return PASystem;
    }

    public void setPASystem(PASystem PASystem) {
        this.PASystem = PASystem;
    }

    public seats getSeats() {
        return seats;
    }

    public void setSeats(seats seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engine=" + engine +
                ", fuselage=" + fuselage +
                ", PASystem=" + PASystem +
                ", seats=" + seats +
                ", name='" + name + '\'' +
                ", airline='" + airline + '\'' +
                ", wingspan=" + wingspan +
                ", passengers=" + passengers +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}