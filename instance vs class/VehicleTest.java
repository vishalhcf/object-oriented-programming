class Vehicle {
    // Class variable
    static int registrationFee = 5000;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType +
                ", Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Anita", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
