package Logistic_management_Application;

public class Vehicle {
    private int vehicleId;
    private String vehicleType;
    private boolean available;

    public Vehicle(int vehicleId, String vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.available = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Type: " + vehicleType + ", Available: " + available;
    }
}


