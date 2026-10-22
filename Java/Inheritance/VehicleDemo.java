
class Vehicle {
    protected String vehicleNumber, model, companyName;
    protected int noOfWheels;
    protected double price;

    Vehicle(String vehicleNumber, String model,
            String companyName, int noOfWheels, double price) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.companyName = companyName;
        this.noOfWheels = noOfWheels;
        this.price = price;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Company: " + companyName);
        System.out.println("Wheels: " + noOfWheels);
        System.out.println("Price: " + price);
    }
}

class Bike extends Vehicle {
    private int noOfStands, noOfHelmets;
    private String bikeCategory;

    Bike(String number, String model, String company,
         int wheels, double price, int stands,
         int helmets, String category) {
        super(number, model, company, wheels, price);
        noOfStands = stands;
        noOfHelmets = helmets;
        bikeCategory = category;
    }

    void display() {
        super.display();
        System.out.println("Stands: " + noOfStands);
        System.out.println("Helmets: " + noOfHelmets);
        System.out.println("Category: " + bikeCategory);
    }
}

class Car extends Vehicle {
    private boolean hasPowerSteering, parkingAssistSensors;
    private String driveMode;

    Car(String number, String model, String company,
        int wheels, double price, boolean steering,
        String mode, boolean sensors) {
        super(number, model, company, wheels, price);
        hasPowerSteering = steering;
        driveMode = mode;
        parkingAssistSensors = sensors;
    }

    void display() {
        super.display();
        System.out.println("Power Steering: " + hasPowerSteering);
        System.out.println("Drive Mode: " + driveMode);
        System.out.println("Parking Sensors: " + parkingAssistSensors);
    }
}

class Bus extends Vehicle {
    private int passengerCapacity, standingCapacity;

    Bus(String number, String model, String company,
        int wheels, double price, int passengers, int standing) {
        super(number, model, company, wheels, price);
        passengerCapacity = passengers;
        standingCapacity = standing;
    }

    void display() {
        super.display();
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Standing Capacity: " + standingCapacity);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Bike b = new Bike("MH12AB1234", "Pulsar", "Bajaj",
                          2, 150000, 1, 2, "Sports");

        Car c = new Car("MH14CD5678", "Creta", "Hyundai",
                        4, 1500000, true, "Automatic", true);

        Bus bus = new Bus("MH12EF9012", "City Bus", "Tata",
                          6, 2500000, 40, 20);

        System.out.println("Bike Details:");
        b.display();

        System.out.println("\nCar Details:");
        c.display();

        System.out.println("\nBus Details:");
        bus.display();
    }
}
