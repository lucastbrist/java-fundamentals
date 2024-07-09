package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneLab {
    public static void main(String[] args) {

        airplaneEngine myAirplaneEngine = new airplaneEngine(1, 5700);
        fuselage myFuselage = new fuselage(11.5, 60);
        PASystem myPASystem = new PASystem(false, false);
        seats mySeats = new seats("pleather", false);

    Airplane myAirplane = new Airplane(myAirplaneEngine, myFuselage, myPASystem, mySeats, "Titanic of the Air",
                                 "Airgate", 60, 40, 12000,2300);

        System.out.println("I am currently flying a " + myAirplane.getAirline() + " plane named '" + myAirplane.getName() +
                           "' with a wingspan of " + myAirplane.getWingspan() + " feet and " + myAirplane.getPassengers() +
                           " passengers and a fuselage length of " + myAirplane.getFuselage().getLength() +
                           " feet and a turbine count of " + myAirplane.getEngine().getTurbineCount() + ". It's not going good up here." +
                           " Of the " + myAirplane.getFuelCapacity() + " gallons of fuel, there is " + myAirplane.getCurrentFuelLevel() +
                           " remaining. We are going to crash. Send help.");

        System.out.println("Computer, print the information for this plane so that the people trying to help can have " +
                           "all the info they need!");
        System.out.println("Computer: OK. Here:");
        System.out.println(myAirplane.toString());

    }

}

class airplaneEngine {

    private int turbineCount;
    private int thrust;

    public airplaneEngine() {
    }

    public airplaneEngine(int turbineCount, int thrust) {
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
        return "airplaneEngine{" +
                "turbineCount=" + turbineCount +
                ", thrust=" + thrust +
                '}';
    }
}

class fuselage {

    private double cabinPressure;
    private double length;

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
    private boolean isPilotFunny;
    private boolean isLegible;

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
    private String seatMaterial;
    private boolean isComfortable;

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

    private airplaneEngine airplaneEngine;
    private fuselage fuselage;
    private PASystem PASystem;
    private seats seats;

    private String name;
    private String airline;
    private int wingspan;
    private int passengers;
    private double fuelCapacity;
    private double currentFuelLevel;

    public Airplane() {
    }

    public Airplane(airplaneEngine airplaneEngine, fuselage fuselage, PASystem PASystem, seats seats,
                    String name, String airline, int wingspan, int passengers,
                    double fuelCapacity, double currentFuelLevel) {
        this.airplaneEngine = airplaneEngine;
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

    public airplaneEngine getEngine() {
        return airplaneEngine;
    }

    public void setEngine(airplaneEngine airplaneEngine) {
        this.airplaneEngine = airplaneEngine;
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
                "airplaneEngine=" + airplaneEngine +
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