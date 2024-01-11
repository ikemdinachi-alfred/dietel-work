package Logistic_management_Application;

public class Shipment {
    private int shipmentId;
    private String destination;
    private boolean delivered;

    public Shipment(int shipmentId, String destination) {
        this.shipmentId = shipmentId;
        this.destination = destination;
        this.delivered = false;
    }
    public Shipment(){

    }
    public int getShipmentId(){
        return shipmentId;
    }

    public String getShipmentDestination() {
        return destination;
    }
    public boolean isDelivered(){
        return delivered;
    }
    public boolean markDelivered(){
        this.delivered = true;
        return delivered;
    }

    public String tosString(){
        return String.format("""
                ShipmentID : %d
                Shipment Destination : %s
                Shipment Status
                """,shipmentId,destination,delivered) ;
    }

}
