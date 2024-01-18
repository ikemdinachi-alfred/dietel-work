package Logistic_management_Application;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int warehouseId;
    private List<Shipment> shipments;
    private List<Vehicle> vehicles;
    private int totalNumberOfShipment;
    private int totalNumberOfAvailableVehicle;

    public Warehouse(int warehouseId) {
        this.warehouseId = warehouseId;
        this.shipments = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public List<Shipment> getShipments() {
        totalNumberOfShipment++;
        return shipments;
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public String addShipment(Shipment shipment) {
        shipments.add(shipment);
        return "Shipment " + shipment.getShipmentId() + " added to Warehouse " + warehouseId;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle " + vehicle.getVehicleId() + " added to Warehouse " + warehouseId);
    }

    public void displayShipments() {
        System.out.println("Shipments in Warehouse " + warehouseId + ":");
        for (Shipment shipment : shipments) {
            System.out.println(shipment);
        }
    }

    public void displayVehicles() {
        System.out.println("Vehicles in Warehouse " + warehouseId + ":");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public boolean allocateVehicle(Shipment shipment, Vehicle vehicle) {
        if (vehicle.isAvailable()) {
            vehicle.setAvailable(false);
            shipment.markDelivered();
            return true;
        } else {
            System.out.println("Vehicle " + vehicle.getVehicleId() + " is not available for shipment.");
            return false;
        }
    }
}

